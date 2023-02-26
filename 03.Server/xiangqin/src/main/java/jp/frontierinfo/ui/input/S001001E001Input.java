package jp.frontierinfo.ui.input;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001001E001Input {
	
	private String loginType;
	
	@NotBlank()
//	@Email()
	private String mobileOrEmail;
	
	@NotBlank()
//	@Size(min= 3, max=12)
//	@ValidPassword()
	private String password;
}
