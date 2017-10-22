/**
*Tema 5*
*Ejercicio 3
*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while .
*/

public class Ejercicio03 { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Números múltiplos de 5 que hay de 0 a 100: ");
    
   int i = 0;
    
    do {
      System.out.println(i);
      i=i+5;
    } while (i <= 100);
  }
}
