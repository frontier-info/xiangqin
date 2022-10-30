package jp.frontierinfo.ui.input;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001002E001Input {
	
	private String uid;
		
	private String mobile;

	private String email;
	
	private String password;
}