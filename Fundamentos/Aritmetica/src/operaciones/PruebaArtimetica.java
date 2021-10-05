package operaciones;

public class PruebaArtimetica {

    public static void main(String[] args) {
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
    }
}
