/*
Realizar un programa que solicite por consola 2 números enteros. 
Para luego imprimir el resultado de la suma, resta, multiplicación, 
división y módulo (resto de la división) de ambos números.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresá un numero: ");     
        int num1 = input.nextInt();

        System.out.print("Ingresá un numero: ");     
        int num2 = input.nextInt();

        operaciones(num1, num2);
        
        input.close();
    }

    private static void operaciones(int pNum1, int pNum2){
        System.out.printf("%d + %d = %d\n", pNum1,pNum2, (pNum1 + pNum2));
        System.out.printf("%d - %d = %d\n", pNum1,pNum2, (pNum1 - pNum2));
        System.out.printf("%d * %d = %d\n", pNum1,pNum2, (pNum1 * pNum2));
        System.out.printf("%d / %d = %d\n", pNum1,pNum2, (pNum1 / pNum2));
        System.out.println(pNum1 +" % " + pNum2 + " = "+ (pNum1%pNum2));
    }
}
