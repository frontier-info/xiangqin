package jp.frontierinfo.ui.input;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import jp.frontierinfo.common.annotation.ValidPassword;
import lombok.Data;

@Data
public class S001001E001Input {
	
	@NotBlank()
	@Email()
	private String email;
	
	@NotBlank()
	@Size(min= 6, max=12)
	@ValidPassword()
	private String password;
}
