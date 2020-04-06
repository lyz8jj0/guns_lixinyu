package com.lixinyu.guns.rest.modular.auth.validator.impl;

import com.lixinyu.guns.rest.modular.auth.validator.IReqValidator;
import com.lixinyu.guns.rest.modular.auth.validator.dto.Credence;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author by 李新宇
 * @date 2020-04-06 10:20
 */
public class DbValidator implements IReqValidator {

	@Autowired


	public boolean validate(Credence credence) {
		return false;
	}
}
