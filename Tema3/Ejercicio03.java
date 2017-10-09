/**
*Tema 3*
*Ejercicio 3
*Conversor de pesetas a euros
*/

public class Ejercicio03 { // Clase principal
  public static void main(String[] args) {
  
  String pesetas;
  
  System.out.print("Pesetas: ");
  pesetas = System.console().readLine();
  int pesetasNum;
  pesetasNum = Integer.parseInt( pesetas ) ;
  
  double euros;
  euros = pesetasNum / 166.386;
  
  System.out.print(euros); 
  System.out.print(" euros");
  

  }
} 
