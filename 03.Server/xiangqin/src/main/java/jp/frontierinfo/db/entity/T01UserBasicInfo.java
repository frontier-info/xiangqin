package jp.frontierinfo.db.entity;

import java.math.BigDecimal;
import java.util.Date;

public class T01UserBasicInfo {
    private String uid;

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

    public T01UserBasicInfo(String uid, String uname, String sex, Date birthDate, String birthPlace, String address, String profession, String interest, BigDecimal uheight, BigDecimal uweight, String introduce, String avatarImg, String uimages1, String uimages2, String uimages3, String identificationImg) {
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
        this.avatarImg = avatarImg;
        this.uimages1 = uimages1;
        this.uimages2 = uimages2;
        this.uimages3 = uimages3;
        this.identificationImg = identificationImg;
    }

    public T01UserBasicInfo() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace == null ? null : birthPlace.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest == null ? null : interest.trim();
    }

    public BigDecimal getUheight() {
        return uheight;
    }

    public void setUheight(BigDecimal uheight) {
        this.uheight = uheight;
    }

    public BigDecimal getUweight() {
        return uweight;
    }

    public void setUweight(BigDecimal uweight) {
        this.uweight = uweight;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getAvatarImg() {
        return avatarImg;
    }

    public void setAvatarImg(String avatarImg) {
        this.avatarImg = avatarImg == null ? null : avatarImg.trim();
    }

    public String getUimages1() {
        return uimages1;
    }

    public void setUimages1(String uimages1) {
        this.uimages1 = uimages1 == null ? null : uimages1.trim();
    }

    public String getUimages2() {
        return uimages2;
    }

    public void setUimages2(String uimages2) {
        this.uimages2 = uimages2 == null ? null : uimages2.trim();
    }

    public String getUimages3() {
        return uimages3;
    }

    public void setUimages3(String uimages3) {
        this.uimages3 = uimages3 == null ? null : uimages3.trim();
    }

    public String getIdentificationImg() {
        return identificationImg;
    }

    public void setIdentificationImg(String identificationImg) {
        this.identificationImg = identificationImg == null ? null : identificationImg.trim();
    }
}