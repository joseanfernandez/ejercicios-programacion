 /**
*Tema 6
*Ejercicio 24
*Escribe un programa que, dado un número introducido por teclado, elija al azar uno de sus dígitos.
*/

import java.util.Scanner;


public class Ejercicio24 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    int volteado = 0;
    int digito = 0;
    int l = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero/=10;
      l++;
    }
    
    int azar = (int)(Math.random() * l) + 1;
    
    while (azar > 0) {
      digito = volteado % 10;
      volteado/= 10;
      azar--;
    }
    System.out.print(digito);
     
  } 
}
