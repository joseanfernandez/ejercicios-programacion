/**
*Tema 5
*Ejercicio 27
*Escribe un programa que muestre, cuente y sume los múltiplos de 3 
*que hay entre 1 y un número leído por teclado.
*/

import java.util.Scanner;


public class Ejercicio27 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce un número para saber:");
    System.out.println("- Cuántos múltiplos de 3 hay entre 1 y tu número.");
    System.out.println("- La suma de ellos.");
    int numero = s.nextInt();
    int contador = 0;
    int sumatorio = 0;
    
    for (int i = 1; i <= numero; i++) {
      if (i % 3 == 0) {
        contador++;
        sumatorio += iSystem.out.println("Introduce un número para saber: ");;
      }  
    }
    System.out.println("Hay " + contador + " múltiplos de 3");
    System.out.println("Los múltiplos suman " + sumatorio);
  } 
}
