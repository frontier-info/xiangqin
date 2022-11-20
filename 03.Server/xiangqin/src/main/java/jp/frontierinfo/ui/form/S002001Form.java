package jp.frontierinfo.ui.form;

import java.util.List;
import jp.frontierinfo.db.bean.UserSimpleInfo;

import org.springframework.web.multipart.MultipartFile;

import jp.frontierinfo.db.entity.T01UserBasicInfo;
import lombok.Data;

@Data
public class S002001Form {
	
   private List<T01UserBasicInfo> userSimpleBisicoinfoLi;
    

    
}
