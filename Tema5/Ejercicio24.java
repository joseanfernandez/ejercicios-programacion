/**
*Tema 5
*Ejercicio 24
*Escribe un programa que lea un número n e imprima una pirámide 
de números con n filas como en la siguiente figura: 
*       1
*      121
*     12321
*    1234321
*/

import java.util.Scanner;


public class Ejercicio24 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Pirámide de números: ");
    System.out.println("Introduce la altura: ");
    int h = s.nextInt();
    int hmin = 1;
    int i = 0;
    int espacios = h - 1;
    
    while (hmin <= h) {
      
      for (i=1; i<= espacios; i++) {
        System.out.print(" ");
      }
      
      for (i=1; i < hmin; i++) {
        System.out.print(i);
      } 
      
      for (i = hmin; i > 0; i--) {
        System.out.print(i);
      } 
      
      System.out.println();
      espacios--;
      hmin++;
    }
  } 
}
