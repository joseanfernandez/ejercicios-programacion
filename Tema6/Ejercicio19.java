/**
*Tema 6*
*Ejercicio 19
*Escribe un programa que muestre 50 números enteros aleatorios comprendidos entre el -100 y el 200 
*ambos incluidos y separados por espacios. Muestra luego el máximo de los pares, el mínimo de los 
*impares y la media de todos los números generados.
*/

public class Ejercicio19 { // Clase principal
  public static void main(String[] args) {
    
    int sumatorio = 0;
    int maxPares = -101;
    int minImpares = 201;
    for (int i = 0; i < 50; i++) {
      int numero = (int) ((Math.random() * 301) - 100);
      System.out.print(numero + " ");
      sumatorio += numero;
      
      if (numero % 2 == 0) {
        if (numero > maxPares) {
          maxPares = numero;
        }
      }
      
      if (numero % 2 != 0) {
        if (numero < minImpares) {
          minImpares = numero;
        }
      }
    }
    System.out.println();
    System.out.println("La media los 50 números generados es " + sumatorio / 50);
    System.out.println("El máximo de los pares es " + maxPares);
    System.out.println("El mínimo de los impares es " + minImpares);
  } 
}
