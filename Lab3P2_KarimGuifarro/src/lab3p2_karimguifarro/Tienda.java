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
public class Tienda {
    private String nombre;
    private String ubicacion;
    private int cant_emp;
    private int tiempo_espera;
    private ArrayList<Articulos> art=new ArrayList();

    public Tienda(String nombre, String ubicacion, int cant_emp, int tiempo_espera) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cant_emp = cant_emp;
        this.tiempo_espera = tiempo_espera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCant_emp() {
        return cant_emp;
    }

    public void setCant_emp(int cant_emp) {
        this.cant_emp = cant_emp;
    }

    public int getTiempo_espera() {
        return tiempo_espera;
    }

    public void setTiempo_espera(int tiempo_espera) {
        this.tiempo_espera = tiempo_espera;
    }

    public ArrayList<Articulos> getArt() {
        return art;
    }

    public void setArt(ArrayList<Articulos> art) {
        this.art = art;
    }
    
}
