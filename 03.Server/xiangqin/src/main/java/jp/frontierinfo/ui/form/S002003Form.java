package jp.frontierinfo.ui.form;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class S002003Form {
	
	private List<String> sexLi;
	
	private List<String> birthPlaceLi;
	
	private List<String> addressLi;
	
	private List<String> professionLi;

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
