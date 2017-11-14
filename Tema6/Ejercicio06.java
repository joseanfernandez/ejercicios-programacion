/**
*Tema 6*
*Ejercicio 6
*Escribe un programa que piense un número al azar entre 0 y 100. 
*El usuario debe adivinarlo y tiene para ello 5 oportunidades. 
*Después de cada intento fallido, el programa dirá cuántas oportunidades 
*quedan y si el número introducido es menor o mayor que el número secreto.
*/

import java.util.Scanner;

public class Ejercicio06 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Adivina el número que estoy pensando.");
    System.out.println("Tienes 5 intentos.");
    System.out.print("Introduce un número: ");
    int numero = 0;
    int numsecreto = (int) (Math.random() * 101);
    int intentos = 5;
    
    do {
      numero = s.nextInt();
      
      if (numero == numsecreto) {
        System.out.println("Enhorabuena, has acertado.");
      }
      if (numero < numsecreto) {
        System.out.println("Lo siento, el número que estoy pensando es mayor.");
      }
      if (numero > numsecreto) {
        System.out.println("Lo siento, el número que estoy pensando es menor.");
      }
      intentos --;
      
    }  while ((numero != numsecreto) && (intentos > 0)); 
    
    if (intentos == 0) {
        System.out.print("Has agotado los 5 intentos");
      }   
    
  } 
}
