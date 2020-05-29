package com.lixinyu.guns.rest.modular.auth.controller;

import com.lixinyu.guns.rest.modular.auth.controller.dto.AuthRequest;
import com.lixinyu.guns.rest.modular.auth.util.JwtTokenUtils;
import com.lixinyu.guns.rest.modular.auth.validator.IReqValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 请求验证
 * @author by 李新宇
 * @date 2020-04-06 09:49
 */
@RestController
public class AuthController {

	@Autowired
	private JwtTokenUtils jwtTokenUtils;

	@Resource(name = "simpleValidator")
	private IReqValidator reqValidator;

	@RequestMapping(value = "${jwt.auth-path}")
	public ResponseEntity<?> createAuthticationToken(AuthRequest authRequest) {

		boolean validate = reqValidator.validate(authRequest);

		return null;
	}





}
