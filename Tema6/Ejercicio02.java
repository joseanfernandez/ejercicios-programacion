/**
*Tema 6*
*Ejercicio 2
*Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa.
*Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. 
*Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales:
* 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). 
*Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n). 
*/

public class Ejercicio02 { // Clase principal
  public static void main(String[] args) {
    
    int carta = (int)(Math.random() * 13) + 1;
    switch (carta) {
      case 1:
        System.out.print("A");
        break;
      case 11:
        System.out.print("J");
        break;
      case 12:
        System.out.print("Q");
        break;
      case 13:
        System.out.print("K");
        break;
      default:
        System.out.print(carta);
    }
    
    
    
    int palo = (int) (Math.random() * 4) ;
    switch (palo) {
      case 0:
        System.out.print(" de picas.");
        break;
      case 1:
        System.out.print(" de corazones.");
        break;
      case 2:
        System.out.print(" de diamantes.");
        break;
      case 3:
        System.out.print(" de tréboles.");
        break;
      default:
    }
 }
} 
