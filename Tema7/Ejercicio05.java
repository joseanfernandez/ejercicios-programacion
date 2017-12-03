/**
 * Tema 7
 * Ejercicio 05
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos 
 * junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.
 */

import java.util.Scanner;

public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce 10 números: ");
    int[] num = new int [10];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    for (int i = 0; i < 10; i++) {
      num [i] = s.nextInt();
      if (num [i] > max) {
        max = num [i];
      }
      if (num [i] < min) {
        min = num [i];
      }
    }
    System.out.println();

    for (int i = 0; i < 10; i++) {
      if (num[i] == max) {
        System.out.print(num[i]);
        System.out.println(" máximo");
      } else if (num[i] == min) {
        System.out.print(num[i]);
        System.out.println(" mínimo");
      } else {
        System.out.println(num[i]);
      }
    }
  } 
}
