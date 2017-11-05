 /**
*Tema 5
*Ejercicio 38
*Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. 
*El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3,
*en caso contrario se debe mostrar un mensaje de error.
*/

import java.util.Scanner;


public class Ejercicio38 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura del reloj de arena: ");
    int h = s.nextInt();
    int altura = 1;
    int espadelante = 0;
    int espadetras = h - 1;
    int centro = h - 1; 
    int espacentro = (h / 2) ;
    int espadelante2 = (h/2) - 1;
    int espadetras2 = 2;
    int altura2 = 1;
    
    if ((h >= 3) && (h % 2 != 0)) {
    
      while (altura <= (h/2)) {
      
        for (int i = 1; i <= espadelante; i++) {
          System.out.print(" ");
        }
        
        for (int i = 0; i <= espadetras; i ++) {
          System.out.print("*");
        }
        altura ++;
        espadelante ++;
        espadetras -=2;
        System.out.println();
      } 
      
      while (centro < h) {
        
        for (int i = 1; i <= espacentro; i++) {
        System.out.print(" ");
        }
        
        espacentro --;
        centro++;
      }  
      System.out.println("*");
      
      
      while (altura2 <= (h/2)) {
      
        for (int i = 1; i <= espadelante2; i++) {
          System.out.print(" ");
        }
        
        
        for (int i = 0; i <= espadetras2; i ++) {
          System.out.print("*");
        }
        altura2 ++;
        espadelante2 --;
        espadetras2 +=2;
        System.out.println();
      } 
      
    } else {
      System.out.print("Error, el número debe ser mayor o igual a 3 e impar");
    }   
  } 
}
