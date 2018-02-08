/**
 * Tema 9 POO en Java
 * Ejercicio 05
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita saber 
 * el tamaño - mediana o familiar - el tipo - margarita, cuatro quesos o funghi - y su estado - 
 * pedida o servida. La clase debe almacenar información sobre el número total de pizzas que se han 
 * pedido y que se han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. 
 * El siguiente código del programa principal debe dar la salida que se muestra:
 */

  public class Pizza {
    
    
    private static int totalPedidas = 0;
    private static int totalServidas = 0;
    private String tamano = "";
    private String tipo = "";
    private String estado = "";
    
    
    Pizza (String ta, String ti ) { 
      this.tamano = ta;
      this.tipo = ti;
      this.estado = "pedida";
      Pizza.totalPedidas += 1;
      
    }
    
    
    
    // getter
    
    public static int getTotalPedidas() {
      return Pizza.totalPedidas;
    }
    
    public static int getTotalServidas() {
      return Pizza.totalServidas;
    }
    
    
    
    void sirve () {
      
      if (this.estado.equals("servida")) {
        System.out.println("esa pizza ya se ha servido");
      } else {
        this.estado = "servida";
        Pizza.totalServidas += 1;
      }
    }
    
    public String toString() {
      
      String mensaje = "";
      mensaje = "pizza " + this.tamano + " " + this.tipo + ", " + this.estado;
      return mensaje;
    }
    
  }
