/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Miguel
 */
public class Aritmetica {

    int a;
    int b;
    
    //Constructor vacio
    
    public Aritmetica(){
        System.out.println("Ejecutando Constructor");
    }
    //Constructor con parametros
    public Aritmetica(int a , int b){
        this.a=a;
        this.b=b;
    }
    
    //Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
//      int resultado = a + b;
        return this.a + this.b;
    }

    public int sumaConArgumentos(int a, int b) {
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b;
//        return a + b;
        return this.sumarConRetorno();
    }
}
