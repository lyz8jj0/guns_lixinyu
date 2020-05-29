package com.lixinyu.guns.rest.ceshi.jingtai;

/**
 * @author by 李新宇
 * @date 2020-05-29 15:24
 */
public class SubjectProxy implements Subject {

	Subject subject = new RealSubject();

	public void doSomething() {
		subject.doSomething();
	}
}
