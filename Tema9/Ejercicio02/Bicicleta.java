public class Bicicleta extends Vehiculo {
    
    
    private String marca = "";
    private String tipo = "";
    private String color = "";
    
    
    Bicicleta (String ma, String ti) {
      
      this.marca = ma;
      this.tipo = ti;
      
    }
    
    // getter
    
    String getMarca() {
      return this.marca;
    }
    
    String getTipo() {
      return this.tipo;
    }
    
    // setter
    
    void setColor(String c) {
      this.color = c;
    }
      
    
    void caballito() {
      System.out.println("¡Está haciendo un caballito con la bicicleta!");
    }
    
    
    
  }
