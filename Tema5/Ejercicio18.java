/**
*Tema 5*
*Ejercicio 18
*Escribe un programa que obtenga los números enteros comprendidos entre dos números
*introducidos por teclado y validados como distintos, el programa debe empezar por 
*el menor de los enteros introducidos e ir incrementando de 7 en 7.

*/

import java.util.Scanner;

public class Ejercicio18 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
     System.out.println("Introduce dos números distintos e iremos avanzando de 7 en 7.");
    System.out.print("Introduce el primer número: ");
    int n1 = s.nextInt();
    System.out.print("Introduce el segundo número: ");
    int n2 = s.nextInt();
    
    if (n1 < n2) {
      for (int i = n1; i <= n2 ; i = i + 7) {
        System.out.println(i);
      }
     } else {
       for (int i = n2; i <= n1 ; i = i + 7) {
        System.out.println(i);
      }
     }  
  } 
}
