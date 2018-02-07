public class pruebaAnimal {
  public static void main(String[] args) {
    
    Perro laika = new Perro("Labrador", "Hembra" ); 
    
    laika.ladra();
    laika.duerme();
    laika.amamanta();
    laika.come();
    
    Pinguino happy = new Pinguino(1.30);
    
    happy.vuela();
    
    Canario paco = new Canario("Amarillo");
    
    paco.vuela();
    paco.come();
    
    Gato misifu = new Gato("Siamés", "Macho");
    
    misifu.come();
    misifu.salta();
    
    Lagarto jorge = new Lagarto("Verde");
    
    jorge.come();
    jorge.tomaSol();
    
   
  }
}


