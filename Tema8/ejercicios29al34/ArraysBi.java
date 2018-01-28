

package ejercicios29al34;


public class ArraysBi {
  
  
  /**
     * Muestra un array.
     * @param 
     * @return 
     */
    public static void muestraArray(int array[]) {
      
        for (int i=0; i < array.length; i++) {
          System.out.print(array[i] + " ");
        }
    }
    
  
  
  /**
     * Le da la vuelta a un array.
     * @param array[]
     * @return array[] volteado
     */
    public static int [] volteaArrayInt(int array []) {
      
      int[] arrayAux = new int [array.length];
      
      for (int i = 0; i < array.length; i++) {
        
        arrayAux[i] = array[i];
        
      }
      
      int j = array.length - 1;
      
      for (int i = 0; i < array.length; i++) {
        
        arrayAux[i] = array[j];
        j--;
      }
      
      return arrayAux;
    }
    
    
  /**
     * Devuelve el mínimo del array que se pasa como parámetro.
     * @param array[]
     * @return Mínimo valor del array.
     */
    public static int minimoArrayInt(int array[]) {
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
          if (array[i] < min) {
            min = array[i];
          }
        }
        
        return min;
    }
    
    
    /**
     * Devuelve el máximo del array que se pasa como parámetro.
     * @param array[]
     * @return Máximo valor del array.
     */
    public static int maximoArrayInt(int array[]) {
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
          if (array[i] > max) {
            max = array[i];
          }
        }
        
        return max;
    }
    
    
  
  /**
     * Muestra un array bidemensional
     * @param array [][]
     * @return valores del array
     */
    public static void muestraArrayBi(int array[][]) {
      
        for (int j=0; j< array.length; j++) {
          for (int i=0; i < array[j].length; i++) {
            System.out.print(array[j][i] + " ");
          }
          System.out.println();
        }
    }
  
  /**
     * Genera un array de tamaño n x m con números aleatorios cuyo intervalo (mínimo y máximo) 
     * se indica como parámetro.
     * @param n (filas array), m, (columnas array),max (máximo) y min (mínimo).
     * @return array n x m
     */
    public static void generaArrayBiInt(int n, int m, int min, int max) {
      
        int[][] array = new int [n][m];
        
        for (int j=0; j < n; j++) {
          for (int i=0; i< m; i++) {
          
            array[j][i] = (int)(Math.random() * (max - min + 1) + min);
          }
        }
        
        muestraArrayBi(array);
        
    }
    
    
    /**
      * Devuelve la fila i-ésima del array que se pasa como parámetro. 
      * @param array[][], i
      * @return fila del array elegida
      */
      public static int[] filaDeArrayBiInt(int array[][], int n) {
       
          int [] fila = new int [array.length];
          
          for (int i=0; i < array[n].length; i++) {
            
            fila [i] = array[n][i];
            
          }
          
          return fila;
      }
      
      
    /**
      * Devuelve la columna j-ésima del array que se pasa como parámetro.
      * @param array[][], j
      * @return fila del array elegida
      */
      public static int[] columnaDeArrayBiInt(int array[][], int n) {
       
          int [] columna = new int [array[n].length];
          
          for (int j=0; j < array.length; j++) {
            
            columna [j] = array[j][n];
            
          }
          
          return columna;
      }
      
    
    /**
      * Devuelve la fila y la columna (en un array con dos elementos) de la primera ocurrencia 
      * de un número dentro de un array bidimensional. Si el número no se encuentra en el array, 
      * la función devuelve el array {-1, -1}.
      * @param array[][], p
      * @return coordenada
      */
      public static void coordenadasEnArrayBiInt(int array [][], int p) {
        
        
        int fil = -1;
        int col = -1;
      
          for (int j=0; j< array.length; j++) {
            
            for (int i=0; i < array[j].length; i++) {
              
              if (array[j][i] == p) {
                
                fil = j;
                col = i;
              }
            }
          
          }
          
          System.out.print("{"+ fil + "," + col + "}");
      }
      
      
    /**
      * Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
      * @param array[][], j (fila), i (columna)
      * @return true si es el menor de la fila y el mayor de la columna, false si no lo es.
      */
      public static boolean esPuntodeSilla(int array [][], int j, int i) {
        
        int fil [] = filaDeArrayBiInt(array,j);
        int col [] = columnaDeArrayBiInt(array,i);
        
        return ((minimoArrayInt(fil) == array[j][i]) && (maximoArrayInt(col) == array[j][i]));
        
      }
      
      
    /**
      * Devuelve un array que contiene una de las diagonales del array bidimensional que se pasa 
      * como parámetro. Se pasan como parámetros fila, columna y dirección. 
      * La fila y la columna determinan el número que marcará las dos posibles diagonales dentro 
      * del array. 
      * La dirección es una cadena de caracteres que puede ser “nose” o “neso”. 
      * La cadena “nose” indica que se elige la diagonal que va del noroeste hacia el sureste, 
      * mientras que la cadena “neso” indica que se elige la diagonal que va del noreste hacia 
      * el suroeste.
      * @param array[][], p
      * @return coordenada
      */
      public static int [] diagonal(int array [][], int j, int i, String direc) {
        
        int l = 0;
        
        if (j > i) {
          l = i;
        } else {
          l = j;
        }
          
        int diagonal [] = new int [100];
        int diagonalAux [] = new int [100];
        int diagonalAux3 [] = new int [100];
        
        
        int a = 0;
        int b = 0;
        
        if (direc.equals("nose")) {
          
          int f = j - l;
          int c = i - l;
          
          while (( f < array.length) && (c < array[j].length)) {
            
            diagonal[a] = array[f][c];
            f++;
            c++;
            a++;
            
          }
        }
        
        if (direc.equals("neso")) {
          
          // En construcción
          
            
        }
        
        int[] d = new int[a];
        for (int k = 0; k < a ; k++) {
        d[k] = diagonal[k];
        } 
        
        return d;
      }
      
      
      
      
      
      
      

}
