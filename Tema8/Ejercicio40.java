/**
 * Tema 8
 * Ejercicio 40
 * Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio 
 * resulte más fácil, las repeticiones de números que contienen 7 se conservan; es decir, si en el 
 * array x el número 875 se repite 3 veces, en el array devuelto también estará repetido 3 veces. 
 * Si no existe ningún número que contiene 7 en el array x, se devuelve un array con el número -1 
 * como único elemento.
 */

  import java.util.Scanner;
  import funcionesVariadas.Funciones;
  import ejercicios20al28.Arrays;
  
  public class Ejercicio40 { // Clase principal
  public static void main(String[] args) {
  
  int arrayUno [] = {7,444,197,342,767};
  int arrayDos [] = {421,216,866,110};
  
  ejercicios20al28.Arrays.muestraArray(funcionesVariadas.Funciones.filtraCon7(arrayUno));
  System.out.println();
  ejercicios20al28.Arrays.muestraArray(funcionesVariadas.Funciones.filtraCon7(arrayDos));
  
  
  }
}
