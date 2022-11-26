package jp.frontierinfo.ui.output;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class S002001E001Output {
	
	private List<String> sexLi;
	
	private List<String> birthPlaceLi;
	
	private List<String> addressLi;
	
	private List<String> professionLi;

    private String uname;

    private String sex;

    private Date birthDate;

    private String birthPlace;

    private String address;

    private String profession;

    private String interest;

    private BigDecimal uheight;

    private BigDecimal uweight;

    private String introduce;

    private String avatarImg;

    private String uimages1;

    private String uimages2;

    private String uimages3;

    private String identificationImg;

}   
