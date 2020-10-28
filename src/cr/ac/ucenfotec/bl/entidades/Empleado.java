package cr.ac.ucenfotec.bl.entidades;
import java.util.ArrayList;

public class Empleado {

    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String ID;
    private ArrayList<Computadora> computadoras;

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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<Computadora> getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(ArrayList<Computadora> computadoras) {
        this.computadoras = computadoras;
    }

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, String correo, String ID, ArrayList<Computadora> computadoras) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.ID = ID;
        this.computadoras = computadoras;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", correo='" + correo + '\'' +
                ", ID='" + ID + '\'' +
                ", computadoras=" + computadoras +
                '}';
    }

}
