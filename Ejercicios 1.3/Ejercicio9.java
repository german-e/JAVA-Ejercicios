import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
       

        Scanner scn = new Scanner(System.in);      

        System.out.print("Ingrese un texto: ");            
        String nombre = scn.nextLine();
        
        System.out.println("Ingrese una letra que desea buscar. \nNota: Si ingresa mas de una letra se tomará la primera");
        char letra = scn.next().charAt(0);


        int cant = 0;
        
        for (int i =0; i< nombre.length(); i++){
            if (nombre.charAt(i) == letra)
            { cant++; }
        }       
        
        System.out.println("Cant: "+ cant);   
        scn.close();       
        
    }
}
