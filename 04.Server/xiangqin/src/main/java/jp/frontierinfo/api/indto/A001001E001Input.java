package jp.frontierinfo.api.indto;

import jp.frontierinfo.api.abstractcls.AbstractInput;

public class A001001E001Input extends AbstractInput{
	
	private String account;
	
	private String password;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
