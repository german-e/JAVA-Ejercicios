import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      
        
        String nombre = scn.nextLine();
        String edad = scn.nextLine();
        String domicilio = scn.nextLine();
        String ciudad = scn.nextLine();

        System.out.println("** Mostrar **");
        System.out.printf("%s - %s - %s - %s", ciudad,domicilio,edad,nombre); 
        
        scn.close();
    }
    
}
