/**
*Tema 5*
*Ejercicio 8
*Muestra la tabla de multiplicar de un número introducido por teclado.
*/

import java.util.Scanner;

public class Ejercicio08 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Elige un número para ver su tabla de multiplicar: ");
    int num= s.nextInt();
    
    for (int i=0;i<=10;i++) {
      System.out.println(i*num);
   
    }
  } 
}
