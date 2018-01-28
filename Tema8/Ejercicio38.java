/**
 * Tema 8
 * Ejercicio 38
 * Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio 
 * resulte más fácil, las repeticiones de números capicúa se conservan; es decir, si en el array x 
 * el número 505 se repite 3 veces, en el array devuelto también estará repetido 3 veces. 
 * Si no existe ningún número capicúa en x, se devuelve un array con el número -1 como único 
 * elemento.
 */

  import java.util.Scanner;
  import funcionesVariadas.Funciones;
  import ejercicios20al28.Arrays;
  
  public class Ejercicio38 { // Clase principal
  public static void main(String[] args) {
  
  int arrayUno [] = {232,444,197,342,767};
  int arrayDos [] = {421,216,877,110};
  
  ejercicios20al28.Arrays.muestraArray(funcionesVariadas.Funciones.filtraCapicuas(arrayUno));
  System.out.println();
  ejercicios20al28.Arrays.muestraArray(funcionesVariadas.Funciones.filtraCapicuas(arrayDos));
  
  
  }
}
