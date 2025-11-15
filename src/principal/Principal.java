package principal;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import modelos.URL;



public class Principal {


    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner eleccion = new Scanner(System.in);
        URL url = new URL();



            while (true) {
                System.out.println("""
                        Bienvenid/a al conversor de monedas!
                        
                         1) Dólar ==> Peso Argentino
                         2) Peso Argentino ==> Dólar
                         3) Dólar ==> Real brasileño
                         4) Real brasileño ==> Dólar
                         5) Dólar ==> Peso Colombiano
                         6) Peso Colombiano ==> Dólar
                         7) Salir
                        
                        Elija una opción válida:
                        ---------------------------------------------
                        """);
                try {
                    double elegido = eleccion.nextDouble();

                    if (elegido < 1 || elegido > 7) {
                        System.out.println("Elija una opción valida, gracias!!" +
                                "\n---------------------------------------------");
                    } else if (elegido == 1) {
                        String monedaBase = "USD";
                        String monedaDestino = "ARS";
                        System.out.println("Monto a convertir: ");
                        double valor = eleccion.nextDouble();
                        url.miMetodo(monedaBase, monedaDestino, valor);
                    } else if (elegido == 2) {
                        String monedaBase = "ARS";
                        String monedaDestino = "USD";
                        System.out.println("Monto a convertir: ");
                        double valor = eleccion.nextDouble();
                        url.miMetodo(monedaBase, monedaDestino, valor);
                    } else if (elegido == 3) {
                        String monedaBase = "USD";
                        String monedaDestino = "BRL";
                        System.out.println("Monto a convertir: ");
                        double valor = eleccion.nextDouble();
                        url.miMetodo(monedaBase, monedaDestino, valor);
                    } else if (elegido == 4) {
                        String monedaBase = "BRL";
                        String monedaDestino = "USD";
                        System.out.println("Monto a convertir: ");
                        double valor = eleccion.nextDouble();
                        url.miMetodo(monedaBase, monedaDestino, valor);
                    } else if (elegido == 5) {
                        String monedaBase = "USD";
                        String monedaDestino = "COP";
                        System.out.println("Monto a convertir: ");
                        double valor = eleccion.nextDouble();
                        url.miMetodo(monedaBase, monedaDestino, valor);
                    } else if (elegido == 6) {
                        String monedaBase = "COP";
                        String monedaDestino = "USD";
                        System.out.println("Monto a convertir: ");
                        double valor = eleccion.nextDouble();
                        url.miMetodo(monedaBase, monedaDestino, valor);
                    } else if (elegido == 7) {
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("""
                            Si digitaste una opcion que no estaba en el menú de opciones, por favor elegir una correcta.
                            Si utilizaste el caracter . , por favor utiliza la coma, sino en viceversa.
                            \n---------------------------------------------"""
                    );
                    eleccion.nextLine();
                }
            }
    }
}









