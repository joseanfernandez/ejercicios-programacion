import java.util.Scanner;
import ejercicios29al34.*;

public class pruebas3 { // Clase principal
  public static void main(String[] args) {
  
  
  ejercicios29al34.ArraysBi.generaArrayBiInt(5,4,10,20);
  System.out.println();
  int[][]  nm = {{9,9,8},{3,1,7},{10,5,6}};
  int[][]  no = {{9,9,8,2,4},{3,1,7,3,1},{1,5,6,2,1},{1,5,6,4,2},{8,7,4,0,1}};
  int n[] = {8, 33, 200, 150, 11};
  ejercicios29al34.ArraysBi.muestraArrayBi(no);
  System.out.println();
  //ejercicios29al34.Arrays.muestraArray(ejercicios29al34.ArraysBi.filaDeArrayBiInt(nm,2));
  System.out.println();
  //ejercicios29al34.Arrays.muestraArray(ejercicios29al34.ArraysBi.columnaDeArrayBiInt(nm,2));
  System.out.println();
  //ejercicios29al34.ArraysBi.coordenadasEnArrayBiInt(nm,8);
  System.out.println();
  //ejercicios29al34.ArraysBi.coordenadasEnArrayBiInt(nm,23);
  System.out.println();
  //ejercicios29al34.ArraysBi.coordenadasEnArrayBiInt(nm,6);
  //System.out.print(ejercicios29al34.ArraysBi.esPuntodeSilla(nm,0,2));
  System.out.println(no.length);
  System.out.println(no[0].length);
  ejercicios29al34.Arrays.muestraArray(ejercicios29al34.ArraysBi.diagonal(no,0,0,"nose"));
  System.out.println();
  
  ejercicios29al34.Arrays.muestraArray(ejercicios29al34.ArraysBi.diagonal(no,2,3,"neso"));
  
  
  
  
  
  
  }
}
