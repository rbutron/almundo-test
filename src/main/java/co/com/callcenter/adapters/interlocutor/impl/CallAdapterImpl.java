package co.com.callcenter.adapters.interlocutor.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import co.com.callcenter.adapters.interlocutor.CallAdapter;
import co.com.callcenter.domains.usecases.interlocutor.Dispatcher;
import co.com.callcenter.domains.usecases.interlocutor.impl.DispatcherImpl;

public class CallAdapterImpl implements CallAdapter {
	
	private static final Logger LOGGER = LogManager.getLogger(CallAdapterImpl.class);
	
	private Dispatcher dispatcher = new DispatcherImpl();

	@Override
	public void run(int operator, int supervisor, int director, int concurrentCall) {
		try {
			dispatcher.config(operator, supervisor, director, concurrentCall);
		} catch (InterruptedException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

}
