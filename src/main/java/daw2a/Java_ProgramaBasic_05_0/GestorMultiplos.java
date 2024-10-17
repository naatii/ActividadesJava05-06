package daw2a.Java_ProgramaBasic_05_0;


import java.util.Random;
import java.util.Scanner;


/*Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se
volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes*/


import java.util.Random;

public class GestorMultiplos {

    // Metodo que genera un array de 20 números aleatorios entre 0 y 400
    public static int[] generarNumerosAleatorios(int size, int limiteSuperior) {
        Random random = new Random();
        int[] listaNumeros = new int[size];

        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = random.nextInt(limiteSuperior + 1); // Limite superior incluido
        }

        return listaNumeros;
    }

    // Metodo que resalta los múltiplos de 5 o 7 en el array
    public static String resaltarMultiplos(int[] listaNumeros, int numero) {
        if (numero != 5 && numero != 7) {
            return "Numero invalido";
        }

        StringBuilder resultado = new StringBuilder("Numeros múltiplos de " + numero + " :\n");

        for (int num : listaNumeros) {
            if (num % numero == 0) {
                resultado.append("[").append(num).append("] ");
            } else {
                resultado.append(num).append(" ");
            }
        }

        return resultado.toString().trim();
    }

    // Metodo que ejecuta el programa principal (usado solo para correr el programa)
    public static void ejercicio16() {
        int[] listaNumeros = generarNumerosAleatorios(20, 400);

        // Muestra el array generado
        System.out.println("Lista de números:");
        for (int num : listaNumeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Pregunta al usuario qué múltiplos resaltar
        System.out.print("¿Qué quiere resaltar múltiplo de 5 o de 7? -> ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();

        // Muestra el resultado con los múltiplos resaltados o el mensaje de error
        String resultado = resaltarMultiplos(listaNumeros, numero);
        System.out.println(resultado);
    }
}
