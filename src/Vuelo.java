import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vuelo {

	private String id;
	private String origen;
	private String destino;
	private Date fecha;
	private List<Pasajeros> pasajeros; // Cambiado a Pasajero
	private List<Piloto> pilotos;

	public Vuelo(String id, String origen, String destino, Date fecha) {
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.pasajeros = new ArrayList<>();
		this.pilotos = new ArrayList<>();
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Pasajeros> getPasajeros() {
		return this.pasajeros;
	}

	public void setPasajeros(List<Pasajeros> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public List<Piloto> getPilotos() {
		return this.pilotos;
	}

	public void setPilotos(List<Piloto> pilotos) {
		this.pilotos = pilotos;
	}

	public void agregarPasajero(Pasajeros pasajero) {
		pasajeros.add(pasajero);
		System.out.println("Pasajero agregado");
	}

	public void agregarPiloto(Piloto piloto) {
		pilotos.add(piloto);
		System.out.println("Piloto agregado");
	}

	public void validarPasaporte(Pasajeros pasajero) {
		// Obtienes el pasaporte del pasajero
		Pasaporte pasaporte = pasajero.getPasaporte();

		// Validar si el pasaporte no es null antes de llamarlo
		if (pasaporte != null) {
			pasaporte.esValido();
			pasaporte.contarHojas();
		} else {
			System.out.println("El pasajero no tiene un pasaporte registrado.");
		}
	}


	public void registrarWeones(){
		System.out.println("Pilotos: "+ getPilotos()+ "Pasajeros: "+ getPasajeros());
	}
}
