package jp.frontierinfo.ui.form;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class S002002Form {
	
	private List<String> birthPlaceLi;
	
	private List<String> addressLi;
	
	private List<String> professionLi;

	private String password;
	
    private String uid;

    private String uname;

    private String sex;

    private String birthDate;

    private String birthPlace;

    private String address;

    private String profession;

    private String interest;

    private Short uheight;

    private Short uweight;

    private String introduce;

    private MultipartFile uimages;

    private String identificationPhoto;
}
