import daw2a.Java_ProgramaBasic_05_0.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
