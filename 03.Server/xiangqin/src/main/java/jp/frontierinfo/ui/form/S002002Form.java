package jp.frontierinfo.ui.form;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class S002002Form {

	private String password;
	
    private String uid;

    private String uname;

    private Integer sex;

    private Date birthDate;

    private String birthPlace;

    private String address;

    private String profession;

    private String interest;

    private Short uheight;

    private Short uweight;

    private String introduce;

    private String uimages;

    private String identificationPhoto;
}
