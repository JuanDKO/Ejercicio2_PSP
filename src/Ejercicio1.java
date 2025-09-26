import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio1 {

    private class contar {
        private String letra;

        private String lectura;

        private String Escritura;

        public contar(String letra, String leer, String escribir) {
            this.letra = letra;
            this.lectura = leer;
            this.Escritura = escribir;
        }

        public int contarLetra() {
            int contador = 0;
            try(BufferedReader in = new BufferedReader(new FileReader(lectura))) {
                int caracterleido;
                while ((caracterleido = in.read()) != -1) {
                    char let = (char) caracterleido;
                    String letraaComprobar = String.valueOf(let);

                    switch (letraaComprobar.toLowerCase()) {
                        case "a":
                            if (comprobarTildeA(letraaComprobar)) {
                                contador++;
                            }
                            break;
                        case "e":
                            if (comprobarTildeE(letraaComprobar)) {
                                contador++;
                            }
                            break;
                        case "i":
                            if (comprobarTildeI(letraaComprobar)) {
                                contador++;
                            }
                            break;
                        case "o":
                            if (comprobarTildeO(letraaComprobar)) {
                                contador++;
                            }
                            break;
                        case "u":
                            if (comprobarTildeU(letraaComprobar)) {
                                contador++;
                            }
                            break;
                    }
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }


            return contador;
        }

        public boolean comprobarTildeA(String letra) {
            if (letra.equalsIgnoreCase("a") && letra.equalsIgnoreCase("á")) {
                return true;
            }else {
                return false;
            }
        }
        public boolean comprobarTildeE(String letra) {
            if (letra.equalsIgnoreCase("e") && letra.equalsIgnoreCase("é")) {
                return true;
            }else {
                return false;
            }
        }
        public boolean comprobarTildeI(String letra) {
            if (letra.equalsIgnoreCase("i") && letra.equalsIgnoreCase("í")) {
                return true;
            }else {
                return false;
            }
        }
        public boolean comprobarTildeO(String letra) {
            if (letra.equalsIgnoreCase("o") && letra.equalsIgnoreCase("ó")) {
                return true;
            }else {
                return false;
            }
        }
        public boolean comprobarTildeU(String letra) {
            if (letra.equalsIgnoreCase("u") && letra.equalsIgnoreCase("ú")) {
                return true;
            }else {
                return false;
            }
        }




    }

    public static void main(String[] args) {
        final String LECTURA_A ="src/CuentaA.txt";
        final String LECTURA_E ="src/CuentaE.txt";
        final String LECTURA_I ="src/CuentaI.txt";
        final String LECTURA_O ="src/CuentaO.txt";
        final String LECTURA_U ="src/CuentaU.txt";


    }
}