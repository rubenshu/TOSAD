package domain;

public class Attribute extends RelationalComponent {
	private String name;
	private Table table;

	// CONSTRUCTOR
	public Attribute(String name) {
		this.name = name;
	}

	// GETTERS
	public String getName() {
		return name;
	}
	
	public Table getTable() {
		return table;
	}

	// SETTERS
	public void setName(String name) {
		this.name = name;
	}

	public void setTable(Table table) {
		this.table = table;
	}
}
