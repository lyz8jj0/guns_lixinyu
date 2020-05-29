package com.lixinyu.guns.rest.ceshi.dongtai;

import sun.security.ssl.SunJSSE;

/**
 * @author by 李新宇
 * @date 2020-05-29 15:31
 */
public class TestProxy {

	public static void main(String[] args) {
		ProxyHandler proxy = new ProxyHandler();
		//绑定该类实现的所有接口
		Subject sub = (Subject) proxy.bing(new RealSubject());
		sub.doSomething();
	}
}
