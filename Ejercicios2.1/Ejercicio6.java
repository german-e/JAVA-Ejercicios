

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Ejercicio6 {
    

    public static void main(String[] args) {
        
   
        Empleado e1 = new Empleado();
        e1.setApellido("Espindola");
        e1.setNombre("German Leonel");
        e1.setDni(27155087);
        e1.setHsTrabajadas(32);
        e1.setValorHs(751.25);
        
        Set<Empleado> empleados = new HashSet<>();

       


        empleados.add(e1);
        empleados.add(new Empleado("Cepeda","Romina Cepeda",30056819, 21, 2541.51));
        empleados.add(new Empleado("Perez", "Juan", 42159829, 25, 741.21));
        empleados.add(new Empleado("Rodriguez", "Roberto Carlos", 25147652,43,652.14));


        Map<Integer, Double> sueldos = new HashMap<Integer, Double>();

        for (Empleado e : empleados) {
            sueldos.put(e.getDni(), e.getValorHs() * e.getHsTrabajadas() );

        }
        System.out.println("\n----------------------------------sueldos--------------------------------");
        System.out.println(sueldos);

        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese DNI ");
        int dni = scn.nextInt();

        scn.close();

        System.out.println("Sueldo es: "+ sueldos.get(dni));
        

    }

    
}



class Empleado {

    private String apellido;
    private String nombre;
    private int dni;
    private int hsTrabajadas;
    private double valorHs;

    
    


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getHsTrabajadas() {
        return hsTrabajadas;
    }

    public void setHsTrabajadas(int hsTrabajadas) {
        this.hsTrabajadas = hsTrabajadas;
    }

    public double getValorHs() {
        return valorHs;
    }

    public void setValorHs(double valorHs) {
        this.valorHs = valorHs;
    }
    public Empleado() {}
    
    public Empleado(String apellido, String nombre, int dni, int hsTrabajadas, double valorHs) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.hsTrabajadas = hsTrabajadas;
        this.valorHs = valorHs;
    }

}