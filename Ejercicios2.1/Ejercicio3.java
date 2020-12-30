import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {


    public static void main(String[] args) {
        
       ArrayList<Integer> barajas = new ArrayList<Integer>();
        
        for (int i=1; i<=12; i++){
            barajas.add(i);

        }
        System.out.println("**************************************");
        System.out.println("--------- LISTA EN ORDEM ------------");
        barajas.forEach(e->System.out.println(e));

        System.out.println("**************************************");
        System.out.println("--------- EN ORDEM INVERSO -----------");
        barajas.sort(Collections.reverseOrder()); ;
        barajas.forEach(e->System.out.println(e));

        System.out.println("**************************************");
        System.out.println("--------- ¡¡Mezcaldo!! ------------");
        Collections.shuffle(barajas, new Random());


        //Otra forma de imprimir
        for (Integer l : barajas) {
            System.out.println(l);
        }
        


    }
}


