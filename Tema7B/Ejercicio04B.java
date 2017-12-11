/**
 * Tema 7B
 * Ejercicio 4B
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en 
 * la pantalla con un pequeño retardo, dando la impresión de que el ordenador se queda “pensando” 
 * antes de mostrar los números.
 */

 import java.util.Scanner;
 
 public class Ejercicio04B { // Clase principal
  public static void main(String[] args)
  throws InterruptedException {
    
    Scanner s = new Scanner(System.in);
    int [] [] num = new int [4][5];
    int contador = 4;
    int fila = 0;
    int columna = 0;
    
    // Introduce los 20 valores
    
    for (int j = 0; j < 4; j++) {
      for (int i = 0; i < 5; i++) {
        num [j] [i] = (int)(Math.random() * 900 + 100);
      }
    }
    
    // Array que recoge el sumatorio de cada fila
    
    int [] sumfilas = new int [4];
    int totalfilas = 0;
        
    for (int j = 0; j < 4; j++) {
      for (int i = 0; i < 5; i++) {
        sumfilas [j]+= num [j] [i];
      }
      totalfilas += sumfilas [j];
    }
    
    // Array que recoge el sumatorio de cada columna  
    int [] sumcol = new int [5];
    int totalcol = 0;
      
    for (int j = 0; j < 5; j++) {
      for (int i = 0; i < 4; i++) {
        sumcol [j]+= num [i] [j];
      }
      totalcol += sumcol [j];
    }
    
    // Suma filas y columnas en total
    
      
    int total = totalfilas + totalcol;
   
    
     
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬──────┐");
    System.out.print("│ Array  ");
    for (int i = 0; i < 5; i++) {
      System.out.print("│ C " + columna + " ");
      columna++;
      Thread.sleep(50);
    }
      System.out.print("│   Σ  ");
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼──────┤");
    
    for (int i = 0; i < 4; i++) {
      System.out.print("│ Fila " + fila + " ");
      for (int j = 0; j < 5; j++) {
        System.out.printf("│%4d ", num[i][j]);
        Thread.sleep(50);
      }
      Thread.sleep(200);
      System.out.printf("│%5d ", sumfilas [i]);
      
        if (contador > 0) {
          System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼──────┤"); 
          contador--;
        } 
        fila++;
    }
    System.out.print("│   Σ    ");
    for (int i = 0; i < 5; i++) {
      System.out.printf("│%4d ", sumcol[i]);
      Thread.sleep(200);
    }
    Thread.sleep(500);
    System.out.printf("│%5d ", total);
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴──────┘");
    
  }
}
