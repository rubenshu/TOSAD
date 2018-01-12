package domain;

public class BusinessRuleGenerator {
	private BusinessRuleType businessruletype;
	private BusinessRule allBusinessRules;
	private BusinessRule selectedBusinessRule;
	private Table table;

	// CONSTRUCTOR

	// GETTERS
	public BusinessRuleType getBusinessruletype() {
		return businessruletype;
	}

	public BusinessRule getAllBusinessRules() {
		return allBusinessRules;
	}

	public BusinessRule getSelectedBusinessRule() {
		return selectedBusinessRule;
	}

	public Table getTable() {
		return table;
	}

	// SETTERS
	public void setBusinessruletype(BusinessRuleType businessruletype) {
		this.businessruletype = businessruletype;
	}

	public void setAllBusinessRules(BusinessRule allBusinessRules) {
		this.allBusinessRules = allBusinessRules;
	}

	public void setSelectedBusinessRule(BusinessRule selectedBusinessRule) {
		this.selectedBusinessRule = selectedBusinessRule;
	}

	public void setTable(Table table) {
		this.table = table;
	}
}
