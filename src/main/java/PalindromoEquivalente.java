public class PalindromoEquivalente {

    public static boolean esPalindromo(String cadena) {
        // Convertir la cadena en un array de caracteres, invertirlo, y unirlo de nuevo
        String resultado = new StringBuilder(cadena).reverse().toString();

        // Comparar la cadena original con la invertida
        return cadena.equals(resultado);
    }
}