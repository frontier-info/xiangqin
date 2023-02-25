package jp.frontierinfo.ui.input;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001003E002Input {

	@NotBlank()
	@Email()
	private String email;
	
	@NotBlank()
	private String smsCode;

	@NotBlank()
	@Size(min=6 ,max = 12)
	private String password;
	
	@NotBlank()
	private String repassword;
}
