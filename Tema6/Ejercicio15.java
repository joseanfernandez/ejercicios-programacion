/**
*Tema 6*
*Ejercicio 15
*Realiza un generador de melodía con las siguientes condiciones:
*a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
*b) Una melodía está formada por un número aleatorio de notas mayor o igual
*a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
*c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la barra 
*vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
*d) La última nota de la melodía debe coincidir con la primera.
*/

public class Ejercicio15 { // Clase principal
  public static void main(String[] args) {
    
    int totalNotas = (int)((Math.random() * 7) +1) * 4;
    int contador = 1;
    int numero = 0;
    int volteado = 0;
    int digito = 0;
    int primera = (int)(Math.random() * 7);
    int ultima = primera;
    
    switch (primera) {
        case 0:
          System.out.print("do");
          break;
        case 1:
          System.out.print("re");
          break;
        case 2:
          System.out.print("mi");
          break;
        case 3:
          System.out.print("fa");
          break;
        case 4:
          System.out.print("sol");
          break;
        case 5:
          System.out.print("la");
          break;
        case 6:
          System.out.print("si");
          break;
        default:
      }
    System.out.print(" ");
    
    while (totalNotas - 2 > 0 ) {
      int notas = (int)(Math.random() * 7);
      switch (notas) {
        case 0:
          System.out.print("do");
          break;
        case 1:
          System.out.print("re");
          break;
        case 2:
          System.out.print("mi");
          break;
        case 3:
          System.out.print("fa");
          break;
        case 4:
          System.out.print("sol");
          break;
        case 5:
          System.out.print("la");
          break;
        case 6:
          System.out.print("si");
          break;
        default:
      }
      totalNotas--;
      System.out.print(" ");
      contador++;
      if ((contador==4) || (contador==8) || (contador==12) || (contador==16) || (contador==20) || (contador==24) || (contador==28)) {
        System.out.print("| ");
      }
    }
    switch (ultima) {
        case 0:
          System.out.print("do");
          break;
        case 1:
          System.out.print("re");
          break;
        case 2:
          System.out.print("mi");
          break;
        case 3:
          System.out.print("fa");
          break;
        case 4:
          System.out.print("sol");
          break;
        case 5:
          System.out.print("la");
          break;
        case 6:
          System.out.print("si");
          break;
        default:
      }
    System.out.print("||");
  }
}
