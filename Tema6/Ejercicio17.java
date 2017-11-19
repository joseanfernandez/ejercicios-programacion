 /**
*Tema 6
*Ejercicio 17
*Realiza un programa que pinte por pantalla una pecera con un pececito dentro. 
*Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades. 
*No hay que comprobar que los datos se introducen correctamente; podemos suponer que el usuario los introduce bien.
*Dentro de la pecera hay que colocar de forma aleatoria un pececito, 
*que puede estar situado en cualquiera de las posiciones que quedan en el hueco que forma el rectángulo.
*/

import java.util.Scanner;


public class Ejercicio17 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura de la pecera: ");
    int h = s.nextInt();
    System.out.print("Introduce la anchura de la pecera: ");
    int w = s.nextInt();
    int espacios = w - 2;
    int hint = h-2;
    int wint = w-2;
    int pececito = (int) (Math.random() * (h - 2) * (w - 2)); 
    int posicion = 0;
    
    
    
      for (int i=1; i<=w; i++) {
        System.out.print("*");
      }
      System.out.println();
      
      while (hint > 0) {
        System.out.print("*");
        for (int i=1; i<=wint; i++) {
          if (posicion == pececito) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        posicion++;
        }
        System.out.println("*");
        hint--;
      }
      
      for (int i=1; i<=w; i++) {
        System.out.print("*");
      }
    
  } 
}
