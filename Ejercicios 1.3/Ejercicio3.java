import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    

    System.out.print("Ingresá un numero: ");     
    int numero = input.nextInt();

    String mostrar = "";

    for(int i = 1; i <= numero; i++) {
        mostrar = mostrar + String.valueOf(i);         
        System.out.println(mostrar);
    }

    input.close();
    }
}
