package jp.frontierinfo.db.entity;

import java.util.Date;

public class T01UserSearchInfo {
    private String uid;

    private Integer sex;

    private Date birthDate;

    private String birthPlace;

    private String address;

    private String profession;

    private String interest;

    private Short uheight;

    private Short uweight;

    public T01UserSearchInfo(String uid, Integer sex, Date birthDate, String birthPlace, String address, String profession, String interest, Short uheight, Short uweight) {
        this.uid = uid;
        this.sex = sex;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.address = address;
        this.profession = profession;
        this.interest = interest;
        this.uheight = uheight;
        this.uweight = uweight;
    }

    public T01UserSearchInfo() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
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

    public Short getUheight() {
        return uheight;
    }

    public void setUheight(Short uheight) {
        this.uheight = uheight;
    }

    public Short getUweight() {
        return uweight;
    }

    public void setUweight(Short uweight) {
        this.uweight = uweight;
    }
}