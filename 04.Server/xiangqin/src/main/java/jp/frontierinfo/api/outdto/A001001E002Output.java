package jp.frontierinfo.api.outdto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jp.frontierinfo.api.abstractcls.AbstractOutput;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class A001001E002Output extends AbstractOutput{
	private String verificationCode;
	
}
