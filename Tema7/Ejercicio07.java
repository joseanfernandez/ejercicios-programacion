/**
 * Tema 7
 * Ejercicio 07
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla
 * separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación 
 * cambiará todas las ocurrencias del primer valor por el segundo en la lista generada 
 * anteriormente. Los números que se han cambiado deben aparecer entrecomillados.
 */
 
import java.util.Scanner;

public class Ejercicio07 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] num = new int [100];
    
    for (int i = 0; i < 100; i++) {
      num[i] = (int)(Math.random() * 21);
      System.out.print(num [i] + " - ");
    }
    
    System.out.println();
    System.out.println();
    System.out.print("Introduce el valor que quieres cambiar: ");
    int valor1 = s.nextInt();
    System.out.print("Ahora elige el valor por el que quieres cambiarlo: ");
    int valor2 = s.nextInt();
    System.out.println();
    
    for (int i = 0; i < 100; i++) {
      if (num [i] == valor1) {
        System.out.print("'" + valor2 + "'");
      } else {
        System.out.print(num[i]);
      }
      System.out.print(" - ");
    }
  } 
}
