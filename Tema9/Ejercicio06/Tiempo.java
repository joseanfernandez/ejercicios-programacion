/**
 * Tema 9 POO en Java
 * Ejercicio 06
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo son intervalos 
 * de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30) donde los parámetros que se le 
 * pasan al constructor son las horas, los minutos y los segundos respectivamente. Crea el método 
 * toString para ver los intervalos de tiempo de la forma 10h 35m 5s. 
 * Si se suman por ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. 
 * Realiza un programa de prueba para comprobar que la clase funciona bien.
 */

  public class Tiempo {
    
    
    private  int horas = 0;
    private  int minutos = 0;
    private  int segundos = 0;
    
    
    
    Tiempo (int h, int m, int s) { 
      
      this.horas = h;
      this.minutos = m;
      this.segundos = s;
      
    }
    
    
    
    // getter
    
    int getHoras() {
      return this.horas;
    }
    
    int getMinutos() {
      return this.minutos;
    }
    
    int getSegundos() {
      return this.segundos;
    }
    
    
    // setter
    
    void setHoras(int h) {
      this.horas = h;
    }
    
    void setMinutos(int m) {
      this.minutos = m;
    }
    
    void setSegundos(int s) {
      this.segundos = s;
    }
    
    
    
    Tiempo sumaTiempos(Tiempo time) {
      
      int ht = 0;
      int mt = 0;
      int st = 0;
      
      
      
      if (this.segundos + time.segundos < 60) {
        
        st = this.segundos + time.segundos;
        
      } else {
        
        st = this.segundos + time.segundos - 60;
        mt++;
        
        
      }
      
      if (this.minutos + time.minutos + mt < 60) {
        
        mt = mt + this.minutos + time.minutos;
        
      } else {
        
        mt = mt + this.minutos + time.minutos - 60;
        ht++;
        
      }
      
      ht = ht + this.horas + time.horas;
    
      
      Tiempo sumado = new Tiempo (ht,mt,st);
      
      return sumado;
      
    }
    
    
    
    public String toString() {
      
      String time = "";
      if (this.horas == 0) {
        time = this.minutos + "m " + this.segundos + "s ";
      } else {
        time = this.horas + "h " + this.minutos + "m " + this.segundos + "s ";
      }
      return time;
    }
    
  }
