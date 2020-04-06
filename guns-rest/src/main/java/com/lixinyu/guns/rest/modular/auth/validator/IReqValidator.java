package com.lixinyu.guns.rest.modular.auth.validator;

import com.lixinyu.guns.rest.modular.auth.validator.dto.Credence;

/**
 * 验证请求/auth接口时, 请求参数的正确性
 * 如果想拓展验证方法只需要实现这个接口, 然后在AuthenticationRestController类中注意相应实现在本接口类的实现即可
 *
 * @author by 李新宇
 * @date 2020-04-06 10:17
 */
public interface IReqValidator {

	//通过请求参数验证
	boolean validate(Credence credence);
}
