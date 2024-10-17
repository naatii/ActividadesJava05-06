import daw2a.Java_ProgramaBasic_05_1.Matriz1;
import daw2a.Java_ProgramaBasic_05_1.Matriz2;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayEjemploTest {

    @Test
    public void testCrearArray() {
        Matriz1 matriz1 = new Matriz1();
        int[][] expected = {
                {0, 30, 2, 0, 0, 5},
                {75, 0, 0, 0, 0, 0},
                {0, 0, -2, 9, 0, 11}
        };

        int[][] actual = matriz1.inicializarMatriz();

        // Verificar que el array creado es igual al esperado
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testImprimirMatrizYSumas() {
        // Captura de salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Guarda la salida original
        System.setOut(new PrintStream(outputStream)); // Redirige la salida a outputStream

        // Crear una matriz de prueba
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        // Llamar al metodo que imprime la matriz
        Matriz2.imprimirMatrizYSumas(matriz);

        // Restablecer la salida estándar
        System.setOut(originalOut);

        // Resultado esperado
        String expectedOutput =
                "\nMatriz:\n" +
                        "1\t2\t3\t4\t5\t| 15\n" +
                        "6\t7\t8\t9\t10\t| 40\n" +
                        "11\t12\t13\t14\t15\t| 65\n" +
                        "16\t17\t18\t19\t20\t| 90\n" +
                        "--------------------\t\n" +
                        "34\t38\t42\t46\t50\t| 210\n";

        // Comparar la salida esperada con la salida capturada
        assertEquals(expectedOutput, outputStream.toString());
    }
}
