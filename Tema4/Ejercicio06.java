/**
*Tema 4*
*Ejercicio 6
*Programa que calcule el tiempo que tardará en caer un objeto desde una altura h.
*/

import java.util.Scanner;

public class Ejercicio06 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Calcular el tiempo que tarda en caer un objeto");
    System.out.print("Introduce la altura desde la que cae en metros: ");
    int h = s.nextInt();
    
    if (h < 0) {
      System.out.print("Error, no es posible que la altura sea negativa"); 
    } 
    if (h == 0) {
      System.out.println("Error, no es posible que la altura sea cero");
    }    
    
    if (h > 0) {
      double t = Math.sqrt((2 * h) / 9.81);
      System.out.printf("El tiempo que tarda en caer el objeto desde %dm es %.2fs" , h , t);
    }  
  

  }
} 

  
  
