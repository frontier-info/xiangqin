package jp.frontierinfo.api.outdto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class A001002E002Output {
	
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
}
