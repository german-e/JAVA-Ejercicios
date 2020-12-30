import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresá un numero: ");     
        int num1 = input.nextInt();

        System.out.print("Ingresá un numero: ");     
        int num2 = input.nextInt();

        int potencia = calcularPotencia(num1, num2);
        
        System.out.printf("%d elevado a la %d es: %d", num1, num2, potencia);
        input.close();
    }


    private static int calcularPotencia(int pNum1, int pNum2) {
        
        int resultado = 1;
        int temp = 1;
        while ( temp <= pNum2) {
            resultado = resultado * pNum1;
            temp ++;            
        }
        
        return resultado;

    }

}
