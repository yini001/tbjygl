package com.haiyue.service;

import java.util.List;

import com.haiyue.pageModel.Menu;


public interface MenuServiceI {

	public List<Menu> allTreeNode();
	
	public List<Menu> treeNode(Menu menu);
	
	public List<Menu> treegrid();

	public void remove(String id);

	public Menu add(Menu menu);

	public Menu edit(Menu menu);

}
