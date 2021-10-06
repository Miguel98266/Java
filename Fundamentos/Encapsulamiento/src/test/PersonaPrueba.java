/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Persona;

/**
 *
 * @author Miguel
 */
public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Miguel", 20000, false);
//        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Persona1: " + persona1);
        persona1.setNombre("Angel");
        System.out.println("Persona1: " + persona1);
//        System.out.println("Nombre con cambio: " + persona1.getNombre());
//        System.out.println("Sueldo: "+persona1.getSueldo());
//        System.out.println("Elimnado"+persona1.isEliminado());
    }
}
