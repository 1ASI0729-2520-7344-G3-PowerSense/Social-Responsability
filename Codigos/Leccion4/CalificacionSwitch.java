public class CalificacionSwitch {
    public static void main(String[] args) {
        char calificacion = 'B';

        switch (calificacion) {
            case 'A':
                System.out.println("¡Excelente!");
                break;
            case 'B':
                System.out.println("¡Muy bien!");
                break;
            case 'C':
                System.out.println("Aprobado");
                break;
            case 'D':
            case 'F':
                System.out.println("Necesitas mejora");
                break;
            default:
                System.out.println("Calificación inválida");
        }
    }
}