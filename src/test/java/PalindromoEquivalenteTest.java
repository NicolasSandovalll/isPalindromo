import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoEquivalenteTest {

    @Test
    public void testNumeroEntero() {
        // Caso de prueba 1: Número entero (no es un palíndromo)
        assertFalse(PalindromoEquivalente.esPalindromo(String.valueOf(200)));
    }
    @Test
    public void testCaso7() {
        // Caso de prueba 3: "aaabccbaaa"
        assertTrue(PalindromoEquivalente.esPalindromo("aca"));
    }

    @Test
    public void testNumeroEntero2() {
        // Caso de prueba 1.1: Número entero (no es un palíndromo)
        assertFalse(PalindromoEquivalente.esPalindromo(String.valueOf(202)));
    }

    @Test
    public void testCadenaVacia() {
        // Caso de prueba 2: Cadena vacía (no es un palíndromo por definición)
        assertFalse(PalindromoEquivalente.esPalindromo(""));
    }

    @Test
    public void testCaso3() {
        // Caso de prueba 3: "aaabccbaaa"
        assertTrue(PalindromoEquivalente.esPalindromo("aaabccbaaa"));
    }

    @Test
    public void testCaso4() {
        // Caso de prueba 4: "ahabccbaaa"
        assertFalse(PalindromoEquivalente.esPalindromo("ahabccbaaa"));
    }

    @Test
    public void testCaso5() {
        // Caso de prueba 5: "A man, a plan, a canal, Panama!"
        assertTrue(PalindromoEquivalente.esPalindromo("A man, a plan, a canal, Panama!"));
    }

    @Test
    public void testCaso6() {
        // Caso de prueba 5: "La tele letal" (considerando solo letras y sin importar mayúsculas)
        assertTrue(PalindromoEquivalente.esPalindromo("La tele letal"));
    }
}
