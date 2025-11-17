import java.util.ArrayList;

public class RegistroMascotas {
    private ArrayList<Mascota> listaMascotas;

    public RegistroMascotas() {
        listaMascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        listaMascotas.add(mascota);
        System.out.println("Mascota agregada correctamente.");
    }

    public void mostrarMascotas() {
        if (listaMascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
        } else {
            System.out.println("Lista de mascotas:");
            for (Mascota m : listaMascotas) {
                m.mostrarInformacion();
            }
        }
    }

    public Mascota buscarPorNombre(String nombre) {
        for (Mascota m : listaMascotas) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                return m;
            }
        }
        return null;
    }

    public boolean actualizarMascota(String nombreBuscar, String nuevoNombre, int nuevaEdad, String nuevoTipo) {
        Mascota mascota = buscarPorNombre(nombreBuscar);
        if (mascota != null) {
            mascota.setNombre(nuevoNombre);
            mascota.setEdad(nuevaEdad);
            mascota.setTipo(nuevoTipo);
            return true;
        }
        return false;
    }
}