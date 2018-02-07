public class PruebaFraccion {
  public static void main(String[] args) {
    
    Fraccion uno = new Fraccion(2,3);
    
    Fraccion dos = new Fraccion(3,5);
    
    System.out.println(uno);
    System.out.println(dos);
    
    System.out.println(uno.multiplica(dos));
    
    Fraccion multiplicada = uno.multiplica(dos);
    System.out.println(multiplicada);
    
    Fraccion dividida = uno.divide(dos);
    System.out.println(dividida);

    
    
    
  }
}
