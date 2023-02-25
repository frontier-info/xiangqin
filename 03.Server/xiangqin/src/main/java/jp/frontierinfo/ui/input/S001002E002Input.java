package jp.frontierinfo.ui.input;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import jp.frontierinfo.common.annotation.ValidPassword;
//import jp.frontierinfo.common.annotation.ValidPassword;
import lombok.Data;

@Data
public class S001002E002Input {

	@NotBlank()
	@Email
	private String email;
	
	@NotBlank()
	private String smsCode;

	@NotBlank()
	@Size(min=6 ,max = 12)
	@ValidPassword()
	private String password;
	
	@NotBlank()
	private String repassword;

	@NotBlank()
	private String agree;
}