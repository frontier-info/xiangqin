package jp.frontierinfo.api.indto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jp.frontierinfo.api.abstractcls.AbstractInput;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class A001002E001Input extends AbstractInput {
	
	private String uid;
	
	private String uname;
	
	private Integer sex;
	
	private Date birthDate;
	
	private String birthPlace;
	
	private String address;
	
	private String profession;
	
	private String interest;
	
	private double uheight;
	
	private double uweight;
	
	private String introduce;
	
	private List<String> uimages;
	
	private List<String> identificationPhoto;
	
	private String token;

}
