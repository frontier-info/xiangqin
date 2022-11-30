package jp.frontierinfo.ui.output;

import java.util.List;

import jp.frontierinfo.db.bean.UserSimpleInfo;
import lombok.Data;

@Data
public class S002001Output {
	
	   private List<UserSimpleInfo> userSimpleInfoLi;
	   
	   private List<UserSimpleInfo> randomUserSimpleInfoLi;
}   
