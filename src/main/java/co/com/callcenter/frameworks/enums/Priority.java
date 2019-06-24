package co.com.callcenter.frameworks.enums;

import lombok.Getter;

@Getter
public enum Priority {

	OPERATOR(1), SUPERVISOR(2), DIRECTOR(3);

	private Integer value;

	Priority(Integer i) {
		this.value = i;
	}

}
