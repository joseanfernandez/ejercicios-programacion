/**
*Tema 6*
*Ejercicio 12
*Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii entre el 32 y el 126. 
*Puedes hacer casting con (char) para convertir un entero en un carácter.
*/

public class Ejercicio12 { // Clase principal
  public static void main(String[] args) 
    throws InterruptedException {
      
    System.out.print("\033[32m");
    int linea = 0;
    
    for (int i = 0; i < 15000; i++) {
      
      char matrix = (char)((Math.random() * 95) + 32);
      System.out.print(matrix);
      linea++;
      
      if (linea == 80) {
        System.out.println();
        linea = 0;
        Thread.sleep(50);
      }
    }
  }
}
