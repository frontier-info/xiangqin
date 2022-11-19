package jp.frontierinfo.api.abstractcls;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

public class AbstractController {
	
	/**
	 * 将inputResult中的错误信息复制到formResult用于页面显示
	 * @param formResult
	 * @param inputResult
	 */
	public void errorCopy(BindingResult formResult, BindingResult inputResult) {
		for(FieldError fieldError : inputResult.getFieldErrors()){
			formResult.addError(fieldError);
		}
	}

}
