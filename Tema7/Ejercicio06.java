/**
 * Tema 7
 * Ejercicio 06
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. 
 * Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1,
 * el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0.
 * Finalmente, muestra el contenido del array.
 */

import java.util.Scanner;

public class Ejercicio06 { // Clase principal
  public static void main(String[] args) {
    
    int tamano = 15;
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce 15 números: ");
    int[] num = new int [tamano];
    
    for (int i = 0; i < 15; i++) {
      num [i] = s.nextInt();
    }
    
    
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < num.length; i++) {  
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Números");
    for (int i = 0; i < num.length; i++) {  
      System.out.printf("│%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println();
    
    //Rotando los elementos queda
    System.out.println("\n\nArray rotado:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < num.length; i++) {  
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");   
    System.out.print("│ Números");
    System.out.printf("│%4d ", num[tamano-1]);
    for (int i = 0 ; i < tamano - 1; i++) {
      System.out.printf("│%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  } 
}
