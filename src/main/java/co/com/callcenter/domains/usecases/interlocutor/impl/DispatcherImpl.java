package co.com.callcenter.domains.usecases.interlocutor.impl;

import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import co.com.callcenter.domains.models.interlocutor.EmployeeModel;
import co.com.callcenter.domains.usecases.interlocutor.Dispatcher;
import co.com.callcenter.frameworks.tools.Constants;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
public class DispatcherImpl implements Dispatcher {

	private static final Logger LOGGER = LogManager.getLogger(DispatcherImpl.class);

	@NonNull
	private PriorityBlockingQueue<EmployeeModel> queue;

	/**
	 * Este metodo toma la llamada, lo implementa en una cola y de acuerdo a la
	 * concurrencia determina la disponibilidad del empleado
	 * 
	 * @param call
	 * @return Employee
	 */
	@Override
	public EmployeeModel dispatchCall(Integer call) {

		EmployeeModel emp = null;
		try {
			emp = queue.take();
			LOGGER.info(Constants.CALL + call + Constants.ATTENDEE + emp);
			Integer duration = new Random().nextInt((Constants.CALL_MAX - Constants.CALL_MIN) + 1) + Constants.CALL_MIN;
			TimeUnit.SECONDS.sleep(duration);
			LOGGER.info(Constants.FCALL + call + Constants.ATTENDEE + emp + Constants.CALLT + duration);
			queue.add(emp);
		} catch (InterruptedException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return emp;
	}

}
