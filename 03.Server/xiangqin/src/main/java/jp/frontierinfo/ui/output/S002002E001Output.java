package jp.frontierinfo.ui.output;

import java.util.Date;

public class S002002E001Output {
	
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

    public void S002002E001Input(String uid, String uname, Integer sex, Date birthDate, String birthPlace, String address, String profession, String interest, Short uheight, Short uweight, String introduce, String uimages, String identificationPhoto) {
        this.uid = uid;
        this.uname = uname;
        this.sex = sex;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.address = address;
        this.profession = profession;
        this.interest = interest;
        this.uheight = uheight;
        this.uweight = uweight;
        this.introduce = introduce;
        this.uimages = uimages;
        this.identificationPhoto = identificationPhoto;
	
}
}   
