package jp.frontierinfo.ui.form;

import jp.frontierinfo.db.bean.UserFullInfo;
import lombok.Data;

@Data
public class S005001Form {
	
	private UserFullInfo userFullInfo;
	
	private String relationId;
}
