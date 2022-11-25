package jp.frontierinfo.ui.input;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S001002E001Input {

	@NotBlank()
	@Length(max=11)
	private String mobile;
}