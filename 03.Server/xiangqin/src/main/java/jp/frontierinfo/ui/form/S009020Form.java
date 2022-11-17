package jp.frontierinfo.ui.form;

import java.util.List;

import jp.frontierinfo.db.bean.PullDownBean;
import jp.frontierinfo.db.bean.UserFullInfo;
import lombok.Data;

@Data
public class S009020Form {
	
	private List<String> birthPlaceLi;
	
	private List<String> addressLi;
	
	private List<String> professionLi;
	
	private List<PullDownBean> userStatusLi;
	
	private List<PullDownBean> userRankLi;
	
	private List<UserFullInfo> userFullInfoLi;
	
	private UserFullInfo userFullInfo;
}
