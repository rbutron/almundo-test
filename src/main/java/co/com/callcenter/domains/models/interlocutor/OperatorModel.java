package co.com.callcenter.domains.models.interlocutor;

import co.com.callcenter.frameworks.enums.Priority;

public class OperatorModel extends EmployeeModel {

	public OperatorModel(String name) {
		super(name);
		setPriority(Priority.OPERATOR);
	}

}
