package notificacion;

public class Main {

	public static void main(String[] args) {
		// Probando la funcionalidad
		CreadorNotificador creador = new CreadorNotificador();
		String[] correos = {"correo1@gmail.com", "correo2@gmail.com"};
		String[] celulares = {"30017538886", "3010000000"};
		String[] contactos = {"Steven", "Kevin", "Juan"};
		Notificador notificador = creador.correo(correos)
		.empresarial(contactos)
		.sms(celulares)
		.correo(correos)
		.build();
		Aplicacion app = new Aplicacion();
		app.setNotificador(notificador);
		app.hacerAlgo("Hello World!");
	}
	
}
