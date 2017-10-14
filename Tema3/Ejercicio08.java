/**
*Tema 3*
*Ejercicio 8
*Programa que calcule el salario semanal en base a las horas trabajadas
*12€ la hora
*/

import java.util.Scanner;

public class Ejercicio08 { // Clase principal
  public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce las horas trabajadas esta semana: ");
  int horas = s.nextInt();
  
  int salario = horas * 12;
  System.out.print("Tu salario semanal es: " + salario + "€" );

  }
} 
