package com.haiyue.util;

import java.util.ResourceBundle;

/**
 * @author haiyue
 * 
 */
public class ResourceUtil {

	private static final ResourceBundle bundle = java.util.ResourceBundle.getBundle("config");

	private void ResourceUtil() {
		
	}

	/**
	 * 获得epg 接口地址
	 * @return epg_address
	 */
	public static final String getEpgAddress() {
		return bundle.getString("epg_adress");
	}

	public static void main(String[] args) {
		String st = ResourceUtil.getEpgAddress();
		System.out.println(st);
	}	

}
