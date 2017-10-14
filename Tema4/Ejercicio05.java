/**
*Tema 4*
*Ejercicio 5
*Programa que calcule ecuación de primer grado del tipo ax+b=0
*/

import java.util.Scanner;

public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.println("Ecuación de primer grado ax+b=0 ");
  System.out.print("Introduce el valor de (a): ");
  int a = s.nextInt();
  System.out.print("Introduce el valor de (b): ");
  int b = s.nextInt();
  
  
  if (a != 0) {
      int x = -b / a;
      System.out.print("X = : " + x); 
    } 
  if ((a == 0) && (b != 0)) {
      System.out.println("Indefinición");
    }    
  
  if ((a == 0) && (b == 0)) {
      System.out.println("Indeterminación");
    }  
  

  }
} 
