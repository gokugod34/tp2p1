
package modelo;

import estructuras.ListaEnlazada;
public class Profesor {
    private String nombre;
    private String apellido;
    private ListaEnlazada materiasAsignadas;

    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAsignadas = new ListaEnlazada();
    }

    public void agregarMateria(Materia m) {
        materiasAsignadas.agregar(m);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}

