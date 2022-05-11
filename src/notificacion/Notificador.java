package notificacion;

import java.util.ArrayList;

public class Notificador {

	private ArrayList<Notificable> notificaciones;
	
	public Notificador(ArrayList<Notificable> notificaciones) {
		this.notificaciones = notificaciones;
	}
	
	public void enviar(String mensaje) {
		notificaciones.forEach(notificacion -> {
			notificacion.notificar(mensaje);
		});
	}
	
}
