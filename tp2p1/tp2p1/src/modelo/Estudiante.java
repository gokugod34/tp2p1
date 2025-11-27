package modelo;

import estructuras.ListaEnlazada;
import estructuras.Nodo;

public class Estudiante {
    private String nombre;
    private String apellido;
    private ListaEnlazada materias;  

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = new ListaEnlazada();
    }

    public void agregarMateria(Materia m) {
        materias.agregar(m);
    }

    public double calcularPromedioIterativo() {
        Nodo actual = materias.getPrimero();
        double suma = 0;
        int contador = 0;

        while (actual != null) {
            Object dato = actual.getDato();
            if (dato instanceof Materia) {
                Materia mat = (Materia) dato;
                suma += mat.getNota();
                contador++;
            }
            actual = actual.getSiguiente();
        }

        return (contador == 0) ? 0 : suma / contador;
    }

    public double calcularPromedioRecursivo() {
        return calcularPromedioRecursivo(materias.getPrimero(), 0, 0);
    }

    private double calcularPromedioRecursivo(Nodo actual, int contador, double suma) {
        if (actual == null) {
            return contador == 0 ? 0 : suma / contador;
        }

        Object dato = actual.getDato();
        if (dato instanceof Materia) {
            Materia materia = (Materia) dato;
            return calcularPromedioRecursivo(actual.getSiguiente(), contador + 1, suma + materia.getNota());
        } else {
            return calcularPromedioRecursivo(actual.getSiguiente(), contador, suma);
        }
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
