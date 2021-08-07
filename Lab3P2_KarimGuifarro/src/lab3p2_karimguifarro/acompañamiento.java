/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class acompañamiento {
    private String nombre;
    private String tipo;
    private int precio_ex;

    public acompañamiento(String nombre, String tipo, int precio_ex) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio_ex = precio_ex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio_ex() {
        return precio_ex;
    }

    public void setPrecio_ex(int precio_ex) {
        this.precio_ex = precio_ex;
    }
    
}
