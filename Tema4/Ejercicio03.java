/**
*Tema 4*
*Ejercicio 3
*Programa que pida un número del 1 al 7 y diga que día de la semana es
*/

import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("Elija una opción (1-7) para saber el día de la semana: ");
  
  int opcion = s.nextInt();
  
  switch (opcion) {
      case 1:
        System.out.print("Lunes");
        break;
        
      case 2:
        System.out.print("Martes");
        break;
        
      case 3:
        System.out.print("Miércoles");
        break;   
        
      case 4:
        System.out.print("Jueves");
        break;
      
      case 5:
        System.out.print("Viernes");
        break;  

      case 6:
        System.out.print("Sábado");
        break;
        
      case 7:
        System.out.print("Domingo");
        break; 
        
    default:
        System.out.print("\nLa semana tiene solo 7 días");
    }
  }
}
