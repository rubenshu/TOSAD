package domain;

public class BusinessRule {
	private String name;
	private String message;
	private Value value;
	private RelationalComponent target;
	private Attribute attribute;

	// CONSTRUCTOR
	public BusinessRule(String name, String message) {
		this.name = name;
		this.message = message;
	}

	// GETTERS
	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}
	
	public Value getValue() {
		return value;
	}
	
	public RelationalComponent getTarget() {
		return target;
	}
	
	public Attribute getAttribute() {
		return attribute;
	}

	// SETTERS
	public void setName(String name) {
		this.name = name;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public void setTarget(RelationalComponent target) {
		this.target = target;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

}