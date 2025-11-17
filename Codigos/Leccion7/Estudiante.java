public class Estudiante {
    String nombre;
    int edad;
    String curso;
    double promedio;

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.promedio = 0.0;
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando...");
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y estoy en el curso " + curso);
    }

    public void agregarCalificacion(double nota) {
        this.promedio = (this.promedio + nota) / 2;
    }

    public double obtenerPromedio() {
        return this.promedio;
    }
}