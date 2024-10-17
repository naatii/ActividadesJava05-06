import daw2a.Java_ProgramaBasic_06.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class TestEjercicios_06 {

    @Test
    public void testEsCapicua() {
        assertTrue(BibliotecaFunciones.esCapicua(12321));
        assertFalse(BibliotecaFunciones.esCapicua(12345));
        assertTrue(BibliotecaFunciones.esCapicua(0)); // Un solo dígito también es capicúa
    }

    @Test
    public void testEsPrimo() {
        assertTrue(BibliotecaFunciones.esPrimo(7));
        assertFalse(BibliotecaFunciones.esPrimo(4));
        assertFalse(BibliotecaFunciones.esPrimo(1)); // 1 no es primo
        assertTrue(BibliotecaFunciones.esPrimo(2)); // 2 es primo
    }

    @Test
    public void testSiguientePrimo() {
        assertEquals(11, BibliotecaFunciones.siguientePrimo(10));
        assertEquals(7, BibliotecaFunciones.siguientePrimo(5));
        assertEquals(2, BibliotecaFunciones.siguientePrimo(0));
    }

    @Test
    public void testPotencia() {
        assertEquals(8, BibliotecaFunciones.potencia(2, 3));
        assertEquals(1, BibliotecaFunciones.potencia(5, 0));
        assertEquals(5, BibliotecaFunciones.potencia(5, 1));
    }

    @Test
    public void testDigitos() {
        assertEquals(5, BibliotecaFunciones.digitos(12345));
        assertEquals(1, BibliotecaFunciones.digitos(0)); // El número 0 tiene 1 dígito
        assertEquals(6, BibliotecaFunciones.digitos(123456));
    }

    @Test
    public void testVoltea() {
        assertEquals(4321, BibliotecaFunciones.voltea(1234));
        assertEquals(1, BibliotecaFunciones.voltea(1)); // Un solo dígito se mantiene igual
        assertEquals(0, BibliotecaFunciones.voltea(0)); // El número 0 debe mantenerse igual
    }

    @Test
    public void testDigitoN() {
        assertEquals(3, BibliotecaFunciones.digitoN(12345, 2));
        assertEquals(1, BibliotecaFunciones.digitoN(12345, 0));
        assertEquals(-1, BibliotecaFunciones.digitoN(12345, 5)); // Fuera de rango
    }

    @Test
    public void testPosicionDeDigito() {
        assertEquals(4, BibliotecaFunciones.posicionDeDigito(12345, 5));
        assertEquals(0, BibliotecaFunciones.posicionDeDigito(12345, 1));
        assertEquals(-1, BibliotecaFunciones.posicionDeDigito(12345, 9)); // El dígito 9 no está presente
    }

    @Test
    public void testQuitaPorDetras() {
        assertEquals(123, BibliotecaFunciones.quitaPorDetras(12345, 2));
        assertEquals(1, BibliotecaFunciones.quitaPorDetras(1234, 3));
        assertEquals(0, BibliotecaFunciones.quitaPorDetras(123, 5)); // Si quitamos más dígitos de los disponibles
    }

    @Test
    public void testQuitaPorDelante() {
        assertEquals(345, BibliotecaFunciones.quitaPorDelante(12345, 2));
        assertEquals(4, BibliotecaFunciones.quitaPorDelante(1234, 3));
        assertEquals(0, BibliotecaFunciones.quitaPorDelante(1234, 5)); // Si quitamos más dígitos de los disponibles
    }

    @Test
    public void testPegaPorDetras() {
        assertEquals(12346, BibliotecaFunciones.pegaPorDetras(1234, 6));
        assertEquals(10, BibliotecaFunciones.pegaPorDetras(1, 0));
        assertEquals(987654, BibliotecaFunciones.pegaPorDetras(98765, 4));
    }

    @Test
    public void testPegaPorDelante() {
        assertEquals(12345, BibliotecaFunciones.pegaPorDelante(2345, 1));
        assertEquals(98765, BibliotecaFunciones.pegaPorDelante(8765, 9));
        assertEquals(10, BibliotecaFunciones.pegaPorDelante(0, 1));
    }

    @Test
    public void testTrozoDeNumero() {
        assertEquals(234, BibliotecaFunciones.trozoDeNumero(123456, 1, 3));
        assertEquals(123, BibliotecaFunciones.trozoDeNumero(123456, 0, 2));
        assertEquals(-1, BibliotecaFunciones.trozoDeNumero(123456, 2, 7)); // Fuera de rango
    }

    @Test
    public void testJuntaNumeros() {
        assertEquals(123456, BibliotecaFunciones.juntaNumeros(123, 456));
        assertEquals(1020, BibliotecaFunciones.juntaNumeros(10, 20));
        assertEquals(10, BibliotecaFunciones.juntaNumeros(1, 0));
    }
}
