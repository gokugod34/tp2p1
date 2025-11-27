package modelo;

import estructuras.ListaEnlazada;
import estructuras.Nodo;
public class Universidad {
    private ListaEnlazada miembros;

    public Universidad() {
        miembros = new ListaEnlazada();
    }

    public void agregarMiembro(Object obj) {
        miembros.agregar(obj);
    }

    public int contarProfesores() {
        return contarProfesoresRecursivo(miembros.getPrimero());
    }

    private int contarProfesoresRecursivo(Nodo actual) {
        if (actual == null) {
            return 0;
        }

        int suma = (actual.getDato() instanceof Profesor) ? 1 : 0;
        return suma + contarProfesoresRecursivo(actual.getSiguiente());
    }
}
