 /**
*Tema 5
*Ejercicio 36
*Escribe un programa que diga si un número introducido por teclado es o no capicúa. 
*Los números capicúa se leen igual hacia delante y hacia atrás. 
*El programa debe aceptar números de cualquier longitud siempre que lo permita el tipo, 
*en caso contrario el ejercicio no se dará por bueno.
*Se recomienda usar long en lugar de int ya que el primero admite números más largos.
*/

import java.util.Scanner;


public class Ejercicio36 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número: ");
    int numero = s.nextInt();
    int num = numero;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    if (num == volteado) {
      System.out.print("El número " + num + " es capicúa.");
    } else {
      System.out.print("El número " + num + " no es capicúa.");
    }
  } 
}
