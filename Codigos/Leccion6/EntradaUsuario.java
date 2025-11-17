import java.util.Scanner;

public class EntradaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("¿Cuál es tu hobby? ");
        String hobby = scanner.nextLine();

        System.out.println("Resumen:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Hobby: " + hobby);

        scanner.close();
    }
}