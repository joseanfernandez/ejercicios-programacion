/**
*Tema 4*
*Ejercicio 2
*Programa que pida una hora por teclado e indique buenos dias, buenas tardes y buenas noches por tramos
*/

import java.util.Scanner;

public class Ejercicio02 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la hora: ");
    
    int hora = s.nextInt();
    
    if (hora >= 6 && hora <=12) {
      System.out.print("Buenos días");
    }
    if (hora >= 13 && hora <=20) {
      System.out.print("Buenas tardes");
    }
    if (hora >= 21 && hora <=23) {
      System.out.print("Buenas noches");
    }
    if (hora >= 00 && hora <=5) {
      System.out.print("Buenas noches");
    }
   } 
  }    
    
    
