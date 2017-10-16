/**
*Tema 4
*Ejercicio 9
*Programa que calcule ecuación de segundo grado del tipo ax²+bx+c=0
*/

import java.util.Scanner;

public class Ejercicio09 { // Clase principal
  public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.println("Ecuación de segundo grado ax²+bx+c=0 ");
  System.out.print("Introduce el valor de (a): ");
  double a = s.nextDouble();
  System.out.print("Introduce el valor de (b): ");
  double b = s.nextDouble();
  System.out.print("Introduce el valor de (c): ");
  double c = s.nextDouble();
 
  double mat1 = b*b;
  double mat2 = (4*a*c);
  
  if (a == 0) {
      double x = -c / b;
      System.out.printf("X = %.2f" , x); 
    } 
  
  if ((a != 0) && (b != 0) && (mat1 < mat2)) {
      System.out.print("No tiene solución en los números reales.");
    }
  if ((a != 0) && (b != 0) && (mat1 >= mat2)) {
      double x1 = (-b + Math.sqrt(mat1 - mat2)) / 2*a;
      double x2 = (-b - Math.sqrt(mat1 - mat2)) / 2*a;
      System.out.println("X1 = " + x1); 
      System.out.print("X2 = " + x2);
      
    } 
  
      if ((b == 0) && (c > 0)) {
        System.out.print("No tiene solución en los números reales.");
        } 
      if ((b == 0) && (c < 0)) {
        double x4 = Math.sqrt(-c/a);
        System.out.print("X= " + x4);
        }
    
  
  
     
  }
 }
    
