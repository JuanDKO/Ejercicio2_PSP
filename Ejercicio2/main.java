public class main {
    public static void main(String[] args) {
        buffer num = new buffer();

        productor prod1 = new productor(num);
        consumidor cons1 = new consumidor(num);
        productor prod2 = new productor(num);
        consumidor cons2 = new consumidor(num);

        prod1.start();
        prod2.start();
        cons1.start();
        cons2.start();
    }
}
