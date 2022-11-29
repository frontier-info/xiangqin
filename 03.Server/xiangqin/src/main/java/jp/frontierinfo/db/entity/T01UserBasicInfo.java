package jp.frontierinfo.db.entity;

import java.math.BigDecimal;
import java.util.Date;

public class T01UserBasicInfo {
    private String uid;

    private String uname;

    private String sex;

    private Date birthDate;

    private Integer age;

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

    private Integer requireAgeFrom;

    private Integer requireAgeTo;

    private String requireBirthPlace;

    private String requireAddress;

    private String requireProfession;

    private BigDecimal requireHeightFrom;

    private BigDecimal requireHeightTo;

    private BigDecimal requireWeightFrom;

    private BigDecimal requireWeightTo;

    public T01UserBasicInfo(String uid, String uname, String sex, Date birthDate, Integer age, String birthPlace, String address, String profession, String interest, BigDecimal uheight, BigDecimal uweight, String introduce, String avatarImg, String uimages1, String uimages2, String uimages3, String identificationImg, Integer requireAgeFrom, Integer requireAgeTo, String requireBirthPlace, String requireAddress, String requireProfession, BigDecimal requireHeightFrom, BigDecimal requireHeightTo, BigDecimal requireWeightFrom, BigDecimal requireWeightTo) {
        this.uid = uid;
        this.uname = uname;
        this.sex = sex;
        this.birthDate = birthDate;
        this.age = age;
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
        this.requireAgeFrom = requireAgeFrom;
        this.requireAgeTo = requireAgeTo;
        this.requireBirthPlace = requireBirthPlace;
        this.requireAddress = requireAddress;
        this.requireProfession = requireProfession;
        this.requireHeightFrom = requireHeightFrom;
        this.requireHeightTo = requireHeightTo;
        this.requireWeightFrom = requireWeightFrom;
        this.requireWeightTo = requireWeightTo;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public Integer getRequireAgeFrom() {
        return requireAgeFrom;
    }

    public void setRequireAgeFrom(Integer requireAgeFrom) {
        this.requireAgeFrom = requireAgeFrom;
    }

    public Integer getRequireAgeTo() {
        return requireAgeTo;
    }

    public void setRequireAgeTo(Integer requireAgeTo) {
        this.requireAgeTo = requireAgeTo;
    }

    public String getRequireBirthPlace() {
        return requireBirthPlace;
    }

    public void setRequireBirthPlace(String requireBirthPlace) {
        this.requireBirthPlace = requireBirthPlace == null ? null : requireBirthPlace.trim();
    }

    public String getRequireAddress() {
        return requireAddress;
    }

    public void setRequireAddress(String requireAddress) {
        this.requireAddress = requireAddress == null ? null : requireAddress.trim();
    }

    public String getRequireProfession() {
        return requireProfession;
    }

    public void setRequireProfession(String requireProfession) {
        this.requireProfession = requireProfession == null ? null : requireProfession.trim();
    }

    public BigDecimal getRequireHeightFrom() {
        return requireHeightFrom;
    }

    public void setRequireHeightFrom(BigDecimal requireHeightFrom) {
        this.requireHeightFrom = requireHeightFrom;
    }

    public BigDecimal getRequireHeightTo() {
        return requireHeightTo;
    }

    public void setRequireHeightTo(BigDecimal requireHeightTo) {
        this.requireHeightTo = requireHeightTo;
    }

    public BigDecimal getRequireWeightFrom() {
        return requireWeightFrom;
    }

    public void setRequireWeightFrom(BigDecimal requireWeightFrom) {
        this.requireWeightFrom = requireWeightFrom;
    }

    public BigDecimal getRequireWeightTo() {
        return requireWeightTo;
    }

    public void setRequireWeightTo(BigDecimal requireWeightTo) {
        this.requireWeightTo = requireWeightTo;
    }
}