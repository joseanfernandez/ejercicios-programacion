/**
*Tema 5*
*Ejercicio 15
*Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
*saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido.
*No se deben utilizar funciones de exponenciación. 
*Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
*/

import java.util.Scanner;

public class Ejercicio15 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la base: ");
    int base = s.nextInt();
    
    System.out.print("Introduce el exponente: ");
    int exp = s.nextInt();
    
    for (int i = 1; i <= exp; i++)  {
      System.out.print(" " + base + "^" + i);

    }
  } 
}
