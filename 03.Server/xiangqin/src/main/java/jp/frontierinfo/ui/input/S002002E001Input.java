package jp.frontierinfo.ui.input;

import java.util.Date;

import lombok.Data;

@Data
public class S002002E001Input {
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

    private String uimages;

    private String identificationPhoto;

    public S002002E001Input(String uid, String uname, String sex, String birthDate, String birthPlace, String address, String profession, String interest, Short uheight, Short uweight, String introduce, String uimages, String identificationPhoto) {
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

