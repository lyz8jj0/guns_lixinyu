package com.lixinyu.guns.rest.ceshi.jingtai;

/**
 * 静态代理
 *
 * @author by 李新宇
 * @date 2020-05-29 15:25
 */
public class TestProxy {
	public static void main(String[] args) {
		Subject subject = new SubjectProxy();
		subject.doSomething();
	}
}
