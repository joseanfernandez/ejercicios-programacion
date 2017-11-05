/**
*Tema 5
*Ejercicio 21
*Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo
*y nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
*El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.
*/

import java.util.Scanner;


public class Ejercicio21 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce números positivos para calcular:");
    System.out.println("- Total de números introducidos.");
    System.out.println("- La media de los impares.");
    System.out.println("- El mayor de los pares.");
    System.out.println("Para finalizar, introduce un número negativo.");
    
    int numeros = 0;
    int total = 0;
    double pares = 0;
    double impares = 0;
    double sumaimpar = 0;
    int max = 0;
    
    do {
      numeros = s.nextInt();
      
      
      if ((numeros % 2) != 0) {
        sumaimpar += numeros;
        impares++;
        
      } else {
        if (numeros > max) {
          max = numeros;
        }  
        
      } 
       
      total++;
    } while (numeros >= 0);
    
    System.out.println("Total de números introducidos : " + (total - 1));
    
    if ((numeros % 2) != 0) {
      System.out.println("La media de los impares es " + ((sumaimpar - numeros) / (impares - 1)));
      System.out.println("El mayor de los pares es: " + max );
    } else {
      System.out.println("La media de los impares es " + (sumaimpar / impares));
      System.out.println("El mayor de los pares es: " + max );
    
    }  
  } 
}
