package co.com.callcenter.domains.usecases.interlocutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

import co.com.callcenter.domains.models.interlocutor.DirectorModel;
import co.com.callcenter.domains.models.interlocutor.EmployeeModel;
import co.com.callcenter.domains.models.interlocutor.OperatorModel;
import co.com.callcenter.domains.models.interlocutor.SupervisorModel;
import co.com.callcenter.domains.usecases.interlocutor.impl.DispatcherImpl;
import co.com.callcenter.domains.usecases.interlocutor.process.CallCallable;
import co.com.callcenter.frameworks.tools.Constants;

public interface Dispatcher {

	// Metodo de configuracion de las operaciones propuestas por el ejercicio
	default void config(int operator, int supervisor, int director, int concurrentCall) throws InterruptedException {
		PriorityBlockingQueue<EmployeeModel> pbq = new PriorityBlockingQueue<>();
		List<Callable<EmployeeModel>> empCall = new ArrayList<>();
		Dispatcher d = new DispatcherImpl(pbq);
		ExecutorService es = Executors.newFixedThreadPool(Constants.THREADPOOL);

		for (int i = 1; i <= operator; i++) {
			pbq.add(new OperatorModel(Constants.NAME_OPERATOR + i));
		}
		for (int i = 1; i <= supervisor; i++) {
			pbq.add(new SupervisorModel(Constants.NAME_SUPERVISOR + i));
		}
		for (int i = 1; i <= director; i++) {
			pbq.add(new DirectorModel(Constants.NAME_DIRECTOR + i));
		}
		for (int i = 1; i <= concurrentCall; i++) {
			empCall.add(new CallCallable(i, d));
		}

		es.invokeAll(empCall);
		es.shutdown();
	}

	EmployeeModel dispatchCall(Integer call);

}
