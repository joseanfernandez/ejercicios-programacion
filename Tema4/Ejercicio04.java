/**
*Tema 4*
*Ejercicio 4
*Programa que calcule el salario semanal en base a las horas trabajadas
*12€ la hora para las primeras 40 horas
*16€ la hora extra
*/

import java.util.Scanner;

public class Ejercicio04 { // Clase principal
  public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce las horas trabajadas esta semana: ");
  int horas = s.nextInt();
  
  if (horas <= 40) {
      int salario = horas * 12;
      System.out.print("Tu salario semanal es: " + salario + "€" ); 
    } else {
      int horasextra = horas - 40;
      int horas2 = horas - horasextra;
      int salario2 = (horas2 * 12) + (horasextra * 16);
      
      System.out.println("Tu salario semanal es: " + salario2 + "€");
      System.out.println("En horas extra has ganado: " + horasextra * 16 + "€");
      
    }
  

  }
} 
