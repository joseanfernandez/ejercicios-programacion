/**
*Tema 3*
*Ejercicio 7
*Total de factura a partir de la base imponible
*/

public class Ejercicio07 { // Clase principal
  public static void main(String[] args) {
  
  String base;
  
  System.out.print("Introduce la base imponible: ");
  base = System.console().readLine();
  int baseNum;
  baseNum = Integer.parseInt( base ) ;
  
  double total;
  total = baseNum * 1.21;
  
  System.out.println("El precio con IVA es: " + total); 
  

  }
} 
