package jp.frontierinfo.db.entity;

import java.math.BigDecimal;
import java.util.Date;

public class T01UserBasicInfo {
    private String uid;

    private String uname;

    private Integer sex;

    private Date birthDate;

    private String birthPlace;

    private String mobile;

    private String address;

    private String profession;

    private String interest;

    private BigDecimal uheight;

    private BigDecimal uweight;

    private String introduce;

    private String uimages;

    private String identificationPhoto;

    public T01UserBasicInfo(String uid, String uname, Integer sex, Date birthDate, String birthPlace, String mobile, String address, String profession, String interest, BigDecimal uheight, BigDecimal uweight, String introduce, String uimages, String identificationPhoto) {
        this.uid = uid;
        this.uname = uname;
        this.sex = sex;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.mobile = mobile;
        this.address = address;
        this.profession = profession;
        this.interest = interest;
        this.uheight = uheight;
        this.uweight = uweight;
        this.introduce = introduce;
        this.uimages = uimages;
        this.identificationPhoto = identificationPhoto;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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

    public String getUimages() {
        return uimages;
    }

    public void setUimages(String uimages) {
        this.uimages = uimages == null ? null : uimages.trim();
    }

    public String getIdentificationPhoto() {
        return identificationPhoto;
    }

    public void setIdentificationPhoto(String identificationPhoto) {
        this.identificationPhoto = identificationPhoto == null ? null : identificationPhoto.trim();
    }
}