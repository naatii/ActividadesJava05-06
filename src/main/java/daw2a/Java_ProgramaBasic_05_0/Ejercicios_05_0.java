package daw2a.Java_ProgramaBasic_05_0;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios_05_0 {
    static final int MAXPERSONAS = 4;
    static final int NUM_MESAS = 10;
    public static void ejercicio15() {

        int[] mesas = new int[NUM_MESAS];
        inicializarMesas(mesas);
        int grupo;
        while (true) {
            imprimirEstadoMesas(mesas);

            grupo = entrada("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");

            if (grupo == -1) {
                imprimirMensaje("Gracias por usar el programa. ¡Hasta luego!");
                break;
            }

            if (grupo > MAXPERSONAS) {
                imprimirMensaje("Lo siento, no admitimos grupos de " + grupo + ", haga grupos de 4 personas como máximo e intente de nuevo.");
                continue;
            }

            int mesaIndex = buscarMesaVacia(mesas);
            if (mesaIndex != -1) {
                mesas[mesaIndex] = grupo;
                imprimirMensaje("Por favor, siéntense en la mesa número " + (mesaIndex + 1) + ".");
            } else {
                mesaIndex = buscarMesaConEspacio(mesas, grupo);
                if (mesaIndex != -1) {
                    mesas[mesaIndex] += grupo; // Añadimos el grupo a la mesa
                    imprimirMensaje("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (mesaIndex + 1) + ".");
                } else {
                    imprimirMensaje("Lo siento, en estos momentos no queda sitio.");
                }
            }
        }
    }

    public static void inicializarMesas(int[] mesas){
        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = obtenerNumeroAleatorio(0, MAXPERSONAS);
        }
    }

    public static void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void imprimirEstadoMesas(int[] mesas) {
        System.out.println("\nMesa no   1  2  3  4  5  6  7  8  9  10");
        System.out.print("Ocupación ");
        for (int mesa : mesas) {
            System.out.print(mesa + "  ");
        }
        System.out.println();
    }

    public static int buscarMesaVacia(int[] mesas) {
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int buscarMesaConEspacio(int[] mesas, int grupo) {
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] + grupo <= 4) {
                return i;
            }
        }
        return -1;
    }


    public static int entrada(String textoEntrada) {
        Scanner sc = new Scanner(System.in);
        System.out.println(textoEntrada);
        return sc.nextInt();
    }

    public static int obtenerNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static void ejercicio16() {
    }
}
