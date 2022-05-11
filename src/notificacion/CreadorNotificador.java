package notificacion;

import java.util.ArrayList;

public class CreadorNotificador {

	private ArrayList<Notificable> notificables = new ArrayList<Notificable>();
		
	public Notificador build() {
		return new Notificador(notificables);
	}
	
	public CreadorNotificador sms(String[] contactos) {
		NotificacionSms sms = new NotificacionSms(contactos);
		notificables.add(sms);
		return this;
	}
	
	public CreadorNotificador correo(String[] correos) {
		NotificacionCorreo correo = new NotificacionCorreo(correos);
		notificables.add(correo);
		return this;
	}
	
	public CreadorNotificador empresarial(String[] contactos) {
		NotificacionEmpresarial empresarial = new NotificacionEmpresarial(contactos);
		notificables.add(empresarial);
		return this;
	}
}
