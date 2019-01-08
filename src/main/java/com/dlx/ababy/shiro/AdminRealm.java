package com.dlx.ababy.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
* Copyright: Copyright (c) 2018 
* @author: taoge
* @version: v1.0.0
* @date: 2018年12月20日 下午5:31:12
* @ClassName: AdminRealm.java
*/
public class AdminRealm extends AuthorizingRealm{

	/* 
	 * 授权*/
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
		
		//查询当前登录用户的权限
		//Admin admin=(Admin)SecurityUtils.getSubject().getSession().getAttribute("admin");
		
		//设置权限
		//info.addStringPermissions(null);
		return info;
	}

	/*登录
	 * */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		UsernamePasswordToken upToken=(UsernamePasswordToken)token;
		if(upToken.getUsername()!=null) {
			return new SimpleAuthenticationInfo(upToken.getUsername(),upToken.getPassword(),getName());
		}else {
			return null;
		}
	}

}
