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
public class comida {
    private String id;
    private String nombre;
    private int precio;
    private int cant_acom;
    private ArrayList<acompañamiento> acom=new ArrayList();

    public comida(String id, String nombre, int precio, int cant_acom) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cant_acom = cant_acom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCant_acom() {
        return cant_acom;
    }

    public void setCant_acom(int cant_acom) {
        this.cant_acom = cant_acom;
    }

    public ArrayList<acompañamiento> getAcom() {
        return acom;
    }

    public void setAcom(ArrayList<acompañamiento> acom) {
        this.acom = acom;
    }

   
    
}
    