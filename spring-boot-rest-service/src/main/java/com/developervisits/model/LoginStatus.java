package com.developervisits.model;

public class LoginStatus {
	
	private boolean status;
	private String errorMsg;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	@Override
	public String toString() {
		return "LoginStatus [status=" + status + ", errorMsg=" + errorMsg + "]";
	}
	
}
