package jp.frontierinfo.db.entity;

public class T01UserLoginInfo {
    private String uid;

    private String mobile;

    private String email;

    private String password;

    private String userStatus;

    private String userCensorResult;

    private String userRank;

    public T01UserLoginInfo(String uid, String mobile, String email, String password, String userStatus, String userCensorResult, String userRank) {
        this.uid = uid;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.userStatus = userStatus;
        this.userCensorResult = userCensorResult;
        this.userRank = userRank;
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

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public String getUserCensorResult() {
        return userCensorResult;
    }

    public void setUserCensorResult(String userCensorResult) {
        this.userCensorResult = userCensorResult == null ? null : userCensorResult.trim();
    }

    public String getUserRank() {
        return userRank;
    }

    public void setUserRank(String userRank) {
        this.userRank = userRank == null ? null : userRank.trim();
    }
}