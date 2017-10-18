/**
*Tema 5*
*Ejercicio 13
*Escribe un programa que lea una lista de diez números y determine cuántos
*son positivos, y cuántos son negativos.
*/

import java.util.Scanner;

public class Ejercicio13 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce 10 números: ");
    
    int numneg = 0;
    int numpos = 0;
    
     for (int i = 0; i < 10; i++) {
      if (s.nextInt() < 0) {
        numneg++;
      } else {
        numpos++;
      }
    }
    
    System.out.println("Números negativos: " + numneg);
    System.out.println("Números positivos: " + numpos);
    
  }
}

