package jp.frontierinfo.ui.form;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001006Form {

	@NotNull(message="密码不能为空")
	@NotBlank(message="密码不能为空")
	private String password;
}
