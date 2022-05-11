package notificacion;

public class NotificacionSms implements Notificable {
	
	public String[] celulares;
	
	public NotificacionSms(String[] celulares) {
		this.celulares = celulares;
	}

	@Override
	public void notificar(String mensaje) {
		for (int i = 0; i < celulares.length; i++) {
			String celular= celulares[i];
			String cuerpo = "Enviando SMS: " + mensaje + " para: " + celular;
			System.out.println(cuerpo);
		}

	}

}
