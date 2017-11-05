/**
*Tema 5
*Ejercicio 31
*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. 
*El programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la mitad 
*(división entera entre 2) de la altura más uno.
*/

import java.util.Scanner;


public class Ejercicio31 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura de la L: ");
    int h = s.nextInt();
    
    for (int i = 1; i < h; i++) {
      System.out.println("*");
    }
    for (int i = 0; (i <= h/2); i++) {
      System.out.print("* ");
    }
    
  } 
}
