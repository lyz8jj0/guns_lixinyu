package com.lixinyu.guns.rest.modular.security.impl;

import com.lixinyu.guns.rest.modular.security.DataSecurityAction;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

/**
 * 对数据进行base64编码的方式
 *
 * @author by 李新宇
 * @date 2020-05-28 18:10
 */
@Service
public class Base64SecurityAction implements DataSecurityAction {

	public String doAction(String beProtected) {
		return Base64Utils.encodeToString(beProtected.getBytes());
	}

	public String unlock(String securityCode) {
		byte[] bytes = Base64Utils.decodeFromString(securityCode);
		return new String(bytes);
	}
}
