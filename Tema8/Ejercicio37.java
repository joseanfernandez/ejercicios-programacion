/**
 * Tema 8
 * Ejercicio 37
 * Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se 
 * debe mostrar nada por pantalla, solo se debe usar print desde el programa principal.
 */

  import java.util.Scanner;
  import funcionesVariadas.Funciones;
  
  public class Ejercicio37 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número decimal: ");
    int numero = s.nextInt();
    System.out.println("El número " + numero + " en código morse es: ");
    System.out.print(funcionesVariadas.Funciones.convierteEnMorse(numero));
    
  }
}
