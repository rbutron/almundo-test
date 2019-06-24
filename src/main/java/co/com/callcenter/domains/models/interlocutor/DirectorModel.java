package co.com.callcenter.domains.models.interlocutor;

import co.com.callcenter.frameworks.enums.Priority;

public class DirectorModel extends EmployeeModel {

	public DirectorModel(String name) {
		super(name);
		setPriority(Priority.DIRECTOR);
	}

}
