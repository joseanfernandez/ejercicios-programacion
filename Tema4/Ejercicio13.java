/**
*Tema 4
*Ejercicio 13
*Programa que ordene 3 numeros enteros introducidos por teclado
*/

import java.util.Scanner;

public class Ejercicio13 { // Clase principal
  public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.println("Ordenar 3 números enteros");
  System.out.print("Introduce el primer número: ");
  int num1 = s.nextInt();
  System.out.print("Introduce el segundo número: ");
  int num2 = s.nextInt();
  System.out.print("Introduce el tercer número: ");
  int num3 = s.nextInt();
  
  if ((num1 > num2) && (num2 > num3))  {
    System.out.print("De mayor a menor: " + num1 + "-" + num2 + "-" + num3);
  }
  if ((num1 > num3) && (num3 > num2))  {
    System.out.print("De mayor a menor: " + num1 + "-" + num3 + "-" + num2);
  }
  if ((num2 > num1) && (num1 > num3))  {
    System.out.print("De mayor a menor: " + num2 + "-" + num1 + "-" + num3);
  }
  if ((num2 > num3) && (num3 > num1))  {
    System.out.print("De mayor a menor: " + num2 + "-" + num3 + "-" + num1);
  }
  if ((num3 > num2) && (num2 > num1))  {
    System.out.print("De mayor a menor: " + num3 + "-" + num2 + "-" + num1);
  }
  if ((num3 > num1) && (num1 > num2))  {
    System.out.print("De mayor a menor: " + num3 + "-" + num1 + "-" + num2);
  }
  }
 }
