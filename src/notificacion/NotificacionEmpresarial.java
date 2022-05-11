package notificacion;

public class NotificacionEmpresarial implements Notificable {

	public String[] contactos;
	
	public NotificacionEmpresarial(String[] contactos) {
		this.contactos = contactos;
	}

	@Override
	public void notificar(String mensaje) {
		for (int i = 0; i < contactos.length; i++) {
			String contacto = contactos[i];
			String cuerpo = "Enviando mensaje: " + mensaje + " para el contacto: " + contacto;
			System.out.println(cuerpo);
		}

	}
	
}
