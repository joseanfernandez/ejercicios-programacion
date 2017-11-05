/**
*Tema 5
*Ejercicio 28
*Escribe un programa que calcule el factorial de un número entero leído por teclado.
*/

import java.util.Scanner;


public class Ejercicio28 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Cálculo de factorial.");
    System.out.println("Introduce un número: ");
    int numero = s.nextInt();
    int factorial = 1;
    
    for (int i = 1; i <= numero; i++) {
    factorial = factorial * i;
    }
    System.out.print(numero + "! = " +factorial);
  } 
}
