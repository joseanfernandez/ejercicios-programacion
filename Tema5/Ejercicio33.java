 /**
*Tema 5
*Ejercicio 33
*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. 
*El programa pedirá la altura. 
*Fíjate que el programa inserta un espacio y pinta dos asteriscos menos
*en la base para simular la curvatura de las esquinas inferiores.
*/

import java.util.Scanner;


public class Ejercicio33 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura de la L: ");
    int h = s.nextInt();
    int espacios = ((h - 1)/2) + 1;
    int altura = 1;
    
    while (altura < h) {
      
      System.out.print("*");
      for (int i = 1; i < espacios; i++) {
        System.out.print("  ");
      }
      System.out.print(" ");
      System.out.println("*");
    
      
      altura++;
      
    }
    System.out.print(" ");
    for (int i = 0; i < espacios; i++) {
      System.out.print("* ");
    }
    
  
    
  } 
}
