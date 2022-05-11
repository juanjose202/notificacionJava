package notificacion;

public class Aplicacion {

	private Notificador notificador;
		
	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void hacerAlgo(String mensaje) {
		notificador.enviar(mensaje);
	}

}
