package jp.frontierinfo.ui.input;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001002E001Input {

	private String check;
	@NotNull(message="不能为空")
	@NotNull(message="手机号不能为空")
	@NotBlank(message="手机号不能为空")
	@Size(message="手机号长度不能超过11位", max=11)
	private String mobile;
	private String registerSmsCode;
	
	@NotNull(message="密码不能为空")
	@NotBlank(message="密码不能为空")
	private String password;

}
