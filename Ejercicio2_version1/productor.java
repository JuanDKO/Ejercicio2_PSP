public class productor extends Thread {

    private buffer numeros;

    public productor(buffer b) {
        this.numeros = b;
    }

    public static int generador() {
        // Genero numeros enteros que devolver
        return (int) ((Math.random()) * 11);
    }

    @Override
    public void run() {
        try {
            // Creo un bucle infinito para que se repita sin descanso
            while (true) {
                int random = generador();
                numeros.producir(random);
                Thread.sleep(1000); // Simulamos algo del trabajo
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
