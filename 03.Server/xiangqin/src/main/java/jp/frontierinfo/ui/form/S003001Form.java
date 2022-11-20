package jp.frontierinfo.ui.form;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import jp.frontierinfo.db.bean.UserSimpleInfo;
import lombok.Data;

@Data
public class S003001Form {
	
	 private List<UserSimpleInfo> userSimpleInfoLi;
}