package jp.frontierinfo.ui.form;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class S002002Form {
	
	private List<String> sexLi;
	
	private List<String> birthPlaceLi;
	
	private List<String> addressLi;
	
	private List<String> professionLi;
	
	private List<String> requireBirthPlaceLi;
	
	private List<String> requireAddressLi;
	
	private List<String> requireProfessionLi;

    private String uname;

    private String sex;
    
	private String email;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
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

    private MultipartFile avatarImgFile;

    private MultipartFile uimages1File;

    private MultipartFile uimages2File;

    private MultipartFile uimages3File;

    private MultipartFile identificationImgFile;

    private Integer requireAgeFrom;

    private Integer requireAgeTo;

    private String requireBirthPlace;

    private String requireAddress;

    private String requireProfession;

    private BigDecimal requireHeightFrom;

    private BigDecimal requireHeightTo;

    private BigDecimal requireWeightFrom;

    private BigDecimal requireWeightTo;
}
