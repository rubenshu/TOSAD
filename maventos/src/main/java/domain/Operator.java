package domain;

public class Operator {
	private String name;
	private String symbol;

	// CONSTRUCTOR
	public Operator(String name, String symbol) {
		this.name = name;
		this.symbol = symbol;
	}

	// GETTERS
	public String getName() {
		return name;
	}

	public String getSymbol() {
		return symbol;
	}

	// SETTERS
	public void setName(String name) {
		this.name = name;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
