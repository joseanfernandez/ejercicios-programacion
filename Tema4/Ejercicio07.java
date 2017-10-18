/**
*Tema 4
*Ejercicio 7
*Programa que calcule la media de 3 notas
*/

import java.util.Scanner;

public class Ejercicio07 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce tus tres notas separadas por un espacio, luego pulsa intro: ");
    double nota1 = s.nextDouble();
    double nota2 = s.nextDouble();
    double nota3 = s.nextDouble();
    
    double media = (nota1 + nota2 + nota3)/3 ;
    
    System.out.printf("La media de tus notas es: %.3f " , media);
    
  }
} 

