/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5arrays;

/**
 *
 * @author dam
 */
public class Descuento {
    /*
    //Variables
    */
    //Cogemos los limites de cada descuento
    int limite;
    //Cogemos el porcentaje de cada descuento
    private float porcentaje;
    
    /*
    //Constructor
    */
    //Creamos el contructor con los dos porque ya tenemos los 2 datos
    public Descuento(int limite, float porcentaje) {
        this.limite = limite;
        this.porcentaje = porcentaje;
    }

    public int getLimite() {
        return limite;
    }

    public float getPorcentaje() {
        return porcentaje;
    }
}
