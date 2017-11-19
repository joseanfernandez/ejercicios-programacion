/**
*Tema 6*
*Ejercicio 14
*Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. 
*El programa intentará adivinar el número que estás pensando - un número entre 0 y 100 - 
*teniendo para ello 5 oportunidades. 
*En cada intento fallido, el programa debe preguntar si el número que estás 
*pensando es mayor o menor que el que te acaba de decir.
*/

import java.util.Scanner;

public class Ejercicio14 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Adivino el número que estás pensando.");
    System.out.println("Tengo 5 oportunidades.");
    int numero = 0;
    int intentos = 5;
    boolean acertado = false;
    int min = 0;
    int max = 101;
    
    
    do {
      numero = (int)(Math.random() * (max - min) + min);
      System.out.println(numero);
      System.out.print("¿Es ese tu número? (1)Si / (2)No, es mayor / (3)No, es menor: ");
      int respuesta = s.nextInt();
      
      if (respuesta == 1) {
        acertado = true;
        System.out.print("¡He acertado!");
      } 
      if (respuesta == 2) {
        min = numero + 1;
      }
      if (respuesta == 3) {
        max = numero - 1;
      } 
     
      intentos --;
      
    }  while ((acertado == false ) && (intentos > 0)); 
    
    if ((intentos == 0) && (acertado == false)) {
        System.out.print("He agotado mis cinco aportunidades.");
    }  
    
    
  } 
}
