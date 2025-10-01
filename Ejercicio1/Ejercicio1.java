import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio1 extends Thread {


    public static void main(String[] args) {
        final String LEER = "src/leer.txt";
        final String LECTURA_A ="src/CuentaA.txt";
        final String LECTURA_E ="src/CuentaE.txt";
        final String LECTURA_I ="src/CuentaI.txt";
        final String LECTURA_O ="src/CuentaO.txt";
        final String LECTURA_U ="src/CuentaU.txt";

         new Contar("a",LEER,LECTURA_A).secuencial_run();
         new Contar("e",LEER,LECTURA_E).secuencial_run();
         new Contar("i",LEER,LECTURA_I).secuencial_run();
         new Contar("o",LEER,LECTURA_O).secuencial_run();
         new Contar("u",LEER,LECTURA_U).secuencial_run();

        System.out.println("Cantidad de A: " +  escribirLetra(LECTURA_A));
        System.out.println("Cantidad de E: " +  escribirLetra(LECTURA_E));
        System.out.println("Cantidad de I: " +  escribirLetra(LECTURA_I));
        System.out.println("Cantidad de O: " +  escribirLetra(LECTURA_O));
        System.out.println("Cantidad de U: " +  escribirLetra(LECTURA_U));

    }


    public static String escribirLetra(String lectura) {
        String numero = "";
        try(BufferedReader in = new BufferedReader(new FileReader(lectura))) {
            numero = in.readLine();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return numero;
    }
}