/**
*Tema 5*
*Ejercicio 6
*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
*utilizando un bucle do-while .
*/

public class Ejercicio06 { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Números del 320 al 160, contando de 20 en 20: ");
    
    int i = 320;
    
    do {
      System.out.println(i);
      i=i-20;
    } while (i >= 160);
  }
}
