package jp.frontierinfo.ui.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S004001Form {

	@NotNull(message="姓名不能为空")
	@NotBlank(message="姓名不能为空")
	private String name;

	private String sex;
	
	private String introduce;
	
	private String uimages;
}
