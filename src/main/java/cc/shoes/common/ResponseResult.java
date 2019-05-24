package cc.shoes.common;

/**
 * 返回类
 * 
 * @author Administrator
 *
 */
public class ResponseResult {

	private ResponseCode code;

	private ResonseMsg msg;

	private Object data;

	public ResponseCode getCode() {
		return code;
	}

	public void setCode(ResponseCode code) {
		this.code = code;
	}

	public ResonseMsg getMsg() {
		return msg;
	}

	public void setMsg(ResonseMsg msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
