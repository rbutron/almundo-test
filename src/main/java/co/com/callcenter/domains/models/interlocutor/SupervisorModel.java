package co.com.callcenter.domains.models.interlocutor;

import co.com.callcenter.frameworks.enums.Priority;

public class SupervisorModel extends EmployeeModel {

	public SupervisorModel(String name) {
		super(name);
		setPriority(Priority.SUPERVISOR);
	}

}
