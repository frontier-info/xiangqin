package jp.frontierinfo.ui.input;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;


@Data
public class S001001E002Input {
	
	@NotBlank()
	private String mobile;
	
	@NotBlank()
	private String password;
}
