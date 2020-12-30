/*
Realizar un Programa que dado un String de entrada en minúsculas 
lo convierta por completo a mayúsculas. 
Sin uso de métodos o librerías que realicen toUppercase().
*/


import java.util.Scanner;



public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
       
        System.out.print("Ingrese una cadena: ");
        String cadena = input.nextLine().toLowerCase() ;        


        String cadenaEnMayusculas = convertirAMayusculas(cadena);
        System.out.println(cadenaEnMayusculas);    
        input.close();
    }


    private static String convertirAMayusculas(String pCadena) {

        char letras[] = pCadena.toCharArray();
        char mayuscula[] = new char[pCadena.length()];
        
        int i = 0;
        for (char letra : letras) {
            int ASCII = (int)letra;
           if (ASCII == 32 ){  //Pregunta si encontró un espacio (ASCII 32) para evitar que reste 32 y no imprimir ningun caracter
            mayuscula[i] = (char)32;
           } 
           else if (ASCII >= 97 && ASCII <= 122) {
            mayuscula[i] = (char)(ASCII-32);    //los caracteres en mayuscula se ubican en el valor ASCCII de la letra minuscuala - 32
                                                // por ejemplo: a=97    A=65    

           } else {   //SI no es un caracter minuscula sino otro tipo decarater
               mayuscula[i] = (char)ASCII;  //lo imprime tal cual
           }                  
            i++;                     
        }
        
        return new String(mayuscula);
    }
}
