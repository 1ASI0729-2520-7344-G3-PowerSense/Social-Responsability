public class OperadoresEjemplo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int edad = 15;
        boolean tienePermiso = true;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        boolean puedeAsistir = (edad >= 13 && tienePermiso) || (edad > 16);
        System.out.println("¿Puede asistir? " + puedeAsistir);
    }
}