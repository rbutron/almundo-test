package co.com.callcenter.domains.usecases.interlocutor.process;

import java.util.concurrent.Callable;

import co.com.callcenter.domains.models.interlocutor.EmployeeModel;
import co.com.callcenter.domains.usecases.interlocutor.Dispatcher;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CallCallable implements Callable<EmployeeModel> {

	@NonNull
	private Integer call;
	
	@NonNull
	private Dispatcher dispatcher;

	@Override
	public EmployeeModel call() throws Exception {
		return dispatcher.dispatchCall(call);
	}

}
