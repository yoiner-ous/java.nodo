using system;

class Nodo
{
    public int dato;
    public Nodo siguiente;

    public Nodo(int dato)
    {
        this.dato = dato;
        this.siguiente = null;
    }
}

class program
{
    public static void main(string[] args)
    {
        Nodo nodo1 = new Nodo(10);
        Nodo nodo2 = new Nodo(20);
        Nodo nodo3 = new Nodo(30);

        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;

        Nodo actual = nodo1;

        while (actual != null){
            system.out.println(actual.dato);
            actual = actual.siguiente;
        }

        
    }
}