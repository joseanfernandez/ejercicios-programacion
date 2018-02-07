/**
 * Tema 9 POO en Java
 * Ejercicio 04
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los métodos 
 * pueden ser invierte, simplifica, multiplica, divide, etc.
 */

  public class Fraccion {
    
    int numerador;
    int denominador;
    
    
  Fraccion (int n, int d) {
    this.numerador = n;
    this.denominador = d;
   
  }
  
  public String toString() {
    String cadena = "";
    cadena = String.valueOf(this.numerador) + "/" + String.valueOf(this.denominador);
    
    return cadena;
  }
    
    
  
  
    
    
  void invierte() {
    
    
  }
    
  

}
