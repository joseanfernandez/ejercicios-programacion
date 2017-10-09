/**
*Tema 3*
*Ejercicio 2
*Conversor de euros a pesetas
*/

public class Ejercicio02 { // Clase principal
  public static void main(String[] args) {
  
  String euros;
  
  System.out.print("Euros: ");
  euros = System.console().readLine();
  int eurosNum;
  eurosNum = Integer.parseInt( euros ) ;
  
  double pesetas;
  pesetas = eurosNum * 166.386;
  
  System.out.print(pesetas); 
  System.out.print(" pesetas");
  

  }
} 
