package com.haiyue.service;

import java.util.List;

import com.haiyue.pageModel.Resource;


public interface ResourceServiceI {

	public List<Resource> treegrid();

	public List<Resource> allTreeNode();

	public Resource add(Resource resource);

	public void remove(String id);

	public Resource edit(Resource resource);

}
