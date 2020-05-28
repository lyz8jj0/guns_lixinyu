package com.lixinyu.guns.rest.modular.converter;

import lombok.Data;

/**
 * 基础的传输bean
 *
 * @author by 李新宇
 * @date 2020-05-28 18:33
 */
@Data
public class BaseTransferEntity {

	private String Object;//base64编码后的json字符串

	private String sign; //签名
}
