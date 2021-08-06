
package lab3p2_karimguifarro;


public class Programadores extends user{
    private String lenguaje;
    private String horario;

    public Programadores(String lenguaje, String horario, String user, String password, String nombre, String apellido, String ID, int cargo, int Salario) {
        super(user, password, nombre, apellido, ID, cargo, Salario);
        this.lenguaje = lenguaje;
        this.horario = horario;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Programadores{" + "lenguaje=" + lenguaje + ", horario=" + horario + '}';
    }
    
}
