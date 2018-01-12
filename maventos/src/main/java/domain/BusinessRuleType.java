package domain;

public class BusinessRuleType {
	private int code;
	private String name;
	private String description;
	private String example;
	private Template template;
	private Operator possibleOperators;

	// CONSTRUCTOR
	public BusinessRuleType(int code, String name, String description, String example) {
		this.code = code;
		this.name = name;
		this.description = description;
		this.example = example;
	}

	// GETTERS
	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getExample() {
		return example;
	}
	
	public Template getTemplate() {
		return template;
	}
	
	public Operator getPossibleOperators() {
		return possibleOperators;
	}

	// SETTERS
	public void setCode(int code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public void setPossibleOperators(Operator possibleOperators) {
		this.possibleOperators = possibleOperators;
	}

}
