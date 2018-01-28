
package funcionesVariadas;

public class Funciones {
  
  /**
   * Esta función convierte el número n al sistema de palotes.
   * @param n
   * @return String 
   */
  public static String convierteEnPalotes(int n) {
    
    String palotes = "";
    int volteado = 0;
    int digito = 0;
    
    while (n > 0) {
      
      volteado = (volteado * 10) + (n % 10);
      n /= 10;
    } 
    
    while (volteado > 0) {
      digito = volteado % 10;
      
      
      for (int i = 1; i <= digito; i++) {
        palotes += "|";
      }
        
      
      volteado /= 10; 
      if (volteado > 0) {
        palotes += "-"; 
      }
    }  
  
    return palotes;
  }
    
    
    
    /**
   * Nos dice si un número es o no primo
   * @param x
   * @return True si es primo, False si no lo es.
   */
  public static boolean esPrimo(int x) {
    boolean esPrimo = true; 
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0){
        esPrimo = false;
      }
    }   
    
    return esPrimo;
  }
  
  
  
  /**
   * Le da la vuelta a un número. 
   * @param x
   * @return Número volteado.
   */
  public static int voltea(int x) {
    
    int volteado = 0;
    
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x /= 10;
    }
    
    return volteado;
  }
  
  
    /**
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
   * @param x
   * @return Devuelve true si es capicua o false si no lo es.
   */
  public static boolean esCapicua(int x) {
    
    return voltea(x) == x;

  }
  
  
    /**
   * Devuelve un array con todos los número primos que se encuentra en otro array que se pasa
   * como parámetro.
   * @param x[] (array)
   * @return  Array con primos, o array -1.
   */
  public static int[] filtraPrimos(int x[]) {
    
    int arrayAux [] = new int [x.length];
    int aux = 0;
    int noPrimos [] = {-1};
    
    for (int i = 0; i < x.length; i++) {
      
      if(esPrimo(x[i])) {
        
        arrayAux[aux] = x[i];
        aux++;
        
      }
    }
    
    int primos [] = new int [aux];
    
    if (aux > 0) {
    
      for (int i = 0; i < aux ; i++) {
        primos[i] = arrayAux[i];
      }
      
       return primos;
      
    } else {
      
      return noPrimos;
    }
  }
  
  /**
   * Esta función convierte el número n al sistema Morse.
   * @param n
   * @return String 
   */
  public static String convierteEnMorse(int n) {
    
    String morse = "";
    String [] valores = {"_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _", 
      ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ ."};
    int volteado = 0;
    int digito = 0;
    
    while (n > 0) {
      
      volteado = (volteado * 10) + (n % 10);
      n /= 10;
    } 
    
    while (volteado > 0) {
      digito = volteado % 10;
      
      
      morse += valores[digito];
        
      
      volteado /= 10; 
      
      
    }  
  
    return morse;
  }
  
  
  
  /**
   * Devuelve un array con todos los número capicúas que se encuentra en otro array que se pasa
   * como parámetro.
   * @param x[] (array)
   * @return  Array con capicúas, o array -1.
   */
  public static int[] filtraCapicuas(int x[]) {
    
    int arrayAux [] = new int [x.length];
    int aux = 0;
    int noCapicuas [] = {-1};
    
    for (int i = 0; i < x.length; i++) {
      
      if(esCapicua(x[i])) {
        
        arrayAux[aux] = x[i];
        aux++;
        
      }
    }
    
    int capicuas [] = new int [aux];
    
    if (aux > 0) {
    
      for (int i = 0; i < aux ; i++) {
        capicuas[i] = arrayAux[i];
      }
      
       return capicuas;
      
    } else {
      
      return noCapicuas;
    }
  }
  
  
  /**
   * Esta función convierte los dígitos del número n en las correspondientes palabras.
   * @param n
   * @return String 
   */
  public static String convierteEnPalabras(int n) {
    
    String palabras = "";
    String [] valores = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", 
                        "nueve"};
    int volteado = 0;
    int digito = 0;
    
    while (n > 0) {
      
      volteado = (volteado * 10) + (n % 10);
      n /= 10;
    } 
    
    while (volteado > 0) {
      digito = volteado % 10;
      
      
      palabras += valores[digito];
        
      
      volteado /= 10; 
      if (volteado > 0) {
        palabras += ","; 
      }
      
      
    }  
  
    return palabras;
  }
  
  
  
  /**
   * Devuelve un array con todos los número que contienen un 7, que se encuentra en otro array 
   * que se pasa como parámetro.
   * @param x[] (array)
   * @return  Array con numeros que tienen 7, o array -1.
   */
  public static int[] filtraCon7(int x[]) {
    
    int arrayAux [] = new int [x.length];
    int aux = 0;
    int noSietes [] = {-1};
    int digito = 0;
    int volteado = 0;
    int y = 0;
    
    for (int i = 0; i < x.length; i++) {
      
      boolean contiene = false;
      y = x[i];
      
      while ((y > 0) && (!contiene)) {
        
        digito = y % 10;
        
        if (digito == 7) {
          
          contiene = true;
          
        }
        
         
        
        if (contiene) {
          
          arrayAux[aux] = x[i];
          aux++;
        }
        y /= 10;
      }
      
    } 
    
    int sietes [] = new int [aux];
    
      if (aux > 0) {
      
        for (int i = 0; i < aux ; i++) {
          sietes[i] = arrayAux[i];
        }
        
         return sietes;
        
      } else {
        
        return noSietes;
      } 
        
      
      
  }
  
}
