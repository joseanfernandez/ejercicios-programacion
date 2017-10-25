/**
*Tema 5*
*Ejercicio 10
*Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. 
*A priori, el programa no sabe cuántos números se introducirán. 
*El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
*/

import java.util.Scanner;

public class Ejercicio10 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce los números positivos para calcular la media");
    System.out.println("Para indicar que has terminado, introduce un número negativo:");
    double cantidad = 0;
    double num = 0;
    double total = 0;
    
    do{
      num = s.nextInt();
      cantidad++;
      total += num;
    } while (num > 0);
    
    
    System.out.println("La media de los números introducidos es: " + ((total - num) / (cantidad - 1)) );
      
   
  } 
}
