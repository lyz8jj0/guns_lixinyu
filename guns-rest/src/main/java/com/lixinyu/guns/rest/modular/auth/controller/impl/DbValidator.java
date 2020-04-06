package com.lixinyu.guns.rest.modular.auth.controller.impl;

import com.lixinyu.guns.rest.common.persistence.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 账号密码验证
 *
 * @author by 李新宇
 * @date 2020-04-06 12:01
 */
@Service
public class DbValidator {

	@Autowired
	UserMapper userMapper;


}
