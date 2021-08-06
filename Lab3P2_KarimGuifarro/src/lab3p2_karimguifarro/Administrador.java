
package lab3p2_karimguifarro;


public class Administrador extends user{
    private int exp;

    public Administrador(int exp, String user, String password, String nombre, String apellido, String ID, int cargo, int Salario) {
        super(user, password, nombre, apellido, ID, cargo, Salario);
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Administrador{" + super.toString() +"exp=" + exp + '}';
    }
    
}
