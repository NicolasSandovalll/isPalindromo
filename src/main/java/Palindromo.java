import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindromo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma() {
        int opcion;
        do {
            mostrarMenu();
            opcion = solicitarEntero("Ingrese su opción: ");
            procesarOpcion(opcion);
        } while (opcion != 2);
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n|||Menú|||\n");
        System.out.println("1.- Verificar si una palabra o frase es un palíndromo");
        System.out.println("2.- Salir\n");
    }

    public static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                verificarPalindromo();
                break;
            case 2:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
        }
    }

    public static int solicitarEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
    }

    public static void verificarPalindromo() {
        String entrada = obtenerEntradaLimpia();
        if (entrada.isEmpty()) {
            System.out.println("No se ingresó ninguna palabra o frase.");
        } else if (esFraseValida(entrada)) {
            verificarYMostrarResultado(entrada);
        } else {
            System.out.println("La palabra/frase es inválida y no puede ser un palíndromo.");
        }
    }

    public static String obtenerEntradaLimpia() {
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese una palabra o frase: ");
        // Eliminar espacios en blanco al inicio y al final
        return scanner.nextLine().trim();
    }

    public static void verificarYMostrarResultado(String entrada) {
        String palabraLimpia = normalizarEntrada(entrada);
        if (esPalindromo(palabraLimpia)) {
            System.out.println("La palabra/frase es un palíndromo.");
        } else {
            System.out.println("La palabra/frase no es un palíndromo.");
        }
    }

    public static boolean esFraseValida(String palabra) {
        // Verifica si la palabra/frase contiene solo letras y espacios, incluyendo caracteres acentuados y ñ
        return palabra.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+");
    }

    public static String normalizarEntrada(String palabra) {
        // Elimina todos los caracteres que no sean letras y convierte a minúsculas
        return palabra.replaceAll("[^a-zA-ZñÑáéíóúÁÉÍÓÚ]", "").toLowerCase();
    }

    public static boolean esPalindromo(String palabra) {
        // Compara la palabra con su versión invertida
        return palabra.contentEquals(new StringBuilder(palabra).reverse());
    }
}
