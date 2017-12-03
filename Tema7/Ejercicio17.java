/**
 * Tema 7
 * Ejercicio 17
 * Escribe un programa que muestre por pantalla un array de 10 números enteros generados al azar 
 * entre 0 y 100. A continuación, el programa debe pedir un número al usuario. Se debe comprobar que 
 * el número introducido por teclado se encuentra dentro del array, en caso contrario se mostrará un 
 * mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
 * correctamente. A continuación, el programa rotará el array hacia la derecha las veces que haga 
 * falta hasta que el número introducido quede situado en la posición 0 del array. 
 * Por último, se mostrará el array rotado por pantalla.
 */

import java.util.Scanner;

public class Ejercicio17 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] num = new int [10];
    boolean esta = false;
    int elige = 0;
    /**
    for (int i = 0; i < 10; i++) {
      num [i] = (int)(Math.random() * 101);
      System.out.print(num[i] + " ");
    }
    System.out.println();
    */
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < num.length; i++) {  
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Números");
    for (int i = 0; i < num.length; i++) { 
      num [i] = (int)(Math.random() * 101);
      System.out.printf("│%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println();
    
    
   
    do {
      System.out.print("Elige un número del array: ");
      elige = s.nextInt();
      for (int i = 0; i < 10; i++) {
        if (num [i] == elige) {
          esta = true;
        } 
      }
      if (esta == false) {
        System.out.println("Ese número no está en el array.");
      }
      
    } while (esta == false);
    
    while (num[0] != elige) {
      int aux = num [9];
      for (int i = 9; i > 0; i--) {
        num [i] = num [i -1];
      }
      num[0] = aux;
    }
    
    System.out.println("\n\nArray rotado:");
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
  }
}    
