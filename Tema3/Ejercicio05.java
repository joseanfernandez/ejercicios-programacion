/**
*Tema 3*
*Ejercicio 5
*Programa que calcule area de un rectágulo
*/

public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
  String numero;
  System.out.print("Introduce la base: ");
  numero = System.console().readLine();
  int base;
  base = Integer.parseInt( numero ) ;
  
  System.out.print("Introduce la altura: ");
  numero = System.console().readLine();
  int altura;
  altura = Integer.parseInt( numero ) ;
  
  int area = base * altura;
  
  System.out.println("Área = " + area );
   } 
}
 
