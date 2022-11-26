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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((deleteFlg == null) ? 0 : deleteFlg.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		result = prime * result + ((userCensorResult == null) ? 0 : userCensorResult.hashCode());
		result = prime * result + ((userRankCode == null) ? 0 : userRankCode.hashCode());
		result = prime * result + ((userStatusCode == null) ? 0 : userStatusCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		T01UserLoginInfo other = (T01UserLoginInfo) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (deleteFlg == null) {
			if (other.deleteFlg != null)
				return false;
		} else if (!deleteFlg.equals(other.deleteFlg))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		if (userCensorResult == null) {
			if (other.userCensorResult != null)
				return false;
		} else if (!userCensorResult.equals(other.userCensorResult))
			return false;
		if (userRankCode == null) {
			if (other.userRankCode != null)
				return false;
		} else if (!userRankCode.equals(other.userRankCode))
			return false;
		if (userStatusCode == null) {
			if (other.userStatusCode != null)
				return false;
		} else if (!userStatusCode.equals(other.userStatusCode))
			return false;
		return true;
	}
    
}