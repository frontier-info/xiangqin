package jp.frontierinfo.ui.input;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class S002003E001Input {

	private String uid;

	private String sex;
	
	private String ageFrom;
	
	private String ageTo;
	
	private String birthPlace;
	
	private String address;
	
	private String profession;

	private BigDecimal uheightFrom;

	private BigDecimal uheightTo;
	
	private BigDecimal uweightFrom;
	
	private BigDecimal uweightTo;
}
