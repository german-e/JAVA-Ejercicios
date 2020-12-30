import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
   public static void main(String[] args) {
      ArrayList<Integer> num = new ArrayList<Integer>();

      Scanner scn = new Scanner(System.in);

      num.add(12);
      num.add(21);
      num.add(2);
      num.add(9);
      num.add(51);

      System.out.println("Lista números");
      num.forEach(x -> System.out.println(x));

      
      System.out.print("Ingresar un numero para ingresar al incio: ");
      int numInicio = scn.nextInt();
      num.add(0, numInicio);
      System.out.print("Ingresar un numero para agregar al final: ");
      int numFinal = scn.nextInt();
      num.add(numFinal);
      System.out.println("Lista Numero despues de agregar numero al inicio y final");
      num.forEach(x -> System.out.println(x));
      scn.close();
   } 
}
