/**
*Tema 5*
*Ejercicio 4
*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
*utilizando un bucle for .
*/

import java.util.Scanner;

public class Ejercicio04 { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Números del 320 al 160, de 20 en 20: ");
    
    for (int i=320;i>=160;i=i-20) {
      System.out.println(i);
      
    }
  } 
}
