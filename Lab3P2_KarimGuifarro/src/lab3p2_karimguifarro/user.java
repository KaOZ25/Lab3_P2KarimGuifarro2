
package lab3p2_karimguifarro;

public class user extends login{
   private String nombre;
   private String apellido;
   private String ID;
   private int cargo;
   private int Salario;

    public user() {
    }

    public user(String nombre, String apellido, String ID, String user, String pass) {
        super(user, pass);
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    public user(String nombre, String apellido, String ID, int cargo, int Salario, String user, String pass) {
        super(user, pass);
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.cargo = cargo;
        this.Salario = Salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "user{" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", cargo=" + cargo + ", Salario=" + Salario + '}';
    }


}
