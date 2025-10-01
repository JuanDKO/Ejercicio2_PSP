public class main {
    public static void main(String[] args) {
        buffer num = new buffer();

        productor prod = new productor(num);
        consumidor cons = new consumidor(num);

        prod.start();
        cons.start();
    }
}
