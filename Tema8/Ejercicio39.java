/**
 * Tema 8
 * Ejercicio 39
 * Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se 
 * debe mostrar nada por pantalla, solo se debe usar print desde el programa principal. 
 * Fíjate que hay una coma detrás de cada palabra salvo al final.
 */

  import java.util.Scanner;
  import funcionesVariadas.Funciones;
  
  public class Ejercicio39 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número decimal: ");
    int numero = s.nextInt();
    System.out.println("El número " + numero + " en palabras es: ");
    System.out.print(funcionesVariadas.Funciones.convierteEnPalabras(numero));
    
  }
}
