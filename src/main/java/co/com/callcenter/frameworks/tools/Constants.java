package co.com.callcenter.frameworks.tools;

// Configuracion de constantes que intervienen en la aplicacion
public class Constants {

	// Call time
	public static final Integer CALL_MAX = 10;
	public static final Integer CALL_MIN = 5;

	// Out messages
	public static final String CALL = "Llamada entrante -> ";
	public static final String ATTENDEE = " empleado en atencion a la llamada ";
	public static final String FCALL = "Llamada finalizada -> ";
	public static final String CALLT = " duracion de llamada ";

	// Employe Name
	public static final String NAME_OPERATOR = "Operator-";
	public static final String NAME_SUPERVISOR = "Supervisor-";
	public static final String NAME_DIRECTOR = "Director-";
	
	// configuration of Call Center
	public static final Integer OPERATOR = 5;
	public static final Integer SUPERVISOR = 1;
	public static final Integer DIRECTOR = 1;
	public static final Integer CONCURRENTCALL = 10;
	
	// Thread Pool
	public static final Integer THREADPOOL = 10;

	private Constants() {
	}
}
