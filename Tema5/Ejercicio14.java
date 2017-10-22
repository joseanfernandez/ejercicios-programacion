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
    
    if (base > 0) {
      int potencia = base * (base*exp);
    } 
  } 
}
