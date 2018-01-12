package domain;

public class Value {
	private String value;
	private String type;

	// CONSTRUCTOR
	public Value(String value, String type) {
		this.value = value;
		this.type = type;
	}

	// GETTERS
	public String getValue() {
		return value;
	}

	public String getType() {
		return type;
	}

	// SETTERS
	public void setValue(String value) {
		this.value = value;
	}

	public void setType(String type) {
		this.type = type;
	}
}
