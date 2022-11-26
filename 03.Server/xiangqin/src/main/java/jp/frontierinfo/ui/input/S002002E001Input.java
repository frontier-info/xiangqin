package jp.frontierinfo.ui.input;

import java.math.BigDecimal;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class S002002E001Input {
    private String uid;

    private String uname;

    private String sex;

    private String birthDate;

    private String birthPlace;

    private String address;

    private String profession;

    private String interest;

    private BigDecimal uheight;

    private BigDecimal uweight;

    private String introduce;

    private MultipartFile avatarImgFile;

    private MultipartFile uimages1File;

    private MultipartFile uimages2File;

    private MultipartFile uimages3File;

    private MultipartFile identificationImgFile;
    
    // 服务器绝对路径
    private String realpath;
    
    // 服务器相对路径
    private String fileSavePath;

}

