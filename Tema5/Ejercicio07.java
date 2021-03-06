/**
*Tema 5*
*Ejercicio 7
*Realiza el control de acceso a una caja fuerte.
*La combinación será un número de 4 cifras.
*El programa nos pedirá la combinación para abrirla. 
*Si no acertamos, se nos mostrará el mensaje
*“Lo siento, esa no es la combinación” y si acertamos se nos dirá
*“La caja fuerte se ha abierto satisfactoriamente”. 
*Tendremos cuatro oportunidades para abrir la caja fuerte.
*/

import java.util.Scanner;

public class Ejercicio07 { // Clase principal
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la combinación para abrir la caja fuerte: ");
    
   
    boolean acertado = false;
    int intentos = 4;
    
    do {
		int combi = s.nextInt();
		if (combi == 7315) { 
	    acertado = true;
		} else {
			System.out.println("Lo siento, esa no es la combinación.");			
		}
		intentos--;
	} while ((intentos > 0) && (!acertado));
	
	
	if (acertado) {
	  System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
	}  else {
	   System.out.println("Ha agotado los intentos.");
	}
    
  } 
}
