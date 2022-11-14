package jp.frontierinfo.ui.form;

import java.util.List;

import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import lombok.Data;

@Data
public class S009010Form {
	
	private List<String> birthPlaceLi;
	
	private List<String> addressLi;
	
	private List<String> professionLi;
	
	private List<UserSimpleInfo> userSimpleInfoLi;
	
	private String uid;
	
	private T01UserBasicInfo userBasicInfo;
}
