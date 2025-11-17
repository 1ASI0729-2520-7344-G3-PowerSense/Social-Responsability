import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroMascotas registro = new RegistroMascotas();

        int opcion;
        do {
            System.out.println("\n=== REGISTRO DE MASCOTAS ===");
            System.out.println("1. Agregar mascota");
            System.out.println("2. Mostrar todas las mascotas");
            System.out.println("3. Buscar mascota por nombre");
            System.out.println("4. Actualizar datos de mascota");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarMascota(scanner, registro);
                    break;
                case 2:
                    registro.mostrarMascotas();
                    break;
                case 3:
                    buscarMascota(scanner, registro);
                    break;
                case 4:
                    actualizarMascota(scanner, registro);
                    break;
                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void agregarMascota(Scanner scanner, RegistroMascotas registro) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();

        Mascota nuevaMascota = new Mascota(nombre, edad, tipo);
        registro.agregarMascota(nuevaMascota);
    }

    private static void buscarMascota(Scanner scanner, RegistroMascotas registro) {
        System.out.print("Nombre de la mascota: ");
        String nombre = scanner.nextLine();
        Mascota mascota = registro.buscarPorNombre(nombre);
        if (mascota != null) {
            mascota.mostrarInformacion();
        } else {
            System.out.println("Mascota no encontrada.");
        }
    }

    private static void actualizarMascota(Scanner scanner, RegistroMascotas registro) {
        System.out.print("Nombre actual de la mascota: ");
        String nombreBuscar = scanner.nextLine();
        System.out.print("Nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        System.out.print("Nueva edad: ");
        int nuevaEdad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nuevo tipo: ");
        String nuevoTipo = scanner.nextLine();

        boolean actualizado = registro.actualizarMascota(nombreBuscar, nuevoNombre, nuevaEdad, nuevoTipo);
        if (actualizado) {
            System.out.println("Datos actualizados correctamente.");
        } else {
            System.out.println("Mascota no encontrada.");
        }
    }
}