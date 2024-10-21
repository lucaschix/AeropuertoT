public class Piloto extends Persona {

	private String numeroLicencia;
	private String vueloAsignado;

	public Piloto(String nombre, int edad, Pasaporte pasaporte, String numeroLicencia, String vueloAsignado) {
		super(nombre, edad, pasaporte);
		this.numeroLicencia = numeroLicencia;
		this.vueloAsignado = vueloAsignado;
	}

	public String getNumeroLicencia() {
		return this.numeroLicencia;
	}

	public void setNumeroLicencia(String numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

	public String getVueloAsignado() {
		return this.vueloAsignado;
	}

	public void setVueloAsignado(String vueloAsignado) {
		this.vueloAsignado = vueloAsignado;
	}

	public void accederInformacionVuelo() {
		// Aquí puedes implementar la lógica para acceder a la información del vuelo
		System.out.println("Accediendo a la información del vuelo " + vueloAsignado);
	}
}
