package jp.frontierinfo.ui.form;

import java.util.List;

import jp.frontierinfo.db.bean.UserFullInfo;
import lombok.Data;

@Data
public class S009010Form {
	
	private List<String> birthPlaceLi;
	
	private List<String> addressLi;
	
	private List<String> professionLi;
	
	private List<UserFullInfo> userFullInfoLi;
	
	private String uid;
	
	private UserFullInfo userFullInfo;
}
