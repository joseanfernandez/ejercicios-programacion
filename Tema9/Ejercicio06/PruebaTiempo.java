  public class PruebaTiempo {
    public static void main(String[] args) {
   
      Tiempo t1 = new Tiempo (10,35,6);
      Tiempo t2 = new Tiempo (0,30,40);
      Tiempo t3 = new Tiempo (0,35,20);
      
      System.out.println(t1);
      System.out.println(t2);
      System.out.println(t3);
      
      Tiempo t4 = t2.sumaTiempos(t3);
      System.out.println(t4);
     
      Tiempo t5 = new Tiempo (2,50,23);
      
      Tiempo t6 = t2.sumaTiempos(t5);
      System.out.println(t6);
      
    }  
  }
