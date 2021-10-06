
package cajaVolumen;


public class Caja {
    
    int ancho;
    int alto;
    int profundo;
    
    public Caja(){
        System.out.println("Ejecutando constructor vacio");
    }
    
    public Caja(int ancho, int alto, int profundo){
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;
    }
    
    public int calcularVolumen(){
        return this.ancho*this.alto*this.profundo;
    }
}
