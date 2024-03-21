public class Pila {
    private Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public int pop() {
        if (tope != null) {
            int dato = tope.dato;
            Nodo aux = tope;
            tope = tope.siguiente;
            aux.siguiente = null;
            return dato;
        } else {
            return -1;
        }
    }

    public int consultar() {
        if (tope == null) {
            return -1;
        } else {
            return tope.dato;
        }
    }

    public boolean isEmpty() {
        return tope == null;
    }
}