package cc.shoes.common;

/**
 * 返回码
 * 
 * @author Administrator
 *
 */
public enum ResponseCode {

	SUCCESS(200),

	ERROR(400);
	private int value;

	private ResponseCode(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
