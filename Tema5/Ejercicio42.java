 /**
*Tema 5
*Ejercicio 42
*Escribe un programa que pida un número entero positivo por teclado y que muestre
*a continuación los 5 números consecutivos a partir del número introducido. 
*Al lado de cada número se debe indicar si se trata de un primo o no.
*/

import java.util.Scanner;


public class Ejercicio42 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para saber si es primo: ");
    int numero = s.nextInt();
    int contador = 5;
    
    while (contador > 0) {
      
      if (((numero % 2) != 0) && ((numero % 3) != 0) && ((numero % 5) != 0)  && ((numero % 7) != 0)) {
        System.out.println(numero + " es primo.");
      } else {
        System.out.println(numero + " no es primo.");
      }
    
    contador--;
    numero++;
    
    }
  } 
}
