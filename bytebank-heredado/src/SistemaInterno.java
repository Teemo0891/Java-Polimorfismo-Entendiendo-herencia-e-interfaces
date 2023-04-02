
public class SistemaInterno {
	
	private String clave = "AluraCursosOnline";
	public boolean auntentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en el login");
			return false;
		}
	}
}
