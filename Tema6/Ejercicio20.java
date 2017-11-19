 /**
*Tema 6
*Ejercicio 20
*Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua. 
*La capacidad será indicada por el usuario. 
*La cuba se llenará con una cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que pueda admitir. 
*El ancho de la cuba no varía.
*/

import java.util.Scanner;


public class Ejercicio20 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura de la cuba: ");
    int h = s.nextInt();
    int hInt = h-1;
    int agua = (int) (Math.random() * (h - 1)); 
    int hAgua = 0;
    
    while (hInt > agua) {
      System.out.println("*    *");
      hInt--;
    }
    while (hAgua < agua) {
      System.out.println("*====*");
      hAgua++;
    }
    System.out.print("******");
  } 
}
