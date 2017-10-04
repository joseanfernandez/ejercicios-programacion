/**
*Tema 2*
*Ejercicio 1
* Declarar variables X e Y, mostarlas, sumarlas, restarlas, dividirlas y multiplicarlas
*/

public class Ejercicio01 { // Clase principal
  public static void main(String[] args) {
  
  int x=144;
  int y=199;
  int sum = x + y;
  int res = x - y;
  double div = (double)x / (double)y;
  int mul = x * y;
  
  System.out.println("El valor de X es " + x + " y el valor de Y es " + y); 
  System.out.println("X + Y = " + sum);
  System.out.println("X - Y = " + res);
  System.out.println("X / Y = " + div);
  System.out.println("X * Y = " + mul);
   
  }
} 
