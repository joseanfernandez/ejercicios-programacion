/**
*Tema 5
*Ejercicio 32
*Escribe un programa que, dado un número entero, diga cuáles son y cuánto suman los dígitos pares.
*Los dígitos pares se deben mostrar en orden, de izquierda a derecha. 
*Usa long en lugar de int donde sea necesario para admitir números largos.
*/

// DUDA CON EL USO DE LONG

import java.util.Scanner;


public class Ejercicio32 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce un número entero para saber: ");
    System.out.println("- Qué dígitos pares lo forman.");
    System.out.println("- Cuánto suman sus dígitos pares.");
    int numero = s.nextInt();
    int digito = 0;
    int suma = 0;
    int volteado = 0;
    System.out.print("Dígitos pares: ");
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    while (volteado > 0) {
      
    digito = (volteado % 10);
    volteado/= 10;
      if (digito % 2 == 0) {
        System.out.print(digito + " ");
        suma += digito;
      }
    }
    
    System.out.println();
    System.out.print("La suma de los dígitos pares es: " + suma);
    
  } 
}
