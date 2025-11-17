public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana Torres", 15, "Programación Java");
        Estudiante luis = new Estudiante("Luis Mendez", 16, "Programación Java");

        ana.presentarse();
        ana.estudiar();
        ana.agregarCalificacion(8.5);
        ana.agregarCalificacion(9.0);
        System.out.println("Promedio de Ana: " + ana.obtenerPromedio());

        luis.presentarse();
        luis.agregarCalificacion(7.5);
        System.out.println("Promedio de Luis: " + luis.obtenerPromedio());
    }
}