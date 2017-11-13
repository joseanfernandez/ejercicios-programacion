/**
*Tema 6*
*Ejercicio 1
*Escribe un programa que muestre la tirada de tres dados. 
*Se debe mostrar también la suma total (los puntos que suman entre los tres dados).
*/

public class Ejercicio01 { // Clase principal
  public static void main(String[] args) {
    
    int sumatorio = 0;
    
    for (int i = 0; i < 3; i++) {
      int dados = (int)(Math.random() * 6) + 1;
      System.out.println(dados);
      sumatorio += dados;
    }
    System.out.print("La suma de los tres dados es " + sumatorio);
  } 
}
