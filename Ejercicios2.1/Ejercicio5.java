import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {

        int[] hsTrabajadas = {12, 30, 16, 22, 9};
        double[] hsValor = {215.25,258.87,200.5,118.22,158.98};

        List<Integer> hsT = new ArrayList<Integer>();
        List<Double> hsV = new ArrayList<Double>();
        List<Double> calculo = new ArrayList<Double>();

        for (Integer h : hsTrabajadas) {
            hsT.add(h);               
        }

        for (double h : hsValor) {
            hsV.add(h);               
        }             

                
        for (int i = 0; i < hsValor.length; i++) {
            calculo.add(hsT.get(i) * hsV.get(i) );
        }

        //imprimo la lista con los calculos
        System.out.println("=========================================================================================");
        System.out.println(calculo);
        double total = 0;
        for (Double d : calculo) {
            
            total += d;
            
        }
        
        System.out.printf("El total final: $ %.2f", total);   //el formato %.2f formatea el valor a dos digitos decimales.




        
    }
}
