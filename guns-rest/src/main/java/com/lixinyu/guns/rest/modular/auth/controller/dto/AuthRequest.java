package com.lixinyu.guns.rest.modular.auth.controller.dto;

import com.lixinyu.guns.rest.modular.auth.validator.dto.Credence;

/**
 * 认证的请求dto
 *
 * @author by 李新宇
 * @date 2020-04-06 10:15
 */
public class AuthRequest implements Credence {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCredenceName() {
		return this.username;
	}

	public String getCredenceCode() {
		return this.password;
	}
}
