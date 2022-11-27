package jp.frontierinfo.ui.form;

import java.util.List;

import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import lombok.Data;

@Data
public class S003001Form {
	
	 private List<UserSimpleInfo> userSimpleInfoLi;
		
	 private UserFullInfo userFullInfo;
}