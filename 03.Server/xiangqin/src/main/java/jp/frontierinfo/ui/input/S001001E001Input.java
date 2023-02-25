package jp.frontierinfo.ui.input;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001001E001Input {
	
	@NotBlank()
	private String email;
	
	@NotBlank()
	private String password;
}
