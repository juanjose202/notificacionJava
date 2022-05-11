package notificacion;

public class NotificacionCorreo implements Notificable {
	
	private String[] correos;
	
	public NotificacionCorreo(String[] correos) {
		this.correos = correos;
	}

	@Override
	public void notificar(String mensaje) {
		for (int i = 0; i < correos.length; i++) {
			String correo = correos[i];
			String cuerpo = "Enviando correo: " + mensaje + " para: " + correo;
			System.out.println(cuerpo);
		}
	}

}
