import java.util.LinkedList;

// En la clase buffer se van a llevar a cabo la mayoria de acciones
public class buffer {
    private LinkedList<Integer> numeros = new LinkedList<>();
    private final int limite = 3;

    //La función producir debe añadir un valor a la lista del buffer y comprobar si el mismo esta lleno
    public synchronized void producir(int numero) throws Exception {
        //El tamaño de la lista esta en el limite asi que espera
        if (numeros.size() == limite) {
            System.out.println("el buffer esta lleno, esperando espacio libre");
            wait();
        }

        numeros.add(numero);
        System.out.println("numero introducido correctamente");
        notifyAll(); // aviso al consumidor de que hay un valor disponible para eliminar
    }

    //La función consumir debe devolver el dato para que se muestre por pantalla y comprobar si el buffer esta vacio
    public synchronized int consumir() throws Exception {
        //Mientras que el buffer este vacio espera a que llegue otro numero
        while (numeros.isEmpty()) {
            System.out.println("el buffer esta vacio esperando numero");
            wait();
        }
        // Elimina el primero que es el mas antiguo para dar espacio a otro
        int eliminado = numeros.getFirst();
        numeros.removeFirst();
        notifyAll(); // aviso al productor de que tiene espacio disponible
        return eliminado;
    }
}
