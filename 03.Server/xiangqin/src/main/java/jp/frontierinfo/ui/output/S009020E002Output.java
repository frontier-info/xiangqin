package jp.frontierinfo.ui.output;

import java.util.List;

import jp.frontierinfo.db.bean.PullDownBean;
import jp.frontierinfo.db.bean.UserFullInfo;
import lombok.Data;

@Data
public class S009020E002Output {
	
	private UserFullInfo userFullInfo;
	
	private List<PullDownBean> userStatusLi;
	
	private List<PullDownBean> userRankLi;
}   
