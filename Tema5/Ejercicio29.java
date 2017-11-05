/**
*Tema 5
*Ejercicio 29
*Escribe un programa que muestre por pantalla todos los números enteros
*positivos menores a uno leído por teclado que no sean divisibles entre 
*otro también leído de igual forma.

*/

import java.util.Scanner;


public class Ejercicio29 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    int numero = s.nextInt();
    System.out.println("Introduce otro número: ");
    int divisor = s.nextInt();
    
    System.out.println("Los números enteros positivos comprendidos entre 0 y " + numero + " y que no son divisbles entre " + divisor + " son: ");  
    for (int i = 0; i < numero; i ++) {
      if (i % divisor != 0) {
        System.out.print(i + " ");
      }
    }
  } 
}
