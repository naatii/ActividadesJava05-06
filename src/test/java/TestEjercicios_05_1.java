import daw2a.Java_ProgramaBasic_05_1.Matriz1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
}
