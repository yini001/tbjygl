package com.haiyue.pageModel;

import java.util.ArrayList;
import java.util.List;
/** 
 * @author haiyue
 *  session 存放的信息 
 */
public class SessionInfo implements java.io.Serializable {

	
	private static final long serialVersionUID = 10656348L;
	
	private String userId;
	private String loginName;
	private String pwd;
	private String ip;
	private String roleNames;
	private String roleIds;
	private String resourceIds;
	private String resourceNames;
	private List<String> resourceUrls = new ArrayList<String>();

	public List<String> getResourceUrls() {
		return resourceUrls;
	}

	public void setResourceUrls(List<String> resourceUrls) {
		this.resourceUrls = resourceUrls;
	}

	public String getRoleNames() {
		return roleNames;
	}

	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public String getResourceIds() {
		return resourceIds;
	}

	public void setResourceIds(String resourceIds) {
		this.resourceIds = resourceIds;
	}

	public String getResourceNames() {
		return resourceNames;
	}

	public void setResourceNames(String resourceNames) {
		this.resourceNames = resourceNames;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "SessionInfo [userId=" + userId + ", loginName=" + loginName
				+ ", pwd=" + pwd + ", ip=" + ip + ", roleNames=" + roleNames
				+ ", roleIds=" + roleIds + ", resourceIds=" + resourceIds
				+ ", resourceNames=" + resourceNames + ", resourceUrls="
				+ resourceUrls + "]";
	}
	
	
	

}
