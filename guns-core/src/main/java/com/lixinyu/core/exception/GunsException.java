package com.lixinyu.core.exception;

/**
 * 业务异常的封装
 *
 * @author by 李新宇
 * @date 2020-04-03 10:55
 */
public class GunsException extends RuntimeException {

	//友好的提示code码
	protected int friendlyCode;

	//友好的提示
	protected String friendlyMsg;

	//业务异常跳转的页面
	protected String urlPath;

	public GunsException(int friendlyCode, String friendlyMsg, String urlPath) {
		this.setValues(friendlyCode, friendlyMsg, urlPath);
	}

	public GunsException(GunsExceptionEnum bizExceptionEnum) {
		this.setValues(bizExceptionEnum.getCode(), bizExceptionEnum.getMessage(), bizExceptionEnum.getUrlPath());
	}

	private void setValues(int friendlyCode, String friendlyMsg, String urlPath) {
		this.friendlyCode = friendlyCode;
		this.friendlyMsg = friendlyMsg;
		this.urlPath = urlPath;
	}

	public int getFriendlyCode() {
		return friendlyCode;
	}

	public void setFriendlyCode(int friendlyCode) {
		this.friendlyCode = friendlyCode;
	}

	public String getFriendlyMsg() {
		return friendlyMsg;
	}

	public void setFriendlyMsg(String friendlyMsg) {
		this.friendlyMsg = friendlyMsg;
	}

	public String getUrlPath() {
		return urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}
}
