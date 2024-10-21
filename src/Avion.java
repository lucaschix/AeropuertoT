import java.util.ArrayList;
import java.util.List;

public class Avion {

	private int id;
	private int capacidad;
	private List<Vuelo> vuelos;

	public Avion(int id, int capacidad) {
		this.id = id;
		this.capacidad = capacidad;
		this.vuelos = new ArrayList<>();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Vuelo> getVuelos() {
		return this.vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public void registrarVuelo(Vuelo vuelo) {
		// Implementación pendiente
	}

	public void agregarVuelo(Vuelo vuelo) {
		vuelos.add(vuelo);
		System.out.println("Vuelo agregado");
	}
}
