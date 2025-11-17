public class Bucles {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int contador = 5;
        while (contador > 0) {
            System.out.println(contador);
            contador--;
        }

        int x = 1;
        do {
            System.out.println("Valor: " + x);
            x++;
        } while (x <= 3);
    }
}