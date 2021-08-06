
package lab3p2_karimguifarro;

public class user {
   private String user;
   private String password;
   private String nombre;
   private String apellido;
   private String ID;
   private int cargo;
   private int Salario;

    public user() {
    }

    public user(String user, String password, String nombre, String apellido, String ID) {
        this.user = user;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    public user(String user, String password, String nombre, String apellido, String ID, int cargo, int Salario) {
        this.user = user;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.cargo = cargo;
        this.Salario = Salario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "user{" + "user=" + user + ", password=" + password + ", nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", cargo=" + cargo + ", Salario=" + Salario + '}';
    }


}
