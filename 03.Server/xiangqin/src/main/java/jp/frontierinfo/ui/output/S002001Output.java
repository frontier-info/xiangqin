package jp.frontierinfo.ui.output;

import java.util.List;

import jp.frontierinfo.db.entity.T01UserBasicInfo;
import lombok.Data;
import jp.frontierinfo.db.bean.UserSimpleInfo;

@Data
public class S002001Output {
	
	   private List<UserSimpleInfo> userSimpleInfoLi;
}   
