/**
*Tema 5*
*Ejercicio 17
*Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado.
*Se debe comprobar que el dato introducido es correcto (que es un número positivo).
*/

import java.util.Scanner;

public class Ejercicio17 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número positivo para saber la suma de los 100 números siguientes: ");
    int num = s.nextInt();
    boolean posible = false;
    int total = 0;
    
    
    for (int i = num; i < num + 100; i++) {
      total += i;
      if (num >= 0) {
        posible = true;
      }
    }
    if (posible){
      System.out.print("La suma de de los 100 siguientes números es: " + total);
    } else {
      System.out.print("Error, el número que has introducido no es positivo");
    }
  } 
}
