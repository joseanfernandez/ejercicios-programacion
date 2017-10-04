public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
   
  
    System.out.println("Hora   Lunes   Martes   Miércoles   Jueves   Viernes");
    System.out.println("----------------------------------------------------");
    System.out.println(blanco+"08:15"+   rojo+"   PRO"+     naranja+"     SINF"+       rojo+"      PRO"+        morado+"         ED"+       naranja+"       SINF");
    System.out.println(blanco+"09:15"+   rojo+"   PRO"+     naranja+"     SINF"+       rojo+"      PRO"+        morado+"         ED"+       naranja+"       SINF");
    System.out.println(blanco+"10:15"+   rojo+"   PRO"+     naranja+"     SINF"+       rojo+"      PRO"+        morado+"         ED"+       naranja+"       SINF");
    System.out.println("");
    System.out.println(blanco+"11:45"+   verde+"   BBDD"+    azul+"    LM "+         verde+"       BBDD"+       azul+"        LM"+       blanco+"       FOL");
    System.out.println(blanco+"12:40"+   verde+"   BBDD"+    rojo+"    PRO"+        verde+"       BBDD"+       azul+"        LM"+       blanco+"       FOL");
    System.out.println(blanco+"13:35"+   verde+"   BBDD"+    rojo+"    PRO"+        verde+"       BBDD"+       azul+"        LM"+       blanco+"       FOL");
    
  }
} 
