package lab3p2_karimguifarro;

import java.util.logging.Logger;


public class Motoristas extends user{
    private int comisiones;
    private String transporte;
    private int capacidad;

    public Motoristas() {
    }

    public Motoristas(int comisiones, String transporte, int capacidad, String nombre, String apellido, String ID, int cargo, int Salario, String user, String pass) {
        super(nombre, apellido, ID, cargo, Salario, user, pass);
        this.comisiones = comisiones;
        this.transporte = transporte;
        this.capacidad = capacidad;
    }

    public int getComisiones() {
        return comisiones;
    }

    public void setComisiones(int comisiones) {
        this.comisiones = comisiones;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Motoristas{" + "comisiones=" + comisiones + ", transporte=" + transporte + ", capacidad=" + capacidad + '}';
    }
    
}
