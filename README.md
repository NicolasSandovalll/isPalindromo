Qué hace el método?

verifica si una cadena de caracteres ingreseda es un palindromo.

Cómo lo hace?

Inicializa una varible de tipo string llamada "resultado",luego la cadena de caracteres ingresada se separa mediante en una array, luego se invierte y se une nuevamente, finalmente se compara la cadena ingresada con ese misma cadena pero invertida.

Cómo lo uso?

Ejemplos:
- esPalindromo(palabra)
- esPalindromo(oso)

Qué resultado se obtiene con el método equivalente pero en java?
- se comprueba que "aca" si es un palindromo y pasa la prueba
- se comprueba que "acas" no es un palindromo y pasa la prueba
- se comprueba que "h" no es un palindromo y no pasa la prueba
- se comprueba con assertFalse que "200" no es un palindromo y arroja verdadero.
- se comprueba con assertFalse que una cadena vacia "" no es un palindromo y no pasa la prueba
- se comprueba con assertTrue que "aaabccbaaa" es un palindromo y pasa la prueba
- se ingrese " la tele letal" y debería decir que si es un palindromo , pero no lo hace ,por lo que no pasa la prueba.

De las pruebas unitarias que concluciones sacaron?
- si se ingrese solo una letra no debe ser un palindromo
- se tiene que limpiar la entrada ante de ingresar la palabra
- se tiene que verificar si la entrada es un string y si es mas grande que 1.
- una cadena vacia no debe ser considerada un palindromo
- los numeros no pueden ser palindromos