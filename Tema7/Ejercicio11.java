/**
 *Tema 7
 *Ejercicio 11
 *Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
 *se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello una tabla. 
 *Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el resto de 
 *números (los que no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
 *array resultante.
 */

 import java.util.Scanner;
 
 public class Ejercicio11 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int [] num = new int [10];
    
    // Introduce los 10 números
    System.out.println("Introduce 10 números: ");
    for (int i = 0; i < num.length; i++) {  
      num [i] = s.nextInt();
    }
    
    // Muestra el array original
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
    System.out.println();
    
    //Comprueba los números primos del array y lo almacena en dos arrays "primos" y "no primos"
    int [] primos = new int [20];
    int primo = 0;
    int [] noPrimos = new int [20];
    int noPrimo = 0;
    
    for (int i = 0; i < num.length; i++) {  
      boolean esPrimo = true;
      for (int j = 2; j < num[i]; j++) {
        if (num[i] % j == 0) {
          esPrimo = false;
        }
      }
      if (num[i] <= 1){
          esPrimo = false;
      }
      
      if (esPrimo) {
        primos [primo] = num [i];
        primo++;
      } else {
        noPrimos [noPrimo] = num [i];
        noPrimo++;
      }
    }
    
    // Suma los dos arrays en el array original, primero los primos
    for (int i = 0; i < primo; i++) {
      num [i] = primos[i];
    }
    
    for (int i = primo, j= 0; i < num.length; i++, j++) {
      num [i] = noPrimos [j];
    }
    
    System.out.println("\n\nArray con primos primero:");
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
