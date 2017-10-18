/**
*Tema 4*
*Ejercicio 1
*Programa que pida día de la semana y diga que asignatura toca a primera hora
*/

import java.util.Scanner;

public class Ejercicio01 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Días de la semana");
    System.out.println("-----------------");
    System.out.println("1.Lunes");
    System.out.println("2.Martes");
    System.out.println("3.Miércoles");
    System.out.println("4.Jueves");
    System.out.println("5.Viernes");
    System.out.print("\nElige un día del 1 al 5: ");
    
    int diaSemana = s.nextInt();
    
    
    switch (diaSemana) {
      
      case 1:
        System.out.print("Los lunes tienes programación");
        break;
      
      case 2:
        System.out.print("Los martes tienes sistemas informáticos");
        break;
      
      case 3:
        System.out.print("Los miércoles tienes programación");
        break;
      
      case 4:
        System.out.print("Los jueves tienes entornos de desarrollo");
        break;
      
      case 5:
        System.out.print("Los viernes tienes sistemas informáticos");
        break;
      
        default:
        System.out.print("Las clases son de lunes a viernes");
      }
      
  
   } 
}
 
 
  
