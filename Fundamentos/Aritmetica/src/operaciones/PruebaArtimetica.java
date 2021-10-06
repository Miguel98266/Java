package operaciones;

public class PruebaArtimetica {

    public static void main(String[] args) {

//       Variables locales
        int a = 10;
        int b = 2;
        miMetodo();

        System.out.println("Constructor vacio");
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 2;
        aritmetica1.b = 3;
        aritmetica1.sumar();
        int c = aritmetica1.sumarConRetorno();
        System.out.println("RESULTADO DESDE LA PRUEBA = " + c);

        int resultadoConArgumentos = aritmetica1.sumaConArgumentos(2, 6);
        System.out.println("Resultado con argumentos = " + resultadoConArgumentos);
        System.out.println("Constructor con argumentos");
        Aritmetica artimetica3 = new Aritmetica(2, 10);
        artimetica3.sumar();

//      aritmetica=null
//      System.gc();
    }

    public static void miMetodo() {
        //La variable a esta fuera del alcance donde fue definida 
        //a=10;
        System.out.println("Otro metodo");
    }
}
