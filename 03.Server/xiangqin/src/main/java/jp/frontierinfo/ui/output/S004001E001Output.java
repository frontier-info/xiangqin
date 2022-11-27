package jp.frontierinfo.ui.output;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jp.frontierinfo.db.bean.UserSimpleInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class S004001E001Output {
	
	   private List<UserSimpleInfo> userSimpleInfoLi;
}
