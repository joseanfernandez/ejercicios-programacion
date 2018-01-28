/**
 * Tema 8
 * Ejercicio 16
 * Muestra los números capicúa que hay entre 1 y 99999.
 */

  import ejercicios1al14.Numeros;
  
  public class Ejercicio16 { // Clase principal
  public static void main(String[] args) {
    
    for (int i = 1; i <= 99999; i++) {
      
      if (ejercicios1al14.Numeros.esCapicua(i)) {
        
        System.out.print(i + " ");
      }
    }
  }
}
    
   
 
