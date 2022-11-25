package jp.frontierinfo.ui.input;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001002E002Input {

	@NotBlank()
	@Length(max=11)
//	@Pattern(message="请输入正确的手机号",regexp="^(070|080|090)\\d{8}$")
	private String mobile;
	
	@NotBlank()
	private String smsCode;

	@NotBlank()
	private String password;
	
	@NotBlank()
	private String repassword;
}