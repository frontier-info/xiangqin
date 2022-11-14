package jp.frontierinfo.api.outdto;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jp.frontierinfo.db.bean.UserSimpleInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class A001003E001Output {
	
	private List<UserSimpleInfo> userSimpleInfoLi;
}
