
package pasoporreferencia;

import clases.Persona;


public class PasoPorReferencia {
    public static void main(String[] args) {
        
        Persona persona1=new Persona();
        persona1.nombre="Miguel";
        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1=cambiarValor(persona1);
        System.out.println("persona1 cambio de nombre = " + persona1.nombre);
        //persona1.desplegarInformacion();
    }
    
    public static Persona cambiarValor(Persona persona){
        if (persona==null){
            System.out.println("Valor de persona invalido:null");
            return persona;
        }
        persona.nombre="Angel";
        return persona;
    }
}
