package co.com.callcenter.domains.models.interlocutor;

import co.com.callcenter.frameworks.enums.Priority;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EmployeeModel implements Comparable<EmployeeModel> {

	@NonNull
	private String name;
	private Priority priority;

	@Override
	public int compareTo(EmployeeModel e) {
		return this.priority.getValue().compareTo(e.getPriority().getValue());
	}

}
