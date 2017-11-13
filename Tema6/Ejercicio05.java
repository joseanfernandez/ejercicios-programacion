/**
*Tema 6*
*Ejercicio 5
*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. 
*Muestra también el máximo, el mínimo y la media de esos números.
*/

public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
    
    int sumatorio = 0;
    int max = 0;
    int min = 200;
    for (int i = 0; i < 50; i++) {
      int numero = (int) ((Math.random() * 100) + 100);
      System.out.print(numero + " ");
      sumatorio += numero;
          if (numero > max) {
            max = numero;
          }
          if (numero < min) {
            min = numero;
          }
    }
    
    System.out.println();
    int media = sumatorio / 50;
    System.out.println("La media de los 50 números es " + media);
    System.out.println("El mayor de los 50 números es " + max);
    System.out.println("El menos de los 50 números es " + min);
    
    
  } 
}
