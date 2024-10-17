package daw2a.Java_ProgramaBasic_05_1;
import java.util.Scanner;

/*Ejercicio 2
Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array
de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que
si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.*/


public class Matriz2 {
    public static void ejercicio2() {
        int[][] matriz = new int[4][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce 20 números enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        imprimirMatrizYSumas(matriz);
    }

    public static void imprimirMatrizYSumas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int sumaTotal = 0;

        System.out.println("\nMatriz:");
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFila += matriz[i][j];
            }
            sumaTotal += sumaFila;
            System.out.println("| " + sumaFila);
        }

        System.out.println("--------------------\t");

        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.print(sumaColumna + "\t");
        }

        System.out.println("| " + sumaTotal);
    }
}