public class Cola {
    private Nodo primero;
    private Nodo ultimo;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }

    public void enqueue(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public int dequeue() {
        if (primero != null) {
            int dato = primero.dato;
            Nodo aux = primero;
            primero = primero.siguiente;
            if (primero == null) {
                ultimo = null;
            }
            aux.siguiente = null;
            return dato;
        } else {
            return -1;
        }
    }

    public int consultar() {
        if (primero == null) {
            return -1;
        } else {
            return primero.dato;
        }
    }

    public boolean isEmpty() {
        return primero == null;
    }
}