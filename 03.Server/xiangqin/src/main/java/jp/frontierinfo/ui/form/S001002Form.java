package jp.frontierinfo.ui.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001002Form {

	@NotNull(message="不能为空")
	private String check;
}
