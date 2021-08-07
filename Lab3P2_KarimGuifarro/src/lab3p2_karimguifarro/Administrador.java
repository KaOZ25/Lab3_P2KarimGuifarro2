
package lab3p2_karimguifarro;


public class Administrador extends user{
    private int exp;

    public Administrador(String user, String pass,String nombre, String apellido, String ID, int cargo, int Salario,int exp) {
        super(nombre, apellido, ID, cargo, Salario, user, pass);
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
