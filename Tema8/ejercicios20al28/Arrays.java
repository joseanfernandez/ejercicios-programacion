
package ejercicios20al28;

public class Arrays {
  
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
     * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) 
     * se indica como parámetro.
     * @param n (tamaño del array), max (máximo) y min (mínimo).
     * @return Array de tamaño n.
     */
    public static void generaArrayInt(int n, int min, int max) {
      
        int[] array = new int [n];
        
        for (int i=0; i < array.length; i++) {
          array[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        
        muestraArray(array);
        
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
     * Devuelve la media del array que se pasa como parámetro.
     * @param array[]
     * @return Media de los valores del array.
     */
    public static double mediaArrayInt(int array[]) {
        
        double sumatorio = 0;
        for (int i = 0; i < array.length; i++) {
          sumatorio += array[i];
        }
        
        return sumatorio/array.length;
    }
    
    
    /**
     * Dice si un número está o no dentro de un array.
     * @param array[], num
     * @return True si está en el array o False si no está.
     */
    public static boolean estaEnArrayInt(int array[], int num) {
        
        boolean esta = false;
        for (int i = 0; i < array.length; i++) {
          if (array[i] == num) {
            esta = true;
          }
        }
        
        return esta;
    }
    
    
    /**
     * Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
     * @param array[], num
     * @return Posición de num
     */
    public static int posicionEnArray(int array[], int num) {
        
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
          if (array[i] == num) {
            return pos;
          }
          pos++;
        }
        
        return -1;
    }
    
    public static void duplicaArray (int array []) {
      
      int[] arrayAux = new int [array.length];
      
      for (int i = 0; i < array.length; i++) {
        
        arrayAux[i] = array[i];
        
      }
      
    }
      
     /**
     * Le da la vuelta a un array.
     * @param array[]
     * @return array[] volteado
     */
    public static void volteaArrayInt(int array []) {
      
      int[] arrayAux = new int [array.length];
      
      for (int i = 0; i < array.length; i++) {
        
        arrayAux[i] = array[i];
        
      }
      
      int j = array.length - 1;
      
      for (int i = 0; i < array.length; i++) {
        
        array[i] = arrayAux[j];
        j--;
      }
      
      muestraArray(array);
    }
    
    
    /**
     * Rota n posiciones a la derecha los números de un array.
     * @param array[], n
     * @return array[] rotado las posiciones indicadas.
     */
    public static void rotaDerechaArrayInt(int array [], int n) {
      
      
      int[] arrayAux = new int [array.length];
      for (int l = 0; l < n; l++) {
      for (int i = 0; i < array.length; i++) {
        
        arrayAux[i] = array[i];
        
      }
      
      
        arrayAux[0] = array[array.length - 1];
         int k = 0;
        for (int j = 1; j < array.length; j++) {
         
          arrayAux[j] = array[k];
          k++;
        }
      }
      muestraArray(arrayAux);
       
    }
      
  }
