import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresá un numero: ");     
        int numero = input.nextInt();


        calcularYMostrarFactorial(numero);
        input.close();
    }

    private static void calcularYMostrarFactorial(int pNum) {
        int resultado = 1;
        int temp = 2;

        while (temp <= pNum)
        {            
            resultado = (resultado * temp);          
            temp++;
        }   

        System.out.println("El factorial de "+pNum +" es: "+ resultado);
    }
}
