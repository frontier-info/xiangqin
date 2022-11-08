package jp.frontierinfo.api.indto;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jp.frontierinfo.api.abstractcls.AbstractInput;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class A001002E003Input extends AbstractInput{
	
    private String uid;

    private Integer sex;

    private String ageFrom;

    private String ageTo;

    private String birthPlace;

    private String address;

    private String profession;

    private String interest;

    private BigDecimal uheightFrom;

    private BigDecimal uheightTo;

    private BigDecimal uweightFrom;

    private BigDecimal uweightTo;
	
	private String token;

}
