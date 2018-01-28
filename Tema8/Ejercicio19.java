/**
 * Tema 8
 * Ejercicio 19
 * Une y amplía los dos programas anteriores de tal forma que se permita convertir un número entre 
 * cualquiera de las siguientes bases: decimal, binario, hexadecimal y octal.
 */
 
  import java.util.Scanner;
  import ejercicios1al14.Numeros;
  
  public class Ejercicio19 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.println("(1)  Decimal a Binario.");
    System.out.println("(2)  Decimal a Octal.");
    System.out.println("(3)  Decimal a Hexadecimal.");
    System.out.println("(4)  Binario a Decimal.");
    System.out.println("(5)  Binario a Octal.");
    System.out.println("(6)  Binario a Hexadecimal.");
    System.out.println("(7)  Octal a Decimal.");
    System.out.println("(8)  Octal a Binario.");
    System.out.println("(9)  Octal a Hexadecimal.");
    System.out.println("(10) Hexadecimal a Decimal.");
    System.out.println("(11) Hexadecimal a Binario.");
    System.out.println("(12) Hexadecimal a Octal.");
    System.out.print("Elige una opción: ");
    int elige = s.nextInt();
    
    
    
    if (elige >= 1 && elige <= 9) {
      
      System.out.print("Introduce el número: ");
      int num = s.nextInt();  
      
      switch (elige) {
      
        case 1: 
          System.out.print("El número en binario es: ");
          System.out.print(ejercicios1al14.Numeros.decimalABinario(num));
          break;
          
        case 2:
          System.out.print("El número en octal es: ");
          System.out.print(ejercicios1al14.Numeros.decimalAOctal(num));
          break;
          
        case 3:
          System.out.print("El número en hexadecimal es: ");
          System.out.print(ejercicios1al14.Numeros.decimalAHexadecimal(num));
          break;
          
        case 4:
          System.out.print("El número en decimal es: ");
          System.out.print(ejercicios1al14.Numeros.binarioADecimal(num));
          break;
        case 5:
          System.out.print("El número en octal es: ");
          System.out.print(ejercicios1al14.Numeros.decimalAOctal(ejercicios1al14.Numeros.binarioADecimal(num)));
          break;
        case 6:
          System.out.print("El número en hexadecimal es: ");
          System.out.print(ejercicios1al14.Numeros.decimalAHexadecimal(ejercicios1al14.Numeros.binarioADecimal(num)));
          break;
        case 7:
          System.out.print("El número en decimal es: ");
          System.out.print(ejercicios1al14.Numeros.octalADecimal(num));
          break;
        case 8: 
          System.out.print("El número en binario es: ");
          System.out.print(ejercicios1al14.Numeros.decimalABinario(ejercicios1al14.Numeros.octalADecimal(num)));
          break;
        case 9:
          System.out.print("El número en hexadecimal es: ");
          System.out.print(ejercicios1al14.Numeros.decimalAHexadecimal(ejercicios1al14.Numeros.octalADecimal(num)));
          break;
        default:
      }
      
    } else if (elige >= 10 && elige <= 12) {
        
        System.out.print("Introduce el número: ");
        String numHex = System.console().readLine();
        
        switch (elige) {
          
          case 10:
            System.out.print("El número en decimal es: ");
            System.out.print(ejercicios1al14.Numeros.hexadecimalADecimal(numHex));
            break;
          case 11:
            System.out.print("El número en binario es: ");
            System.out.print(ejercicios1al14.Numeros.decimalABinario(ejercicios1al14.Numeros.hexadecimalADecimal(numHex)));
            break;
          case 12:
            System.out.print("El número en octal es: ");
            System.out.print(ejercicios1al14.Numeros.decimalAOctal(ejercicios1al14.Numeros.hexadecimalADecimal(numHex)));
            break;
          default:
          
        }
      
      
    } else {
      
        System.out.print("Error, no has elegido una opción válida.");
    }
      
      
  }
}
