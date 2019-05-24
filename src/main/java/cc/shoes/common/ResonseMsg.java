package cc.shoes.common;

public enum ResonseMsg {

	SUCCESS("OK"),

	NODATA("no data"),

	ERROR("system error");
	private String value;

	private ResonseMsg(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
