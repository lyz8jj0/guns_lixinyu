package com.lixinyu.guns.rest.common.exception;

import com.lixinyu.core.exception.GunsException;

/**
 * 业务异常封装
 *
 * @author by 李新宇
 * @date 2020-04-03 11:13
 */
public class BusinessException extends GunsException {

	public BusinessException(BizExceptionEnum bizExceptionEnum) {
		super(bizExceptionEnum.getCode(), bizExceptionEnum.getMessage(), "");
	}

}
