package jp.frontierinfo.db.entity;

import java.math.BigDecimal;

public class T01UserSearchInfo {
    private String uid;

    private Integer sex;

    private String ageFrom;

    private String ageTo;

    private String birthPlace;

    private String address;

    private String profession;

    private String interest;

    private BigDecimal uheightFrom;

    private BigDecimal uheightTo;

    private BigDecimal uweightFrom;

    private BigDecimal uweightTo;

    public T01UserSearchInfo(String uid, Integer sex, String ageFrom, String ageTo, String birthPlace, String address, String profession, String interest, BigDecimal uheightFrom, BigDecimal uheightTo, BigDecimal uweightFrom, BigDecimal uweightTo) {
        this.uid = uid;
        this.sex = sex;
        this.ageFrom = ageFrom;
        this.ageTo = ageTo;
        this.birthPlace = birthPlace;
        this.address = address;
        this.profession = profession;
        this.interest = interest;
        this.uheightFrom = uheightFrom;
        this.uheightTo = uheightTo;
        this.uweightFrom = uweightFrom;
        this.uweightTo = uweightTo;
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

    public String getAgeFrom() {
        return ageFrom;
    }

    public void setAgeFrom(String ageFrom) {
        this.ageFrom = ageFrom == null ? null : ageFrom.trim();
    }

    public String getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(String ageTo) {
        this.ageTo = ageTo == null ? null : ageTo.trim();
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

    public BigDecimal getUheightFrom() {
        return uheightFrom;
    }

    public void setUheightFrom(BigDecimal uheightFrom) {
        this.uheightFrom = uheightFrom;
    }

    public BigDecimal getUheightTo() {
        return uheightTo;
    }

    public void setUheightTo(BigDecimal uheightTo) {
        this.uheightTo = uheightTo;
    }

    public BigDecimal getUweightFrom() {
        return uweightFrom;
    }

    public void setUweightFrom(BigDecimal uweightFrom) {
        this.uweightFrom = uweightFrom;
    }

    public BigDecimal getUweightTo() {
        return uweightTo;
    }

    public void setUweightTo(BigDecimal uweightTo) {
        this.uweightTo = uweightTo;
    }
}