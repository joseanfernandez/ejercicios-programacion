/**
*Tema 6*
*Ejercicio 9
*Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
*y que no termine de generar números hasta que no saque el 24. 
*El programa deberá decir al final cuántos números se han generado.
*/

public class Ejercicio09 { // Clase principal
  public static void main(String[] args) {
    
    int contador = 0;
    int numero = 0;
    
    
    do {
      numero = (int)( Math.random() * 101);
      
      if (numero % 2 == 0) {
        System.out.print(numero + " ");
        contador++;
      }
    
    } while (numero != 24);
    System.out.println();
    System.out.print("Números generados: " + contador);
        
  } 
}
