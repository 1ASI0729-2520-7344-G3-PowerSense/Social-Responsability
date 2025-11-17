public class Mascota {
    private String nombre;
    private int edad;
    private String tipo;

    public Mascota(String nombre, int edad, String tipo) {
        setNombre(nombre);
        setEdad(edad);
        setTipo(tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isEmpty()) {
            this.tipo = tipo;
        } else {
            this.tipo = "No especificado";
        }
    }

    public void mostrarInformacion() {
        System.out.println("Mascota: " + nombre + ", Edad: " + edad + ", Tipo: " + tipo);
    }
}