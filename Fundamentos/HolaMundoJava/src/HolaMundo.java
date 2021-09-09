//Mi clase en JAVA

public class HolaMundo {

    public static void main(String args[]) {
        //System.out.println("Hola Mundo");

        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificar el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java
        var miVariableEntera2=10;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2="Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
    }
}
