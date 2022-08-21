package jp.frontierinfo.api.abstractcls;

public class ResponseResult {
	
	private String code;
	
	private String message;
	
	private AbstractOutput data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AbstractOutput getData() {
		return data;
	}

	public void setData(AbstractOutput data) {
		this.data = data;
	}
	
	

}
