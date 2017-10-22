/**
*Tema 5*
*Ejercicio 5
*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
*utilizando un bucle while .
*/

public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Números del 320 al 160, contando de 20 en 20: ");
    
    int i = 320 ;
    
    while (i >= 160) {
      System.out.println(i);
      i=i-20;
      
    }
  } 
}
      
