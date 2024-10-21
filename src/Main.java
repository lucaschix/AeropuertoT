import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        // Crear un aeropuerto
        Aeropuerto aeropuerto = new Aeropuerto("Aeropuerto Internacional", "Ciudad X");

        // Crear un avión


        Avion avion = new Avion(1, 180); // ID: 1, capacidad: 180
        aeropuerto.agregarAvion(avion);

        // Crear un vuelo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaVuelo = null;
        try {
            System.out.println("Ingrese la fecha del vuelo (dd/MM/yyyy): ");
            String fechaString = scanner.nextLine();
            fechaVuelo = sdf.parse(fechaString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Vuelo vuelo = new Vuelo("V1234", "Ciudad A", "Ciudad B", fechaVuelo);
        avion.agregarVuelo(vuelo);

        // Registrar pasajeros
        Pasaporte pasaporte1 = new Pasaporte(1, "Nacionalidad X", 10, sdf.parse("10/10/2025"));
        Pasajeros pasajero1 = new Pasajeros("Juan Pérez", 30, pasaporte1);
        vuelo.agregarPasajero(pasajero1);

        Pasaporte pasaporte2 = new Pasaporte(2, "Nacionalidad Y", 0, sdf.parse("10/10/2023"));
        Pasajeros pasajero2 = new Pasajeros("María García", 25, pasaporte2);
        vuelo.agregarPasajero(pasajero2);

        // Registrar pilotos
        Pasaporte pasaportePiloto = new Pasaporte(3, "Nacionalidad Z", 5, sdf.parse("10/10/2024"));
        Piloto piloto = new Piloto("Pedro González", 45, pasaportePiloto, "LIC123", "V1234");
        vuelo.agregarPiloto(piloto);

        // Validar pasaportes de los pasajeros
        System.out.println("Validando pasaportes...");
        for (Pasajeros pasajero : vuelo.getPasajeros()) {
            System.out.println("Validando pasaporte de " + pasajero.getNombre());
            Pasaporte pasaporte = pasajero.getPasaporte();
            if (pasaporte.getFechaExpiracion().before(new Date())) {
                System.out.println("El pasaporte de " + pasajero.getNombre() + " está expirado.");
            } else if (pasaporte.getNum_hojas() <= 0) {
                System.out.println("El pasaporte de " + pasajero.getNombre() + " no tiene hojas disponibles.");
            } else {
                System.out.println("El pasaporte de " + pasajero.getNombre() + " es válido.");
            }
        }

        // Buscar usuarios por fecha
        System.out.println("\nBuscar usuarios por fecha:");
        aeropuerto.agruparPorFecha(vuelo); // Método implementado en Aeropuerto

        // Buscar usuarios de un vuelo específico
        System.out.println("\nUsuarios del vuelo " + vuelo.getId() + ":");
        vuelo.registrarWeones(); // Método implementado en Vuelo
    }
}
