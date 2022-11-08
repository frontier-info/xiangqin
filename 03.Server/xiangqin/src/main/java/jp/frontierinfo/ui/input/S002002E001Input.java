package jp.frontierinfo.ui.input;

import java.math.BigDecimal;

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

    private BigDecimal uheight;

    private BigDecimal uweight;

    private String introduce;

    private String uimages;

    private String identificationPhoto;

    public S002002E001Input(String uid, String uname, String sex, String birthDate, String birthPlace, String address, String profession, String interest, BigDecimal uheight, BigDecimal uweight, String introduce, String uimages, String identificationPhoto) {
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

