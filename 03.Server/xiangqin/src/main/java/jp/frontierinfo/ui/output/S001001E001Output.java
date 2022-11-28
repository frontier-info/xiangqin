package jp.frontierinfo.ui.output;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class S001001E001Output {

	private T01UserLoginInfo userLoginInfo;
	
	private T01UserBasicInfo userBasicInfo;
	
	private T01UserSearchInfo userSearchInfo;
	
	private String token;
}
