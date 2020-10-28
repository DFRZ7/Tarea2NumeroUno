package cr.ac.ucenfotec.bl.logica;

import cr.ac.ucenfotec.bl.entidades.Computadora;
import cr.ac.ucenfotec.bl.entidades.Empleado;

import java.util.ArrayList;

public class Gestor {

    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    ArrayList<Computadora> listaComputadoras = new ArrayList<Computadora>();

    public void crearComputadora(String marca, String modelo, String serie){

        Computadora computadora1 = new Computadora(marca, modelo, serie);
        listaComputadoras.add(computadora1);
    }

    public void crearEmpleado(String nombre, String apellido, String cedula, String correo, String id, ArrayList<Computadora> listaComputadorasVacia){

        Empleado empleado1 = new Empleado(nombre, apellido, cedula, correo, id, listaComputadorasVacia);
        empleados.add(empleado1);
        System.out.println("EMPLEADO: " + empleado1);
    }

}
