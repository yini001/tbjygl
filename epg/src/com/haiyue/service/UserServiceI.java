package com.haiyue.service;

import java.util.List;

import com.haiyue.pageModel.DataGrid;
import com.haiyue.pageModel.User;


public interface UserServiceI {

	public User save(User user);
	
	public User getById(String id);

	public User find(User user);
	
	public void update(User user);

	public DataGrid datagrid(User user);

	public List<User> combobox(User user);

	public void remove(String ids);

	public User edit(User user);

	public void modifyRole(User user);

	public void modifyPwd(User user);

}
