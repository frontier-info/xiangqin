package jp.frontierinfo.db.entity;

import java.util.Date;

public class T01UserLoginInfo {
    private String uid;

    private String mobile;

    private String email;

    private String password;

    private String userStatusCode;

    private String userCensorResult;

    private String userRankCode;

    private Date createTime;

    private Boolean deleteFlg;

    public T01UserLoginInfo(String uid, String mobile, String email, String password, String userStatusCode, String userCensorResult, String userRankCode, Date createTime, Boolean deleteFlg) {
        this.uid = uid;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.userStatusCode = userStatusCode;
        this.userCensorResult = userCensorResult;
        this.userRankCode = userRankCode;
        this.createTime = createTime;
        this.deleteFlg = deleteFlg;
    }

    public T01UserLoginInfo() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserStatusCode() {
        return userStatusCode;
    }

    public void setUserStatusCode(String userStatusCode) {
        this.userStatusCode = userStatusCode == null ? null : userStatusCode.trim();
    }

    public String getUserCensorResult() {
        return userCensorResult;
    }

    public void setUserCensorResult(String userCensorResult) {
        this.userCensorResult = userCensorResult == null ? null : userCensorResult.trim();
    }

    public String getUserRankCode() {
        return userRankCode;
    }

    public void setUserRankCode(String userRankCode) {
        this.userRankCode = userRankCode == null ? null : userRankCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getDeleteFlg() {
        return deleteFlg;
    }

    public void setDeleteFlg(Boolean deleteFlg) {
        this.deleteFlg = deleteFlg;
    }
}