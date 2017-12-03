/**
 * Tema 7
 * Ejercicio 12
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. 
 * A continuación se mostrará el contenido de ese array junto al índice (0 – 9). 
 * Seguidamente el programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. 
 * Se debe comprobar que inicial es menor que final y que ambos números están entre 0 y 9. 
 * El programa deberá colocar el número de la posición inicial en la posición final, rotando el resto
 * de números para que no se pierda ninguno. Al final se debe mostrar el array resultante.
 */
 
import java.util.Scanner;

public class Ejercicio12 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);  
    int [] num = new int [10];
    int [] nuevo = new int [10];
    int inicial = 0;
    int fin = 0;
    
    System.out.println("Introduce 10 números:");
    for (int i = 0; i < 10; i++) {
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
    
    boolean valido = true;
    do {
      System.out.print("Introduce la posición inicial (0-9): ");
      inicial = s.nextInt();
      if((inicial < 0) || (inicial > 9)) {
        valido = false;
        System.out.println("El número introducido no es válido.");
      } else {
        valido = true;
      }
    } while (!valido); 
    
    do {
      System.out.print("Introduce la posición final (0-9): ");
      fin = s.nextInt();
      if((fin < 0) || (fin > 9)) {
        valido = false;
        System.out.println("El número introducido no es válido.");
      } else {
        valido = true;
      }
    } while (!valido); 
    
    
    for (int i = 0; i < 10; i++) {
      nuevo [i] = num [i];
    }
    
    nuevo[fin] = num[inicial];
    
    for (int i = fin + 1; i < 10; i++) {
      nuevo[i] = num[i - 1];
    }
    
    nuevo[0] = num[9];
    
    for (int i = 0; i < inicial; i++) {
      nuevo[i + 1] = num[i];
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
        System.out.printf("│%4d ", nuevo[i]);
      }
      System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  } 
}
