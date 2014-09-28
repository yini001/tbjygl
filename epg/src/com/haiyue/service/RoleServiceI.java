package com.haiyue.service;

import com.haiyue.pageModel.DataGrid;
import com.haiyue.pageModel.Role;

public interface RoleServiceI {

	public DataGrid datagrid(Role role);

	public Role save(Role role);

	public void remove(String ids);

	public Role edit(Role role);

}
