/**
*Tema 3*
*Ejercicio 1
*Programa que pida 2 números y muestre su multiplicación
*/

public class Ejercicio01 { // Clase principal
  public static void main(String[] args) {
  String numero;
  System.out.print("Introduce el primer número: ");
  numero = System.console().readLine();
  int numero1;
  numero1 = Integer.parseInt( numero ) ;
  
  System.out.print("Introduce el segundo número: ");
  numero = System.console().readLine();
  int numero2;
  numero2 = Integer.parseInt( numero ) ;
  
  int total = numero1 * numero2;
  
  System.out.print("El resultado de multiplicar los dos números es ");
  System.out.print(total);
   } 
}
 
 
  
