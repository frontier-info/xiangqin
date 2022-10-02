package jp.frontierinfo.ui.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001004Form {

	@NotNull(message="手机号不能为空")
	@NotBlank(message="手机号不能为空")
	@Size(message="手机号长度不能超过11位", max=11)
	private String mobile;

	private String password;
	
	private String check;
}
