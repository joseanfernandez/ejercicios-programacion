/**
*Tema 5*
*Ejercicio 16
*Escribe un programa que diga si un número introducido por teclado es o no primo.
*Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
*/

import java.util.Scanner;

public class Ejercicio16 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número para saber si es primo: ");
    int num = s.nextInt();
    int aux = 2; 
    boolean primo = true;
    
    while (aux < num) {
      if ((num % aux) == 0) {
        primo = false;
      } 
     aux++; 
    } 
    
    if (primo) {
      System.out.println("El número es primo");   
    } else {
      System.out.println("El número no es primo");
    }    
    
  } 
}

