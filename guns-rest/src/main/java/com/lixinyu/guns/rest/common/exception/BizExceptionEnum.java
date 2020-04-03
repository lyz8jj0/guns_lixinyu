package com.lixinyu.guns.rest.common.exception;

/**
 * 所有业务异常的枚举
 *
 * @author by 李新宇
 * @date 2020-04-03 10:40
 */
public enum BizExceptionEnum {

	/**
	 * token异常
	 */
	TOKEN_EXPIRED(700, "token过期"),
	TOKEN_ERROR(700, "token验证失败"),

	/**
	 * 签名异常
	 */
	SIGN_ERROR(700, "签名验证失败"),

	/**
	 * 其它
	 */
	AUTH_REQUEST_ERROR(700, "账号密码错误");

	BizExceptionEnum(int code, String message) {
		this.friendlyCode = code;
		this.friendlyMsg = message;
	}

	private int friendlyCode;
	private String friendlyMsg;

	public int getCode() {
		return friendlyCode;
	}

	public void setCode(int code) {
		this.friendlyCode = code;
	}

	public String getMessage() {
		return friendlyMsg;
	}

	public void setFriendlyMsg(String message) {
		this.friendlyMsg = message;
	}
}
