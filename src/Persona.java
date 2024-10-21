public class Persona {

	private String nombre;
	private int edad;
	private Pasaporte pasaporte;

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Pasaporte getPasaporte() {
		return this.pasaporte;
	}
	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	public Persona(String nombre, int edad, Pasaporte pasaporte) {
		this.nombre = nombre;
		this.edad = edad;
		this.pasaporte = pasaporte;
	}

}