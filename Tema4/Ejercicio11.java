/**
*Tema 4
*Ejercicio 11
*Programa que calcule los segundos hasta media noche a partir de la hora y minutos introducidos
*/

import java.util.Scanner;

public class Ejercicio11 { // Clase principal
  public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.println("Calculo de segundos hasta media noche (formato 24 horas)");
  System.out.print("Introduce la hora: ");
  int hora = s.nextInt();
  System.out.print("Introduce los minutos: ");
  int minuto = s.nextInt();
  
  int horadif = 23 - hora;
  int minutodif= 60 - minuto;
  int segundo= (horadif * 3600) + (minutodif * 60);
  System.out.print(segundo + " segundos hasta la media noche.");
  
  }
 }
    
