/**
 * Tema 8
 * Ejercicio 36
 * Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio 
 * resulte más fácil, las repeticiones de primos se conservan; es decir, si en el array x el número 
 * 13 se repite 3 veces, en el array devuelto también estará repetido 3 veces. 
 * Si no existe ningún número primo en x, se devuelve un array con el número -1 como único elemento.
 */

  import java.util.Scanner;
  import funcionesVariadas.Funciones;
  import ejercicios20al28.Arrays;
  
  public class Ejercicio36 { // Clase principal
  public static void main(String[] args) {
  
  int arrayUno [] = {2,4,5,8,7};
  int arrayDos [] = {4,6,8,10};
  
  ejercicios20al28.Arrays.muestraArray(funcionesVariadas.Funciones.filtraPrimos(arrayUno));
  System.out.println();
  ejercicios20al28.Arrays.muestraArray(funcionesVariadas.Funciones.filtraPrimos(arrayDos));
  
  
  }
}
