/**
 * Tema 7
 * Ejercicio 14
 * Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras 
 * correspondientes a colores se deben almacenar al comienzo y las que no son colores a 
 * continuación. Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el 
 * programa deben estar en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, 
 * rosa, negro, blanco y morado.
 */

import java.util.Scanner;

public class Ejercicio14 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int tamano = 8;
    String [] palabras = new String [tamano];
    String [] coloresConocidos = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
    String [] ordenado = new String [tamano];
    int aux = 0;
    
    System.out.println("Introduce 8 palabras y pondré los colores en las primeras posiciones: ");
    
    for (int i = 0; i < tamano; i++) {
      palabras [i] = s.nextLine();
      
      //foreach que almacena en "ordenado" los colores de "palabras"
      for (String c : coloresConocidos) {
        if (palabras[i].equals(c)) {
          ordenado[aux++] = c;
        }
      }
    }
    
    for (int i = 0; i < tamano; i++) {
      boolean esColor = false;
      
      //foreach
      for (String c : coloresConocidos) {
        if (palabras[i].equals(c)) {
          esColor = true;
        }
      }
      if (!esColor) {
        ordenado[aux++] = palabras[i];
      }
    }
    
    // Muestra el array original
    System.out.println("\n\nArray original:");                         
    System.out.println("\n┌──────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┐");
    System.out.print("│ Índice   ");
    for (int i = 0; i < palabras.length; i++) {  
      System.out.printf("│%9d      ", i);
    }
    System.out.println("│\n├──────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┤");    
    System.out.print("│ Palabra  ");
    for (int i = 0; i < palabras.length; i++) {  
      System.out.printf("│%-9s      ", palabras[i]);
    }
    System.out.println("│\n└──────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┘");
    System.out.println();
    
    
    // Muestra el array ordenado
    System.out.println("\n\nArray con colores primero:");                         
    System.out.println("\n┌──────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┐");
    System.out.print("│ Índice   ");
    for (int i = 0; i < palabras.length; i++) {  
      System.out.printf("│%9d      ", i);
    }
    System.out.println("│\n├──────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┤");    
    System.out.print("│ Palabra  ");
    for (int i = 0; i < palabras.length; i++) {  
      System.out.printf("│%-9s      ", ordenado[i]);
    }
    System.out.println("│\n└──────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┘");
  }
}
