/**
 * Tema 8
 * Ejercicio 15
 * Muestra los números primos que hay entre 1 y 1000.
 */

  import ejercicios1al14.Numeros;
  
  public class Ejercicio15 { // Clase principal
  public static void main(String[] args) {
    
    for (int i = 1; i <= 1000; i++) {
      
      if ((ejercicios1al14.Numeros.esPrimo(i)) && (i != 1)) {
        
        System.out.print(i + " ");
      }
    }
  }
}
    
    
