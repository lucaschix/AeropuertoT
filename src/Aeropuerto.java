import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Aeropuerto {

	private String nombre;
	private String ubicacion;
	private List<Avion> aviones;

	public Aeropuerto(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.aviones = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void agregarAvion(Avion avion) {
		aviones.add(avion);
		System.out.println("Avion " + avion.getId() + " agregado");
	}

	public void agruparPorFecha(Vuelo vuelo) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar fecha (dd/MM/yyyy):");
		String fecha = scanner.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date fechaIngresada = sdf.parse(fecha);
			for (Avion avion : aviones) {
				for (Vuelo v : avion.getVuelos()) {
					if (v.getFecha().equals(fechaIngresada)) {
						System.out.println(v.getPasajeros());
					}
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
