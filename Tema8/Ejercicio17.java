/**
 * Tema 8
 * Ejercicio 17
 * Escribe un programa que pase de binario a decimal.
 */
 
  import java.util.Scanner;
  import ejercicios1al14.Numeros;
  
  public class Ejercicio17 { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número binario: ");
    int binario = s.nextInt();
    int digito = 0;
    int decimal = 0;
    int e = 0;
    
    while (binario > 0) {
      
      digito = binario % 10;
      digito = digito * ejercicios1al14.Numeros.potencia(2,e);
      decimal += digito;
      binario /= 10;
      e++;
    }
    
    System.out.print("El número en decimal es: " + decimal);
      
  }
}
