
import java.util.Scanner;
import ejercicios20al28.Arrays;

public class pruebas2 { // Clase principal
  public static void main(String[] args) {
    
    int n[] = {8, 33, 200, 150, 11};
    
    ejercicios20al28.Arrays.muestraArray(n);
    
    //ejercicios20al28.Arrays.generaArrayInt(10,2,8);
    System.out.println();
    System.out.println(ejercicios20al28.Arrays.minimoArrayInt(n));
    System.out.println(ejercicios20al28.Arrays.maximoArrayInt(n));
    System.out.println(ejercicios20al28.Arrays.mediaArrayInt(n));
    
    if (ejercicios20al28.Arrays.estaEnArrayInt(n,11)) {
      System.out.println("Está en el array");
    } else {
      System.out.println("No está en el array");
    }
    
    if (ejercicios20al28.Arrays.estaEnArrayInt(n,14)) {
      System.out.println("Está en el array");
    } else {
      System.out.println("No está en el array");
    }
    
    System.out.println(ejercicios20al28.Arrays.posicionEnArray(n, 150));
    System.out.println(ejercicios20al28.Arrays.posicionEnArray(n, 152));
    //ejercicios20al28.Arrays.volteaArrayInt(n);
    System.out.println();
    ejercicios20al28.Arrays.rotaDerechaArrayInt(n,2);
    System.out.println();
    ejercicios20al28.Arrays.rotaIzquierdaArrayInt(n,2);
    
    
   
  } 
}
    
