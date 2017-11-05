 /**
*Tema 5
*Ejercicio 34
*Escribe un programa que pida dos números por teclado
*y que luego mezcle en dos números diferentes los dígitos pares y los impares. 
*/

import java.util.Scanner;


public class Ejercicio34 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce dos números de la misma longitud, con mínimo un número par y otro impar.");
    System.out.print("Introduce el primer número: ");
    int num1 = s.nextInt();
    System.out.print("Introduce el segundo número: ");
    int num2 = s.nextInt();
    int vol1 = 0;
    int vol2 = 0;
    int digitos1 = 0;
    int digitos2 = 0;
    int pares = 0;
    int impares = 0;
    
    while (num1 > 0) {
      vol1 = (vol1 * 10) + (num1 % 10);
      num1 /= 10;
    }
    
    while (num2 > 0) {
      vol2 = (vol2 * 10) + (num2 % 10);
      num2 /= 10;
    }
    
    while ((vol1 > 0) && (vol2 > 0)) {
    
      digitos1 = (vol1 % 10);
      digitos2 = (vol2 % 10);
      
      if ((digitos1 % 2 == 0)) {
        pares = (pares * 10) + digitos1;
      } else {
        impares = (impares * 10) + digitos1;
      }
      
      if ((digitos2 % 2 == 0)) {
        pares = (pares * 10) + digitos2;
      } else {
        impares = (impares * 10) + digitos2;
      }
      
      vol1 /= 10;
      vol2 /= 10;
      
    }
    System.out.println("Dígitos pares: " + pares);
    System.out.println("Dígitos impares: " + impares);
  } 
}
