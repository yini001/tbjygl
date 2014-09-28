package com.haiyue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haiyue.pageModel.DataGrid;
import com.haiyue.pageModel.Json;
import com.haiyue.pageModel.Role;
import com.haiyue.service.RoleServiceI;


@Controller
@RequestMapping("/roleController")
public class RoleController {

	private RoleServiceI roleService;

	public RoleServiceI getRoleService() {
		return roleService;
	}

	@Autowired
	public void setRoleService(RoleServiceI roleService) {
		this.roleService = roleService;
	}

	@RequestMapping("/datagrid")
	@ResponseBody
	public DataGrid datagrid(Role role) {
		return roleService.datagrid(role);
	}

	@RequestMapping("/add")
	@ResponseBody
	public Json add(Role role) {
		Json j = new Json();
		try {
			Role r = roleService.save(role);
			j.setSuccess(true);
			j.setMsg("��ӳɹ���");
			j.setObj(r);
		} catch (Exception e) {
			j.setMsg(e.getMessage());
		}
		return j;
	}

	@RequestMapping("/remove")
	@ResponseBody
	public Json remove(Role role) {
		roleService.remove(role.getIds());
		Json j = new Json();
		j.setSuccess(true);
		j.setMsg("ɾ���ɹ���");
		return j;
	}

	@RequestMapping("/edit")
	@ResponseBody
	public Json edit(Role role) {
		Json j = new Json();
		try {
			Role u = roleService.edit(role);
			j.setSuccess(true);
			j.setMsg("�༭�ɹ���");
			j.setObj(u);
		} catch (Exception e) {
			j.setMsg(e.getMessage());
		}
		return j;
	}

	@RequestMapping("/combogrid")
	@ResponseBody
	public DataGrid combogrid(Role role) {
		return roleService.datagrid(role);
	}

}
