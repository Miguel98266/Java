
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
//        Empleado empleado1=new Empleado("Miguel", 20000);
//        System.out.println("empleado1 = " + empleado1);
//        
        Cliente cliente1=new Cliente(new Date(), true, "Miguel", 'M', 2000, "Guerrerenses");
        System.out.println("cliente1 = " + cliente1);
        
    }
}
