package jp.frontierinfo.ui.output;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class S001005E001Output {

	private String mobile;
	
}
