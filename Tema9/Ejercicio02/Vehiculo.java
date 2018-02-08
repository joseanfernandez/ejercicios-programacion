/**
 * Tema 9 POO en Java
 * Ejercicio 02
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de la primera. 
 * Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy kilometrosTotales, así 
 * como el atributo de instancia kilometrosRecorridos. Crea también algún método específico para 
 * cada una de las subclases. Prueba las clases creadas mediante un programa con un menú como el 
 * que se muestra a continuación:
 */

  public abstract class Vehiculo {
    
    
    private static int vehiculosCreados = 0;
    private static double kilometrosTotales = 0;
    private double kilometrosRecorridos = 0;
    
    Vehiculo () { }
    
    
    
    // getter
    
    public static double getKilometrosTotales() {
      return Vehiculo.kilometrosTotales;
    }
    
    public static int getVehiculosCreados() {
      return Vehiculo.vehiculosCreados;
    }
    
    double getKilometrosRecorridos() {
      return this.kilometrosRecorridos;
    }
    
    
    
    void recorre(double km) {
      
      this.kilometrosRecorridos += km;
      Vehiculo.kilometrosTotales += km;
      
    }
    
    
  }
