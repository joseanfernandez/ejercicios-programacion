/**
*Tema 6*
*Ejercicio 3
*Igual que el ejercicio anterior pero con la baraja española. 
*Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*/

public class Ejercicio03 { // Clase principal
  public static void main(String[] args) {
    
    int carta = (int)(Math.random() * 10) + 1;
    switch (carta) {
      case 1:
        System.out.print("As");
        break;
      case 8:
        System.out.print("Sota");
        break;
      case 9:
        System.out.print("Caballo");
        break;
      case 10:
        System.out.print("Rey");
        break;
      default:
        System.out.print(carta);
    }
    
    
    
    int palo = (int) (Math.random() * 4) ;
    switch (palo) {
      case 0:
        System.out.print(" de oros.");
        break;
      case 1:
        System.out.print(" de copas.");
        break;
      case 2:
        System.out.print(" de espadas.");
        break;
      case 3:
        System.out.print(" de bastos.");
        break;
      default:
    }
 }
} 
