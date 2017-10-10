/**
*Tema 3*
*Ejercicio 4
*Programa que pida 2 números y muestre suma, resta, multiplicación y división
*/

public class Ejercicio04 { // Clase principal
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
  
  int suma= numero1 + numero2;
  int resta= numero1 - numero2;
  int multi= numero1 * numero2;
  double divi= numero1 / numero2;
  
  System.out.println("El resultado de sumar los dos números es " + suma);
  System.out.println("El resultado de restar los dos números es " + resta);
  System.out.println("El resultado de multiplicar los dos números es " + multi);
  System.out.println("El resultado de dividir los dos números es " + divi);
   } 
}
 
