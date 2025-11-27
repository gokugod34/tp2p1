package estructuras;
public class ListaEnlazada {
    private Nodo primero;

    public ListaEnlazada() {
        primero = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void agregar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public int tamaño() {
        int contador = 0;
        Nodo actual = primero;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public Object[] convertirAArray() {
        int tamaño = tamaño();
        Object[] array = new Object[tamaño];

        Nodo actual = primero;
        int i = 0;

        while (actual != null) {
            array[i] = actual.dato;
            actual = actual.siguiente;
            i++;
        }

        return array;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public static ListaEnlazada convertirArrayALista(Object[] array) {
        ListaEnlazada nueva = new ListaEnlazada();
        for (Object o : array) {
            nueva.agregar(o);
        }
        return nueva;
    }
}
