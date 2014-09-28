package com.haiyue.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haiyue.dao.BaseDaoI;
import com.haiyue.pageModel.DataGrid;
import com.haiyue.pageModel.User;
import com.haiyue.pojo.Trole;
import com.haiyue.pojo.TroleTresource;
import com.haiyue.pojo.Tuser;
import com.haiyue.pojo.TuserTrole;
import com.haiyue.service.UserServiceI;



@Service("userService")
public class UserServiceImpl implements UserServiceI {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

	private BaseDaoI<User> userDao;
	private BaseDaoI<Role> roleDao;
	private BaseDaoI<TuserTrole> userRoleDao;

	public BaseDaoI<TuserTrole> getUserRoleDao() {
		return userRoleDao;
	}

	@Autowired
	public void setUserRoleDao(BaseDaoI<TuserTrole> userRoleDao) {
		this.userRoleDao = userRoleDao;
	}

	public BaseDaoI<Trole> getRoleDao() {
		return roleDao;
	}

	@Autowired
	public void setRoleDao(BaseDaoI<Trole> roleDao) {
		this.roleDao = roleDao;
	}

	public BaseDaoI<Tuser> getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(BaseDaoI<Tuser> userDao) {
		this.userDao = userDao;
	}

	/* (non-Javadoc)
	 * @see com.haiyue.service.UserServiceI#save(com.haiyue.pageModel.User)
	 * 保存用户
	 */
	public User save(User user) {
		Tuser t = new Tuser();
		BeanUtils.copyProperties(user, t, new String[] { "pwd" });
		t.setId(UUID.randomUUID().toString());
		t.setPwd(user.getPwd());
		t.setCreatedatetime(new Date());
		userDao.save(t);
		if (user.getRoleIds() != null) {
			String roleIds = "";
			String roleNames = "";
			for (String id : user.getRoleIds().split(",")) {
				Trole r = roleDao.get(Trole.class, id);
				if (r != null) {
					TuserTrole ur = new TuserTrole();
					ur.setId(UUID.randomUUID().toString());
					ur.setTrole(r);
					ur.setTuser(t);
					userRoleDao.save(ur);
					if(roleIds.length() > 0){
						roleIds += ",";
						roleNames += ",";
					}
					roleIds += r.getId();
					roleNames += r.getText();
				}
			}
			user.setRoleNames(roleNames);
			user.setRoleIds(roleIds);
		}
		BeanUtils.copyProperties(t, user);
		return user;
	}

	/* (non-Javadoc)
	 * @see com.haiyue.service.UserServiceI#find(com.haiyue.pageModel.User)
	 * 查找用户
	 */
	public User find(User user) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", user.getName());
		params.put("pwd", user.getPwd());
		Tuser t = userDao.get("from Tuser t where t.name=:name and t.pwd=:pwd", params);
		if (t != null) {
			BeanUtils.copyProperties(t,user);
			String roleIds = "";
			String roleNames = "";
			String resourceIds = "";
			String resourceNames = "";
			List<String> resourceUrls = new ArrayList<String>();
			//找到用户 获取用户的角色
			Set<TuserTrole> ur = t.getTuserTroles();
			if (ur != null && !ur.isEmpty()) {
				for (TuserTrole tur : ur) {
					if (roleIds.length() > 0) {
						roleIds += ",";
						roleNames += ",";
					}
					roleIds += tur.getTrole().getId();
					roleNames += tur.getTrole().getText();
					// 获得当前角色所有资源
					Set<TroleTresource> rr = tur.getTrole().getTroleTresources();
					if (rr != null && !rr.isEmpty()) {
						for (TroleTresource trr : rr) {
							if (resourceIds.length() > 0) {
								resourceIds += ",";
								resourceNames += ",";
							}
							resourceIds += trr.getTresource().getId();
							resourceNames += trr.getTresource().getText();
							resourceUrls.add(trr.getTresource().getUrl());
						}
					}
				}
			}
			user.setRoleIds(roleIds);
			user.setRoleNames(roleNames);
			user.setResourceIds(resourceIds);
			user.setResourceNames(resourceNames);
			user.setResourceUrls(resourceUrls);
			return user;
		}
		return null;
	}

	public DataGrid datagrid(User user) {
		DataGrid dg = new DataGrid();
		String hql = "from Tuser t ";
		Map<String, Object> params = new HashMap<String, Object>();
		hql = addWhere(user, hql, params);
		String totalHql = "select count(*) " + hql;
		hql = addOrder(user, hql);
		List<Tuser> l = userDao.find(hql, params, user.getPage(), user.getRows());
		List<User> nl = new ArrayList<User>();
		changeModel(l, nl);
		dg.setTotal(userDao.count(totalHql, params));
		dg.setRows(nl);
		return dg;
	}

	private void changeModel(List<Tuser> l, List<User> nl) {
		if (l != null && l.size() > 0) {
			for (Tuser t : l) {
				User u = new User();
				BeanUtils.copyProperties(t, u);
				Set<TuserTrole> s = t.getTuserTroles();
				if (s != null && !s.isEmpty()) {
					String roleIds = "";
					String roleNames = "";

					for (TuserTrole tt : s) {
						if (roleIds.length() > 0) {
							roleIds += ",";
							roleNames += ",";
						}
						roleIds += tt.getTrole().getId();
						roleNames += tt.getTrole().getText();
					}

					u.setRoleIds(roleIds);
					u.setRoleNames(roleNames);
				}

				nl.add(u);
			}
		}
	}

	private String addOrder(User user, String hql) {
		if (user.getSort() != null) {
			hql += " order by " + user.getSort() + " " + user.getOrder();
		}
		return hql;
	}

	private String addWhere(User user, String hql, Map<String, Object> params) {
		hql += " where 1=1 ";
		if (user.getCreatedatetimeStart() != null) {
			hql += " and t.createdatetime >= :getCreatedatetimeStart";
			params.put("getCreatedatetimeStart", user.getCreatedatetimeStart());
		}
		if (user.getCreatedatetimeEnd() != null) {
			hql += " and t.createdatetime <= :getCreatedatetimeEnd";
			params.put("getCreatedatetimeEnd", user.getCreatedatetimeEnd());
		}
		if (user.getModifydatetimeStart() != null) {
			hql += " and t.modifydatetime >= :getModifydatetimeStart";
			params.put("getModifydatetimeStart", user.getModifydatetimeStart());
		}
		if (user.getModifydatetimeEnd() != null) {
			hql += " and t.modifydatetime <= :getModifydatetimeEnd";
			params.put("getModifydatetimeEnd", user.getModifydatetimeEnd());
		}
		if (user.getQ() != null && !user.getQ().trim().equals("")) {
			hql += " and t.name like :name ";
			params.put("name", "%%" + user.getQ().trim() + "%%");
		}
		if (user.getName() != null && !user.getName().trim().equals("")) {
			hql += " and t.name like :name";
			params.put("name", "%%" + user.getName().trim() + "%%");
		}
		return hql;
	}

	public List<User> combobox(User user) {
		String hql = "from Tuser t ";
		Map<String, Object> params = new HashMap<String, Object>();
		hql = addWhere(user, hql, params);
		hql += " order by name";
		List<Tuser> l = userDao.find(hql, params, 1, 10);
		List<User> nl = new ArrayList<User>();
		changeModel(l, nl);
		return nl;
	}

	public void remove(String ids) {
		for (String id : ids.split(",")) {
			Tuser t = userDao.get(Tuser.class, id);
			if (t != null) {
				userDao.delete(t);
			}
		}
	}

	public User edit(User user) {
		Tuser t = userDao.get(Tuser.class, user.getId());
		if (t != null) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("tuser", t);
			userRoleDao.executeHql("delete TuserTrole t where t.tuser=:tuser", params);

			BeanUtils.copyProperties(user, t, new String[] { "pwd", "id" });
			if (t.getModifydatetime() == null) {
				t.setModifydatetime(new Date());
			}
			BeanUtils.copyProperties(t, user);

			if (user.getRoleIds() != null) {
				String roleIds = "";
				String roleNames = "";
				for (String id : user.getRoleIds().split(",")) {
					Trole r = roleDao.get(Trole.class, id);
					if (r != null) {
						TuserTrole ur = new TuserTrole();
						ur.setId(UUID.randomUUID().toString());
						ur.setTrole(r);
						ur.setTuser(t);
						userRoleDao.save(ur);

						if (roleIds.length() > 0) {
							roleIds += ",";
							roleNames += ",";
						}
						roleIds += r.getId();
						roleNames += r.getText();
					}
				}
				user.setRoleNames(roleNames);
				user.setRoleIds(roleIds);
			}
			return user;
		}
		return null;
	}

	public void modifyRole(User user) {
		for (String uid : user.getIds().split(",")) {
			Tuser u = userDao.get(Tuser.class, uid);
			if (u != null) {
				u.setModifydatetime(new Date());
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("tuser", u);
				userRoleDao.executeHql("delete TuserTrole t where t.tuser=:tuser", params);
				if (user.getRoleIds() != null) {
					for (String id : user.getRoleIds().split(",")) {
						Trole r = roleDao.get(Trole.class, id);
						if (r != null) {
							TuserTrole ur = new TuserTrole();
							ur.setId(UUID.randomUUID().toString());
							ur.setTrole(r);
							ur.setTuser(u);
							userRoleDao.save(ur);
						}
					}
				}
			}
		}
	}

	public void modifyPwd(User user) {
		Tuser u = userDao.get(Tuser.class, user.getId());
		if (u != null) {
			u.setPwd(user.getPwd());
		}
	}

	public User getById(String id) {
		//得到用户
		Tuser u = userDao.get(Tuser.class, id);
		User user = new User();
		BeanUtils.copyProperties(u, user);
		return user;
	}

	public void update(User user) {
		Tuser t = new Tuser();
		BeanUtils.copyProperties(user, t);
		userDao.update(t); //更新用户信息
	}
}
