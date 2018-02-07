/**
 * Tema 9 POO en Java
 * Ejercicio 03
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea, al menos, 
 * tres métodos específicos de cada clase y redefine el/los método/s cuando sea necesario. 
 * Prueba las clases creadas en un programa en el que se instancien objetos y se les apliquen 
 * métodos.
 */

  public abstract class Animal {
    
    int edad;
    double peso;
    String sexo;
    
    
  Animal () {
    
  }
  
  
    
    
    
  void come() {
    System.out.println("ñam ñam");
  }  
  
  void duerme() {
    System.out.println("ZzzZzz");
  }
  
  void despierta() {
    System.out.println("Se ha despertado");
  } 

}
