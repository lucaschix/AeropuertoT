import java.util.Date;

public class Pasaporte {

	private int ID;
	private String nacionalidad;
	private int num_hojas;
	private Date fechaExpiracion;

	// Constructor
	public Pasaporte(int ID, String nacionalidad, int num_hojas, Date fechaExpiracion) {
		this.ID = ID;
		this.nacionalidad = nacionalidad;
		this.num_hojas = num_hojas;
		this.fechaExpiracion = fechaExpiracion;
	}

	// Getters y Setters
	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getNum_hojas() {
		return this.num_hojas;
	}

	public void setNum_hojas(int num_hojas) {
		this.num_hojas = num_hojas;
	}

	public Date getFechaExpiracion() {
		return this.fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}


	public void esValido() {
		if (this.fechaExpiracion.before(new Date())) {
			System.out.println("El pasaporte está expirado. No puede subir al avión.");
		} else {
			System.out.println("El pasaporte es válido. Puede subir al avión.");
		}
	}

	public void contarHojas() {
		if (this.num_hojas > 0) {
			System.out.println("Todavía quedan hojas en el pasaporte.");
		} else {
			System.out.println("Necesitas un pasaporte nuevo, no te quedan hojas.");
		}
	}

}
