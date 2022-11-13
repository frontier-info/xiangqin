package jp.frontierinfo.ui.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001002Form {

	@NotNull(message="不能为空")
	@NotNull(message="手机号不能为空")
	@NotBlank(message="手机号不能为空")
	@Size(message="手机号长度不能超过11位", max=11)
	@Pattern(message="请输入正确的手机号",regexp="^(070|080|090)\\d{8}$")
	private String mobile;
	
	private String registerSmsCode;
	
	@NotNull(message="密码不能为空")
	@NotBlank(message="密码不能为空")

	private String password;
	
}