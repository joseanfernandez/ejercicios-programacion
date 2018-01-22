
package ejercicios1al14;

public class Numeros {
  
  /**
   * Cuenta el número de dígitos de un número entero.
   * @param x
   * @return Número de digitos
   */
  public static int digitos(int x) {
    
    int contador = 0;
    
    while (x > 0) {
    x = x / 10;
    contador++;
    }
    
    return contador;
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
   * Dada una base y un exponente devuelve la potencia.
   * @param b (base) y e (exponente).
   * @return Potencia.
   */
  public static int potencia(int b, int e) {
    int potencia = 1;
    for (int i = 0; i < e; i++) {
      potencia = potencia * b;
    }
    return potencia;
  }
  
  /**
   * Nos dice si un número es o no primo
   * @param x
   * @return True si es primo, False si no lo es.
   */
  public static boolean esPrimo(int x) {
    boolean esPrimo = true; 
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        esPrimo = false;
      }
    }   
    
    return esPrimo;
  }
  
  /**
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   * @param x
   * @return El primo siguiente al número introducido.
   */
  public static int siguientePrimo (int x) {
    
    do {
      x = x + 1;
      
      if (esPrimo(x)) {
        
      } 
    } while (esPrimo(x) == false);
    return x;
  }
  
  
  /**
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   * @param x
   * @return El primo siguiente al número introducido.
   */
  public static int siguientePrimo2 (int x) {
    
    do { } while (!esPrimo(++x));
    return x;
  }
  
  
  /**
   * Devuelve el dígito que está en la posición n de un número entero. 
   * Se empieza contando por el 0 y de izquierda a derecha.
   * @param num (número introducido) y pos (posición)
   * @return Dígito en la posición elegida.
   */
  public static int digitoN(int num, int pos) {
    
    int volteado = voltea(num);
    
    int digito = 0;
    
    while (pos >= 0) {
      
      digito = volteado % 10;
      volteado = volteado / 10;
      pos--;
    }
    return digito;
  }
  
  
  
  public static int posicionDeDigito2(int x, int y) {
    
    int volteado = voltea(x);
    int pos = 0;
    int digito = 0;
    
    while ((volteado > 0) && (digito != y)) {
      
      digito = volteado % 10;
      
      if (digito != y) {
        volteado = volteado / 10;
        pos++;
      }
    }
    
    if (digito == y) {
      return pos;
    } else {
      return -1;
    }
  }
    
  
  public static int posicionDeDigito(int x, int y) {
    
    
    int pos = 0;
    int digito = 0;
    
    while ((x > 0) && (digito != y)) {
      
      digito = x % 10;
      
      if (digito != y) {
        x = x / 10;
        pos++;
      }
    }
    
    if (digito == y) {
      return pos;
    } else {
      return -1;
    }
  }
  
  public static long voltea2(long x) {
    if (x < 0) {
      return -voltea2(-x);
    }

    long volteado = 0;

    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }
  
  public static int posicionDeDigito3(int x, int d) {
    int i;

    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

    if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }
  }
  
  
  public static int quitaPorDetras(int x, int y) {
    
    for (int i = 0; i < y; i++) {
      x = x /10;
    }
    return x;
  }
  
  
  public static int quitaPorDelante(int x, int y) {
    
    return voltea(quitaPorDetras(voltea(x), y));
    
  }
  
  
  public static int pegaPorDetras(int x, int y) {
    
    for (int i = 0; i < digitos(y); i++) {
      x = x * 10;
    }
     return x + y;
  }
  
  
  public static int pegaPorDelante(int x, int y) {
    
    
    return voltea(pegaPorDetras(voltea(x), voltea(y)));
    
  }
  
  // revisar
  public static int trozoDeNumero(int x, int y, int z) {
    
    return quitaPorDelante(quitaPorDetras(x,z), y); 
  }
  
  
  
  public static int juntaNumeros (int x, int y) {
    
    return  pegaPorDelante(y , x);
  }
    
    
}



