package jp.frontierinfo.ui.input;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class S009010E001Input {

	private String uid;

	private String sex;
	
	private Integer ageFrom;
	
	private Integer ageTo;
	
	private String birthPlace;
	
	private String address;
	
	private String profession;

	private BigDecimal uheightFrom;

	private BigDecimal uheightTo;
	
	private BigDecimal uweightFrom;
	
	private BigDecimal uweightTo;
}
