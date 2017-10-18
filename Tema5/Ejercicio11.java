/**
*Tema 5*
*Ejercicio 11
*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
*los 5 primeros números enteros a partir de uno que se introduce por teclado.
*/

import java.util.Scanner;

public class Ejercicio11 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para conocer su cuadrado y su cubo: ");
    int num = s.nextInt();
    
    for (int i = num; i < num + 5; i++) {
      System.out.printf("%d   %10d   %10d\n", i, (i * i), (i * i * i) );
   
    }
  } 
}
