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
  
  Fraccion multiplica (Fraccion f) {
    
    int n;
    int d;
    
    n = this.numerador * f.numerador;
    d = this.denominador * f.denominador;
    
    Fraccion resultado = new Fraccion(n,d);
    
    return resultado;
    
  }
  
  Fraccion divide (Fraccion f) {
    
    int n;
    int d;
    
    n = this.numerador * f.denominador;
    d = this.denominador * f.numerador;
    
    Fraccion resultado = new Fraccion(n,d);
    
    return resultado;
    
  }
    
  

}
