/**
*Tema 5
*Ejercicio 30
*Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
*No se tendrán en cuenta los minutos ni los segundos. 
*El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
*Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero.
*/

import java.util.Scanner;


public class Ejercicio30 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("1.Lunes - 2.Martes - 3.Miércoles - 4.Jueves - 5.Viernes - 6.Sábado - 7.Domingo");
    System.out.println("Introduce el primer día: ");
    int dia1 = s.nextInt();
    System.out.println("La hora: ");
    int hora1 = s.nextInt();
    System.out.println("Introduce el segundo día: ");
    int dia2 = s.nextInt();
    System.out.println("La hora: ");
    int hora2 = s.nextInt();
    int tiempo1 = 0;
    int tiempo2 = 0;
    int tiempo3 = 0;
    
    if ( dia2 > dia1 ) {
      tiempo1 = 24 - hora1;
      tiempo2 = 24 - hora2;
    }
    
    for (int i = dia1; i < dia2; i++) {
      tiempo3 = tiempo3 + 24;
    }
    System.out.print("Horas transcurridas: " + (tiempo3 + tiempo1 - tiempo2));
  } 
}
