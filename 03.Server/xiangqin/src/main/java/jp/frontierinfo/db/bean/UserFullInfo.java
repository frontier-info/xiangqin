package jp.frontierinfo.db.bean;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class UserFullInfo {
    private String uid;

    private String uname;

    private String sex;

    private Date birthDate;
    
    private String mobile;
    
    private String email;

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
    
    private String userStatusCode;

    private String userStatusName;
    
    private String userRankCode;

    private String userRankName;
    
    private String userCensorResult;

    private Date createTime;

    private Boolean deleteFlg;
	
	private Boolean isRelation;

}
