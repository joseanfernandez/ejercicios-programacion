/**
*Tema 5*
*Ejercicio 14
*Escribe un programa que pida una base y un exponente (entero positivo) y
*que calcule la potencia.
*/

import java.util.Scanner;

public class Ejercicio14 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la base: ");
    int base = s.nextInt();
    
    System.out.print("Introduce el exponente: ");
    int exp = s.nextInt();
    
    switch (exp) {
      case 0:
        System.out.print("1");
        break;
      case 1:
        System.out.print(base);
        break;
      default:
        int total = 1;
        
        for (int i = 0; i < exp; i++) {
        total *= base; 
        }
       
        System.out.println(total);
    }  

  } 
}
