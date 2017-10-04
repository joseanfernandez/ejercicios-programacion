/**
*Tema 2*
*Ejercicio 5
* Conversor de pesetas a euros
*/

public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
  
  double pes;
  pes = 1000;
  double eur;
  eur = pes / 166.386;
  
  System.out.printf("1000 pesetas es igual a %.3f  \n", eur); 
  
  pes = 1000000;
  eur = pes / 166.386;
  
  System.out.printf("1000000 pesetas es igual a %.3f  \n", eur); 

  }
} 
