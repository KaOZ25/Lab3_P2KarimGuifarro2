/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_karimguifarro;

import java.util.ArrayList;

/**
 *
 * @author Karim Ozael
 */
public class Restaurante {

    private String ubicacion;
    private String nombre;
    private String RTN;
    private String Slonga;
    private ArrayList<comida> comidad = new ArrayList();

    public Restaurante(String ubicacion, String nombre, String RTN, String Slonga) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.RTN = RTN;
        this.Slonga = Slonga;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getSlonga() {
        return Slonga;
    }

    public void setSlonga(String Slonga) {
        this.Slonga = Slonga;
    }

    public ArrayList<comida> getComidad() {
        return comidad;
    }

    public void setComidad(ArrayList<comida> comidad) {
        this.comidad = comidad;
    }

}
