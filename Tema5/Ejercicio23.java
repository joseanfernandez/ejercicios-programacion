/**
*Tema 5
*Ejercicio 23
*Escribe un programa que permita ir introduciendo una serie indeterminada
*de números mientras su suma no supere el valor 10000. Cuando esto último ocurra, 
*se debe mostrar el total acumulado, el contador de los números introducidos y la media.
*/

import java.util.Scanner;


public class Ejercicio23 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce los números que quieras: ");
    
    int numeros = 0;
    int sumatorio = 0;
    int contador = 0;
    int media = 0;
    
    while (sumatorio <= 10000) {
      numeros = s.nextInt();
      sumatorio += numeros;
      contador++;
    } 
    
    System.out.println("Total acumulado: " + (sumatorio - numeros));
    System.out.println("Cantidad de números introducidos: " + (contador - 1));
    System.out.println("Media de los números introducidos: " + ((sumatorio - numeros) / (contador - 1)));
    
   
  } 
}
