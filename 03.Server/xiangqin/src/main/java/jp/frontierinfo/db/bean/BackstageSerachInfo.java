package jp.frontierinfo.db.bean;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class BackstageSerachInfo {

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
	
	private String userStatus;
	
	private String userRank;

}
