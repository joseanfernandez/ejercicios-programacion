/**
*Tema 4
*Ejercicio 8
*Programa que calcule la media de 3 notas
*Además debe decir insuficiente, suficiente, bien, notable o sobresaliente
*/

import java.util.Scanner;

public class Ejercicio08 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce tus tres notas separadas por un espacio, luego pulsa intro: ");
    double nota1 = s.nextDouble();
    double nota2 = s.nextDouble();
    double nota3 = s.nextDouble();
    
    double media = (nota1 + nota2 + nota3)/3 ;
    
    
    if (media <5) {
      System.out.println("┏━━━━━━━━━━━━┳━━━━━━┓");
      System.out.printf("%-13s %.3f\n" , " Insuficente", media);
      System.out.print("┗━━━━━━━━━━━━┻━━━━━━┛");
    }
    
    if ((media >= 5) && (media < 6)) {
      System.out.println("┏━━━━━━━━━━━━┳━━━━━━┓");
      System.out.printf("%-13s %.3f\n" , " Suficiente", media);
      System.out.print("┗━━━━━━━━━━━━┻━━━━━━┛");
    }
    
    if ((media >= 6) && (media < 7)) {
      System.out.println("┏━━━━━━━━━━━━┳━━━━━━┓");
      System.out.printf("%-13s %.3f\n" , " Bien", media);
      System.out.print("┗━━━━━━━━━━━━┻━━━━━━┛");
    }
      
    if ((media >= 7) && (media < 9)) {
      System.out.println("┏━━━━━━━━━━━━┳━━━━━━┓");
      System.out.printf("%-13s %.3f\n" , " Notable", media);
      System.out.print("┗━━━━━━━━━━━━┻━━━━━━┛");
    }
     
    if (media >= 9) {
      System.out.println("┏━━━━━━━━━━━━━┳━━━━━┓");
      System.out.printf("%-13s %.3f\n" , " Sobresaliente", media);
      System.out.print("┗━━━━━━━━━━━━━┻━━━━━┛");
    } 
      
    
  }
}
