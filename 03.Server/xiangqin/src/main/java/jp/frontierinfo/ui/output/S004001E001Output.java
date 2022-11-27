package jp.frontierinfo.ui.output;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class S004001E001Output {

	private String uid;
	
	private String uname;
	
	private String mobile;

	private String sex;
	
	private String birth_date;
	
	private String birth_place;
	
	private String address;
	
	private String profession;
	
	private String interest;
	
	private int uheight;
	
	private int uweight;
	
	private String introduce;
	
	private String uimages;
	
	private String identification_photo;
	
	
}
