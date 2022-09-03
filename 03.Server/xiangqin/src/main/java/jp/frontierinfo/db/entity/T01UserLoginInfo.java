package jp.frontierinfo.db.entity;

public class T01UserLoginInfo {
    private String uid;

    private String email;

    private String password;

    public T01UserLoginInfo(String uid, String email, String password) {
        this.uid = uid;
        this.email = email;
        this.password = password;
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
}