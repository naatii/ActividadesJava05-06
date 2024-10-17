import daw2a.Java_ProgramaBasic_05_0.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ejercicios_05_0_ESTest {

    @Test
    public void testBuscarMesaVacia() {
        int[] mesas1 = {1, 2, 0, 4, 3, 1, 0, 2, 1, 1}; // Mesa vacía en índice 2
        assertEquals(2, GestionMesas.buscarMesaVacia(mesas1));
        int[] mesas2 = {1, 2, 1, 4, 3, 1, 0, 2, 1, 1}; // Mesa vacía en índice 2
        assertEquals(6, GestionMesas.buscarMesaVacia(mesas2));

        int[] mesas3 = {1, 2, 3, 4, 4, 1, 4, 2, 1, 1}; // Sin mesas vacías
        assertEquals(-1, GestionMesas.buscarMesaVacia(mesas3));
    }

    @Test
    public void testBuscarMesaConEspacio() {
        int[] mesas1 = {1, 2, 2, 4, 3, 1, 1, 2, 1, 1}; // Hay espacio en la mesa en índice 0
        assertEquals(0, GestionMesas.buscarMesaConEspacio(mesas1, 2));

        int[] mesas2 = {3, 4, 3, 4, 4, 1, 4, 2, 1, 1}; // Sin espacio para un grupo de 2
        assertEquals(5, GestionMesas.buscarMesaConEspacio(mesas2, 2));
    }

    @Test
    public void testGenerarNumerosAleatorios() {
        // Generamos un array de 20 números aleatorios entre 0 y 400
        int[] numeros = GestorMultiplos.generarNumerosAleatorios(20, 400);

        assertEquals(20, numeros.length);  // Verificamos que el tamaño es correcto
        for (int num : numeros) {
            assertTrue(num >= 0 && num <= 400);  // Verificamos que los números están dentro del rango
        }
    }

    @Test
    public void testResaltarMultiplosDe5() {
        // Array simulado para el test
        int[] listaNumeros = {5, 10, 12, 15, 23, 30};

        // Resaltamos los múltiplos de 5
        String resultado = GestorMultiplos.resaltarMultiplos(listaNumeros, 5);

        // Verificamos el resultado esperado
        String resultadoEsperado = "Numeros múltiplos de 5 :\n[5] [10] 12 [15] 23 [30]";
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testResaltarMultiplosDe7() {
        // Array simulado para el test
        int[] listaNumeros = {7, 14, 13, 21, 30, 35};

        // Resaltamos los múltiplos de 7
        String resultado = GestorMultiplos.resaltarMultiplos(listaNumeros, 7);

        // Verificamos el resultado esperado
        String resultadoEsperado = "Numeros múltiplos de 7 :\n[7] [14] 13 [21] 30 [35]";
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testNumeroInvalido() {
        // Array simulado para el test
        int[] listaNumeros = {10, 20, 30, 40};

        // Intentamos resaltar múltiplos de un número inválido (por ejemplo, 3)
        String resultado = GestorMultiplos.resaltarMultiplos(listaNumeros, 3);

        // Verificamos que el resultado sea "Numero invalido"
        assertEquals("Numero invalido", resultado);
    }
}
