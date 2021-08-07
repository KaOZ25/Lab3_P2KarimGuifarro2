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
public class Cliente extends user{
private int cant_ped;

    public Cliente(String user, String pass,String nombre, String apellido, String ID,int cant_ped) {
        super(nombre, apellido, ID, user, pass);
        this.cant_ped = cant_ped;
    }

    public int getCant_ped() {
        return cant_ped;
    }

    public void setCant_ped(int cant_ped) {
        this.cant_ped = cant_ped;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() + "cant_ped=" + cant_ped + '}';
    }
    
}
