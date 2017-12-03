 /**
* Tema 6
* Ejercicio 20
* Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua. La capacidad 
* será indicada por el usuario. La cuba se llenará con una cantidad aleatoria de agua que puede ir 
* entre 0 y la capacidad máxima que pueda admitir. El ancho de la cuba no varía.
*/

import java.util.Scanner;


public class Ejercicio20 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la capacidad de la cuba en litros: ");
    int capacidad = s.nextInt();
    int cantidad = (int)(Math.random() * capacidad);
    int lleno = capacidad;
    String blue = "\u001B[34m";
    String black = "\u001B[30m";
    
    System.out.println();
    
    for (int i = 0; i < capacidad; i++) {
      System.out.print("*");
      if (lleno > cantidad) {
        System.out.print("    ");
      } else {
        System.out.print(blue + "====");
      }
      System.out.println(black + "*");
      lleno--;
    }
    System.out.println("******");
    
    System.out.println();
    
    System.out.print("La cuba tiene una capacidad de " + capacidad + " litros y contiene ");
    if (cantidad > 1) {
      System.out.print(cantidad + " litros.");
    } else {
      System.out.print(cantidad + " litro.");
    }
  }
}
