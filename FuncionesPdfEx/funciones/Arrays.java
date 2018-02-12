
package funciones;

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
        
        arrayAux[i] = array[j];
        j--;
      }
      
      muestraArray(arrayAux);
    }
    
    
    /**
     * Rota n posiciones a la derecha los números de un array.
     * @param array[], n
     * @return array[] rotado las posiciones indicadas.
     */
    public static void rotaDerechaArrayInt(int array [], int n) {
      
      int[] arrayAux = new int [array.length];
      
      for (int i = 0; i < array.length; i++) {
        
        arrayAux[i] = array[i];
        
      }
      
      int aux;
     
      
      while (n > 0) {
        
        aux = arrayAux[arrayAux.length - 1];
        
        for (int i = arrayAux.length - 1; i > 0; i--) {
          arrayAux[i] = arrayAux[i - 1];
        }
        
      arrayAux[0] = aux;
      n--;
      }
      
      muestraArray(arrayAux);
    }
    
    
    
    /**
     * Rota n posiciones a la izquierda los números de un array.
     * @param array[], n
     * @return array[] rotado las posiciones indicadas.
     */
    public static void rotaIzquierdaArrayInt(int array [], int n) {
      
      int[] arrayAux = new int [array.length];
      
      for (int i = 0; i < array.length; i++) {
        
        arrayAux[i] = array[i];
        
      }
      
      int aux;
      
      while (n > 0) {
       
        aux = arrayAux[0];
       
        for (int i = 0; i < arrayAux.length - 1; i++) {
         
          arrayAux[i] = arrayAux[i + 1];
         
        }
        
        arrayAux[arrayAux.length - 1] = aux;
        
        n--;
       
      }
      
      muestraArray(arrayAux);
    }
      
     
      
     /**
     * Devuelve un array con los mismos números que aparecen en un array que se pasa como parámetro 
     * pero barajados,es decir, cambiados de sitio de forma aleatoria.
     * @param x[],
     * @return x[] barajado.
     */
    public static int[ ] baraja(int x[ ]) {
      
      int aux = x.length;
      int [] aux2 = new int[aux];
      int i = 0;
      
      int [] usado = new int[aux];
      boolean existe;
      
      for (int j = 0; j < aux; j++) {
        
        
        
        do {
          
          i = (int)(Math.random() * (aux));
       
          
          existe = false;
          
          for (int k = 0; k < usado.length; k++) {
            
            
            
            if (i == usado[k]) {
              existe = true;
            }
             
        
          }
          
        } while (existe);
          
          
        usado[j] = i;
        
        aux2 [j] = x[i];
        
        muestraArray(aux2);
        System.out.println();
      
      }
        
      return aux2;
    
    }
      
    
  }
