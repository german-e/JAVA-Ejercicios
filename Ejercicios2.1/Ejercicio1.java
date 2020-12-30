import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Ejercicio1 {

    public static void main(String[] args) {
        boolean seguir = true;
        Scanner scn = new Scanner(System.in);
        List<String> listaCiudades = new ArrayList<String>();

        

        while (seguir) {
            System.out.print("Ingrese su ciudad favorita: "); 
            String ciudad = scn.nextLine();
            listaCiudades.add(ciudad);

            System.out.print("Cargar otra ciudad S/N: "); 
            String respuesta = scn.nextLine().toUpperCase();
            if (respuesta.equals("N")){
                seguir = false;
            }

            
                
            

        }
        scn.close();
        int i = 1;
        for (String c : listaCiudades) {
            System.out.println("N° "+ i +"-"+ c);
            i++;
        }
    }
}