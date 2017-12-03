/**
 *Tema 7
 *Ejercicio 10
 *Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en 
 *un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones 
 *del array (del 0 en adelante) y todos los números impares a las celdas restantes. 
 *Utiliza arrays auxiliares si es necesario.
 */

public class Ejercicio10 { // Clase principal
  public static void main(String[] args) {
    
    // Uso tamano y rango para que sea usable en otros ejercicios
    int tamano = 20;
    int rango = 101;
    int num [] = new int [tamano];
    // Variables para pares e impares
    int [] pares = new int [tamano];
    int par = 0;
    int [] imPares = new int [tamano];
    int imPar = 0;
    
    // Crea el array original y los arrays pares e imPares
    for (int i = 0; i < num.length; i++) {
      num [i] = (int)(Math.random() * rango);
      if (num [i] % 2 == 0) {
        pares[par++] = num [i];
      } else {
        imPares[imPar++] = num [i];
      }
    }
    
    // Muestra el array original
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < num.length; i++) {  
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Números");
    for (int i = 0; i < num.length; i++) {  
      System.out.printf("│%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println();
    
    // Junta los arrays pares e imPares en el array original
    for (int i = 0; i < par; i++) {
      num [i] = pares [i];
    }
    
    for (int i = par, j = 0; i < num.length; i++, j++) {
      num [i] = imPares [j];
    }
    
    // Muestra el array ordenado
    System.out.println("\n\nArray con pares primero:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < num.length; i++) {  
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Números");
    for (int i = 0; i < num.length; i++) {  
      System.out.printf("│%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}

