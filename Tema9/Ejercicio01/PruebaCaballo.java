/**
 * Tema 9 POO en Java
 * Ejercicio 01
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando instancias y 
 * aplicándole algunos métodos.
 */
 
public class PruebaCaballo {
  public static void main(String[] args) {
    
    Caballo bucefalo = new Caballo("Bucéfalo", 10, 132.5, "Macho"); 
    
    bucefalo.galopa();
    bucefalo.duerme();
    System.out.println(bucefalo.getNombre());
    System.out.println(bucefalo.getEdad());
    System.out.println(bucefalo.getPeso());
    System.out.println(bucefalo.getSexo());
    
    
    Caballo pegaso = new Caballo();
    
    pegaso.trota();
    System.out.println(pegaso.getSexo());
    
    System.out.println(bucefalo);
    bucefalo.come("pan");
    bucefalo.come("ZanaHoria");
    
    Caballo chico = new Caballo("Chico", 1, 80.5, "Macho"); 
    Caballo grande = new Caballo("Grande", 8, 100.5, "Hembra"); 
    
    bucefalo.correContra(chico);
    bucefalo.correContra(grande);
    System.out.println(pegaso);
    System.out.println(pegaso.getNombre());
    
    pegaso.setNombre("Pegaso");
    
    System.out.println(pegaso.getNombre());
    
    bucefalo.apareaCon(chico);
    bucefalo.apareaCon(grande);
    
    
    
    
  }
}
