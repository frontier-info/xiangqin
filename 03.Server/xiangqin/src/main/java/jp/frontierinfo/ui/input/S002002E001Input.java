package jp.frontierinfo.ui.input;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class S002002E001Input {
    private String uid;

	@NotBlank()
	@Length(max=10)
    private String uname;

	@NotBlank()
    private String sex;
	
	@NotBlank()
	@Length(max=50)
	private String email;

	@NotBlank()
    private String birthDate;

	@NotBlank()
    private String birthPlace;

	@NotBlank()
    private String address;

	@NotBlank()
    private String profession;

	@NotBlank()
	@Length(max=50)
    private String interest;

    private BigDecimal uheight;

    private BigDecimal uweight;

	@NotBlank()
	@Length(max=100)
    private String introduce;
	
    private MultipartFile avatarImgFile;
	
    private MultipartFile uimages1File;
	
    private MultipartFile uimages2File;
	
    private MultipartFile uimages3File;
	
    private MultipartFile identificationImgFile;

    private Integer requireAgeFrom;

    private Integer requireAgeTo;

	@NotBlank()
    private String requireBirthPlace;

	@NotBlank()
    private String requireAddress;

	@NotBlank()
    private String requireProfession;

    private BigDecimal requireHeightFrom;

    private BigDecimal requireHeightTo;

    private BigDecimal requireWeightFrom;

    private BigDecimal requireWeightTo;
    
    // 服务器绝对路径
    private String realpath;
    
    // 服务器相对路径
    private String fileSavePath;

}

