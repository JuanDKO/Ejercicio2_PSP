public class consumidor extends Thread{

    private buffer numeros;

    public consumidor(buffer b) {
        this.numeros = b;
    }

    @Override
    public void run() {
        try {
            // Creo otro bucle infinito para que se siga ejecutando el hilo sin descanso
            while (true) {
                int consumido = numeros.consumir();
                System.out.println("Se ha consumido el numero: " + consumido);
                Thread.sleep(1000) ; // Simulamos trabajo
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
