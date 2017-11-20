/**
*Tema 6*
*Ejercicio 8
*Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2,
*la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6.
*Pista: 1/2 = 3/6 y 1/3 = 2/6.
*/

public class Ejercicio08 { // Clase principal
  public static void main(String[] args) {
    
    for (int i = 0; i < 14; i++) {
      System.out.println("┌─┬─┬─┐ ┌─┬─┬─┐ ┌─┬─┬─┐");
      for (int columna = 1; columna <= 3; columna++) {
        int resultado = (int) (Math.random() * 6);
        switch (resultado) {
          case 0:
            System.out.print("│ │X│ │ ");
            break;
          case 1:
            System.out.print("│ │X│ │ ");
            break;
          case 2:
            System.out.print("│1│ │ │ ");
            break;
          case 3:
            System.out.print("│1│ │ │ ");
            break;
          case 4:
            System.out.print("│1│ │ │ ");
            break;
          case 5:
            System.out.print("│ │ │2│ ");
            break;
          default:
        }
      }
      System.out.println("\n└─┴─┴─┘ └─┴─┴─┘ └─┴─┴─┘");
    }
      
       int pleno = (int) (Math.random() * 6);
      System.out.println("            ┌─┬─┬─┐");
      switch (pleno) {
        case 0:
          System.out.println("Pleno al 15 │ │X│ │");
          break;
        case 1:
          System.out.println("Pleno al 15 │ │X│ │");
          break;
        case 2:
          System.out.println("Pleno al 15 │1│ │ │");
          break;
        case 3:
          System.out.println("Pleno al 15 │1│ │ │");
          break;
        case 4:
          System.out.println("Pleno al 15 │1│ │ │");
          break;
        case 5:
          System.out.println("Pleno al 15 │ │ │2│");
          break;
        default:
      }
      System.out.println("            └─┴─┴─┘");
  }
}
