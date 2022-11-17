package jp.frontierinfo.ui.output;

import java.util.List;

import jp.frontierinfo.db.bean.PullDownBean;
import lombok.Data;

@Data
public class S009020E000Output {
	
	private List<String> birthPlaceLi;
	
	private List<String> addressLi;
	
	private List<String> professionLi;
	
	private List<PullDownBean> userStatusLi;
	
	private List<PullDownBean> userRankLi;
}   
