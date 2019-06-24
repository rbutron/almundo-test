package co.com.callcenter;

import co.com.callcenter.adapters.interlocutor.CallAdapter;
import co.com.callcenter.adapters.interlocutor.impl.CallAdapterImpl;
import co.com.callcenter.frameworks.tools.Constants;

public class CallCenterRunApp {
	public static void main(String... args) {
		CallAdapter ca = new CallAdapterImpl();
		ca.run(Constants.OPERATOR, Constants.SUPERVISOR, Constants.DIRECTOR, Constants.CONCURRENTCALL);
	}
}
