/**
 * Tema 7
 * Ejercicio 03
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir,
 * el primero que se introduce es el último en mostrarse y viceversa.
 */

import java.util.Scanner;

public class Ejercicio03 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce 10 números para completar el array: ");
    int[] num = new int [10];
    
    
    for (int i = 0; i < num.length; i++) {
      num [i] = s.nextInt();
    }
    
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < num.length; i++) {  
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Números");
    for (int i = 0; i < num.length; i++) {  
      System.out.printf("│%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println();
    
    // Array inverso
    System.out.println("\n\nArray inverso:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < num.length; i++) {  
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Números");
    for (int i = num.length - 1; i >= 0; i--) {  
      System.out.printf("│%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println();
  
  } 
}
