 /**
*Tema 5
*Ejercicio 46
*Realiza un programa que pinte por pantalla un rectángulo hueco hecho con asteriscos.
*Se debe pedir al usuario la anchura y la altura. 
*Hay que comprobar que tanto la anchura como la altura sean mayores o iguales que 2,
*en caso contrario se debe mostrar un mensaje de error.
*/

import java.util.Scanner;


public class Ejercicio46 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura del rectángulo: ");
    int h = s.nextInt();
    System.out.print("Introduce la anchura del rectángulo: ");
    int w = s.nextInt();
    int espacios = w - 2;
    int hint = h-2;
    int wint = w-2;
    
    if ((h >= 2) && (w >= 2)) {
    
      for (int i=1; i<=w; i++) {
        System.out.print("* ");
      }
      System.out.println();
      
      while (hint > 0) {
        System.out.print("*");
        for (int i=1; i<=wint; i++) {
          System.out.print("  ");
        }
        System.out.println(" *");
        hint--;
      }
      
      for (int i=1; i<=w; i++) {
        System.out.print("* ");
      }
    } else {
      System.out.print("La altura y la anchura deben ser iguales o mayores a 2.");
    }
  } 
}
