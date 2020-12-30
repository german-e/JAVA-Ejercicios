import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> listaAlumnos = new ArrayList<String>();

        String[] alumnos = {"German", "Alberto", "Maria", "Malena", "Carlos", "Fernanda", "Romina", "Leonardo", "Silvia", "Miriam", "Maximo", "Hernan"};


        for (String a : alumnos) {
            listaAlumnos.add(a);
        }
        
        //Separar en cursos
        List<String> grupo1 = listaAlumnos.subList(0, 4);      
        List<String> grupo2 =  listaAlumnos.subList(4, 8);
        List<String> grupo3 =  listaAlumnos.subList(8, listaAlumnos.size());

        System.out.println("\nLista Grupo 1");
        System.out.println("-------------");        
        for (String g1 : grupo1) {            
            System.out.println(grupo1.indexOf(g1) + 1 +" - " + g1  );    
        }

        System.out.println("\nLista Grupo 2");
        System.out.println("-------------");        
        int i = 0;                                  //otra forma de numero de orden
        for (String g2 : grupo2) {
            System.out.println(++i + " - " + g2);   
        }

        System.out.println("\nLista Grupo 3");
        System.out.println("-------------");        
        i = 0;
        for (String g3 : grupo3) {
            System.out.println(++i + " - "+ g3);
        }




    }
}
