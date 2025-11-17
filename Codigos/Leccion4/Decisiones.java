public class Decisiones {
    public static void main(String[] args) {
        int edad = 15;
        boolean acompañado = false;

        if (edad >= 18) {
            System.out.println("Puede entrar");
        } else if (edad >= 13 && acompañado) {
            System.out.println("Puede entrar con acompañante");
        } else {
            System.out.println("No puede entrar");
        }
    }
}