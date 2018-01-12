package domain;

public class Table extends RelationalComponent {
	private String name;
	private Attribute attribute;

	// CONSTRUCTOR
	public Table(String name) {
		this.name = name;
	}

	// GETTERS
	public String getName() {
		return name;
	}
	
	public Attribute getAttribute() {
		return attribute;
	}

	// SETTERS
	public void setName(String name) {
		this.name = name;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
}
