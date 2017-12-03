/**
 * Tema 7
 * Ejercicio 02
 * Define un array de 10 caracteres con nombre simbolo y asigna valores
 * a los elementos según la tabla que se muestra a continuación.
 * Muestra el contenido de todos los elementos del array. 
 * ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 */

public class Ejercicio02 { // Clase principal
  public static void main(String[] args) {
    
    char[] caracter = new char[10];
                
    caracter[0] = 'a';
    caracter[1] = 'x';
    caracter[4] = '@';
    caracter[6] = ' ';
    caracter[7] = '+';
    caracter[8] = 'Q';
   
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < caracter.length; i++) {  
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int i = 0; i < caracter.length; i++) { 
      if (caracter[i] == '\u0000') {
        System.out.print("│     ");
      } else { 
        System.out.printf("│%-4s ", caracter[i]);
      }
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

  } 
}
