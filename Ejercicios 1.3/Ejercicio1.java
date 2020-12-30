/*
Solicitar por consola el nombre del usuario 
e imprimir por pantalla el siguiente mensaje 
“HOLA {USUARIO}!!!”
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("¿Cual es tu nombre?: ");
        String nombre  = entrada.nextLine();

        Saludar(nombre);
        entrada.close();
    }
    
    private static void Saludar(String nombre){
        System.out.printf("Hola %s", nombre);

        
    }
}
