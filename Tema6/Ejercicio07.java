/**
*Tema 6*
*Ejercicio 7
*Escribe un programa que muestre tres apuestas de la quiniela en tres 
*columnas para los 14 partidos y el pleno al quince (15 filas).
*/

public class Ejercicio07 { // Clase principal
  public static void main(String[] args) {
    
    
    
    for (int i = 0; i < 14; i++) {
      System.out.println("┌─┬─┬─┐ ┌─┬─┬─┐ ┌─┬─┬─┐");
      for (int columna = 1; columna <= 3; columna++) {
        int resultado = (int) (Math.random() * 3);
        
        switch (resultado) {
          case 0:
            System.out.print("│ │X│ │ ");
            break;
          case 1:
            System.out.print("│1│ │ │ ");
            break;
          case 2:
            System.out.print("│ │ │2│ ");
            break;
          default:
        }
      }
      System.out.println("\n└─┴─┴─┘ └─┴─┴─┘ └─┴─┴─┘");
    }
    
   
    int pleno = (int) (Math.random() * 3);
      System.out.println("            ┌─┬─┬─┐");
      switch (pleno) {
        case 0:
          System.out.println("Pleno al 15 │ │X│ │");
          break;
        case 1:
          System.out.println("Pleno al 15 │1│ │ │");
          break;
        case 2:
          System.out.println("Pleno al 15 │ │ │2│");
          break;
        default:
      }
      System.out.println("            └─┴─┴─┘");
    
  } 
}
