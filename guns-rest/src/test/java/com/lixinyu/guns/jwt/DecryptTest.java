package com.lixinyu.guns.jwt;

import com.alibaba.fastjson.JSON;
import com.lixinyu.core.util.MD5Util;
import com.lixinyu.guns.rest.common.SimpleObject;
import com.lixinyu.guns.rest.modular.converter.BaseTransferEntity;
import com.lixinyu.guns.rest.modular.security.impl.Base64SecurityAction;

/**
 * @author by 李新宇
 * @date 2020-05-28 17:14
 */
public class DecryptTest {

	public static void main(String[] args) {
		String salt = "t9f1xt";
		SimpleObject simpleObject = new SimpleObject();
		simpleObject.setUser("lixinyu");
		simpleObject.setAge(12);
		simpleObject.setName("fffff");
		simpleObject.setTips("code");

		String jsonString = JSON.toJSONString(simpleObject);
		String encode = new Base64SecurityAction().doAction(jsonString);

		//原始数据base64编码后+随机字符串,拼接的结果进行md5加密, 加密的结果就是签名
		String md5 = MD5Util.encrypt(encode + salt);

		BaseTransferEntity baseTransferEntity = new BaseTransferEntity();
		baseTransferEntity.setObject(encode);
		baseTransferEntity.setSign(md5);

		System.out.println(JSON.toJSON(baseTransferEntity));
	}
}
