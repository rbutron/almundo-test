package co.com.callcenter.test;


import org.junit.Before;
import org.junit.Test;

import co.com.callcenter.CallCenterRunApp;
import co.com.callcenter.adapters.interlocutor.CallAdapter;
import co.com.callcenter.adapters.interlocutor.impl.CallAdapterImpl;

public class CallCenterTest {
	
	private CallCenterRunApp crun;
	private CallAdapter ca;
	
	@Before
	public void init() {
		this.crun = new CallCenterRunApp();
		this.ca = new CallAdapterImpl();
	}
	
	
	@Test
	@SuppressWarnings("static-access")
	public void run() {
		this.crun.main("");
	}
	
	@Test
	public void someValue() {
		this.ca.run(2, 1, 1, 5);
	}
	
}
