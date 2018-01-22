/**
 * Tema 7B
 * Ejercicio 6B
 * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 */

  import java.util.Scanner;
  
  public class Ejercicio06B { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int [] [] num = new int [6][10];
    int contador = 5;
    int fila = 0;
    int columna = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int fMax = 0;
    int cMax = 0;
    int fMin = 0;
    int cMin = 0;
     boolean rep;
    // Introduce los 20 valores
    
    for (int j = 0; j < 6; j++) {
      for (int i = 0; i < 10; i++) {
        
        do {
          
          num [j] [i] = (int)(Math.random() * 1000);
          rep = false;
          
           for (int k = 0; k < 6; k++) {
            for (int l = 0; l < 10; l++) {
              
              if (num [j] [i] == num [k] [l]) {
                
                rep = true;
              }
            }
          }
        
        
        } while (rep);
        if (num [j] [i] > max) {
          max = num [j] [i];
          fMax = j;
          cMax = i;
        } else if (num [j] [i] < min) {
          min = num [j] [i];
          fMin = j;
          cMin = i;
        }
      }
    }
  
      
     
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Array  ");
    for (int i = 0; i < 10; i++) {
      System.out.print("│ C " + columna + " ");
      columna++;
    }
      
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    
    for (int i = 0; i < 6; i++) {
      System.out.print("│ Fila " + fila + " ");
      for (int j = 0; j < 10; j++) {
        System.out.printf("│%4d ", num[i][j]);
      }
        if (contador > 0) {
          System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤"); 
          contador--;
        } 
        fila++;
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println();
    System.out.println("La posición del máximo es la (" + fMax + "," + cMax + ")");
    System.out.println("La posición del mínimo es la (" + fMin + "," + cMin + ")");
  }
}
