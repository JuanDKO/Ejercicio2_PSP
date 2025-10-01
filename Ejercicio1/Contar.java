import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

    public class Contar extends Thread {
        private String letra;

        private String lectura;

        private String escritura;

        public Contar(String letra, String leer, String escribir) {
            this.letra = letra;
            this.lectura = leer;
            this.escritura = escribir;
        }

        public int contarLetra() {
            int contador = 0;
            try(BufferedReader in = new BufferedReader(new FileReader(lectura))) {
                int caracterleido;
                while ((caracterleido = in.read()) != -1) {
                    char let = (char) caracterleido;
                    String letraaComprobar = String.valueOf(let);

                    switch (letra.toLowerCase()) {
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
        public void subirDatos() {
            try(BufferedWriter out = new BufferedWriter(new FileWriter(escritura))) {
                out.write(String.valueOf(contarLetra()));
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        public boolean comprobarTildeA(String letra) {
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("á")) {
                return true;
            }else {
                return false;
            }
        }
        public boolean comprobarTildeE(String letra) {
            if (letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("é")) {
                return true;
            }else {
                return false;
            }
        }
        public boolean comprobarTildeI(String letra) {
            if (letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("í")) {
                return true;
            }else {
                return false;
            }
        }
        public boolean comprobarTildeO(String letra) {
            if (letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("ó")) {
                return true;
            }else {
                return false;
            }
        }
        public boolean comprobarTildeU(String letra) {
            if (letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("ú")) {
                return true;
            }else {
                return false;
            }
        }


        @Override
        public void run() {
            subirDatos();
        }

        public void secuencial_run() {
                    subirDatos();
            System.out.println(" terminó.");
        }
    }

