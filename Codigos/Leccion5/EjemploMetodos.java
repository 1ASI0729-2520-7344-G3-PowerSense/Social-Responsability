public class EjemploMetodos {
    public static void main(String[] args) {
        saludar();
        saludarPersona("Ana");

        int resultado = sumar(5, 3);
        System.out.println("La suma es: " + resultado);

        boolean esMayor = verificarEdad(15);
        System.out.println("¿Es mayor? " + esMayor);
    }

    public static void saludar() {
        System.out.println("¡Hola a todos!");
    }

    public static void saludarPersona(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static boolean verificarEdad(int edad) {
        return edad >= 18;
    }
}