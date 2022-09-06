package jp.frontierinfo.ui.input;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001001E001Input {

	@NotNull(message="{S001001E001Input.mobile}")
	@NotBlank(message="{S001001E001Input.mobile}")
	@Size(message="{S001001E001Input.mobile}", max=11)
	private String mobile;

	@NotNull(message="{S001001E001Input.mobile}")
	@NotBlank(message="{S001001E001Input.mobile}")
	private String password;
}
