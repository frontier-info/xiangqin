package jp.frontierinfo.ui.input;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001002E002Input {

	@NotBlank()
	private String email;
	
	@NotBlank()
	private String smsCode;

	@NotBlank()
	private String password;
	
	@NotBlank()
	private String repassword;

	@NotBlank()
	private String agree;
}