package com.lixinyu.guns.rest.modular.auth.validator.dto;

/**
 * 验证凭据
 *
 * @author by 李新宇
 * @date 2020-04-06 10:12
 */
public interface Credence {

	//获取凭据名称
	String getCredenceName();

	//获取密码或者其它的验证码之类的
	String getCredenceCode();
}
