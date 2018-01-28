/**
 * Tema 7B
 * Ejercicio 8B
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas 
 * podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil 
 * se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican con las 
 * letras de la “a” a la “h” y las filas se indican del 1 al 8.
 */

  import java.util.Scanner;
  
  public class Ejercicio08B { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    String [] [] tablero = new String [8][8];
    String posicion;
    String [] alfil = new String [13];  // 13 es el máximo de posiciones en el tablero vacio
    int a = 0;
    
    String azul = "\u001B[34m";
    String rojo = "\u001B[31m";
    String negro = "\u001B[30m";

    
    System.out.print("Introduce la posición del alfil: ");
    posicion = System.console().readLine();
    posicion = posicion.toUpperCase();   // Convertimos a mayúsculas para que no tenga problema.
    
    // Creamos dos arrays unidimensionales y con el bucle montamos el array bidimensional
    // que simula nuestro tablero.
    
    String letras [] = { "A", "B", "C", "D", "E", "F", "G", "H"};
    String numeros [] = {"8","7","6","5","4","3","2","1"};
    
    
    for (int j=0; j < 8; j++) {
      for (int i=0; i < 8; i++) {
        
        tablero [j][i] = letras [i] + numeros[j] ;
      }
    }
    
    
    // Calcula la posicion en el array
    
    int fila = 0;
    int columna = 0;
    boolean existe = false;
    
    System.out.println();
    for (int j=0; j < 8; j++) {
      for (int i=0; i < 8; i++) {
        
        if (tablero[j][i].equals(posicion)) {
          fila = j;
          columna = i;
          existe = true;
        }
      }
    }
    
    if (existe) {
      
      System.out.println("El alfil puede moverse a las siguientes posiciones: ");
      // Posiciones de la diagonal hacia esquina superior izquierda
      
      int f1 = fila -1;
      int c1 = columna - 1;
      
      
      while (( f1 >= 0) && (c1 >= 0)) {

        alfil[a] = tablero[f1][c1];
        c1--;
        f1--;
        a++;
      }
      
      // Posiciones de la diagonal hacia esquina inferior derecha
      
      int f2 = fila + 1 ;
      int c2 = columna + 1 ;
      
      while (( f2 <= 7) && (c2 <= 7)) {
        
        alfil[a] = tablero[f2][c2];
        c2++;
        f2++;
        a++;
      }
      
      // Posiciones de la diagonal hacia esquina inferior izquierda
      
      int f3 = fila + 1;
      int c3 = columna - 1;
      
      while (( f3 <= 7) && (c3 >= 0)) {
   
        alfil[a] = tablero[f3][c3];
        c3--;
        f3++;
        a++;
      }
      
       // Posiciones de la diagonal hacia esquina superior derecha
      
      int f4 = fila - 1;
      int c4 = columna + 1;
      
      while (( f4 >= 0) && (c4 <= 7)) {

        alfil[a] = tablero[f4][c4];
        c4++;
        f4--;
        a++;
      }
      
      
      // Print del tablero completo, mostrando en colores la posicion inicial y las posibles
    
    boolean diagonal = false;
    System.out.println();
    
    for (int j=0; j < 8; j++) {
      
      for (int i=0; i < 8; i++) {
        
        diagonal = false;
        
        if (tablero[j][i].equals(posicion)) {  // Pinta azul la posicion indicada
            System.out.print(azul + tablero[j][i] + " ");
        }
        
        // Comprueba el array de posibles movimientos y pinta en rojo si lo encuentra
        for (int k=0; k < alfil.length; k++) {
          
         if (tablero[j][i].equals(alfil[k])){
           
            System.out.print(rojo + tablero[j][i] + " ");
            diagonal = true;
          } 
        }
        // Pinta en negro si no es la posicion indicada ni se encuentra en el array de posiciones
        if ((!diagonal) && (!tablero[j][i].equals(posicion))) {
          
          System.out.print(negro + tablero[j][i] + " ");
        }
      }
      System.out.println(negro);
    } 
    
    } else {
      
      System.out.print("La posición indicada no existe en el tablero.");
    }
    
  }
}
    

    
    
