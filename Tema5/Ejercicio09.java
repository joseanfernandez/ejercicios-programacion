/**
*Tema 5*
*Ejercicio 9
*Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
*/

import java.util.Scanner;

public class Ejercicio09 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int num = s.nextInt();
    int digitos = 1;
    
    do {
      num /= 10;
      digitos++;
    } while (num >= 10);
    
    System.out.println("Tiene " + digitos + " dígitos");
  } 
}
