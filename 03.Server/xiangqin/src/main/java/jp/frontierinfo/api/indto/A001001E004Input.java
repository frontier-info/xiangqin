package jp.frontierinfo.api.indto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jp.frontierinfo.api.abstractcls.AbstractInput;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class A001001E004Input extends AbstractInput{
	
	private String uid;
	
	private String oldPassword;
	
	private String newPassword;
	
	private String token;

}
