package com.lixinyu.guns.rest.modular.security;

/**
 * <pre>
 * 信息传递的保护措施(传递的数据为json)
 *
 * 说明:
 * 可以根据实际开发的需要, 编写自己的数据加密方案, 只需要实现此类
 * </pre>
 *
 * @author by 李新宇
 * @date 2020-05-28 18:09
 */
public interface DataSecurityAction {

	//执行数据的保护措施
	String doAction(String beProtected);

	//解除保护
	String unlock(String securityCode);
}
