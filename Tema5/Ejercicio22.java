/**
*Tema 5
*Ejercicio 22
*Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
*/

public class Ejercicio22 { // Clase principal
  public static void main(String[] args) {
  
    System.out.println("Números primos entre 2 y 100: ");
    System.out.print("2 3 5 7");
    for (int i = 2; i <= 100; i++)  {
      if (((i % 2) != 0) && ((i % 3) != 0) && ((i % 5) != 0)  && ((i % 7) != 0)) {
        
        System.out.print(" " + i);
      } 
    }
  } 
}
