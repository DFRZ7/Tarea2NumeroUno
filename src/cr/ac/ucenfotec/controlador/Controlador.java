package cr.ac.ucenfotec.controlador;
import cr.ac.ucenfotec.bl.entidades.Computadora;
import cr.ac.ucenfotec.bl.entidades.Empleado;
import cr.ac.ucenfotec.bl.logica.*;

import java.util.ArrayList;

public class Controlador {

    public void ejecutarPrograma() {

        ArrayList<Computadora> listaComputadorasVacia = new ArrayList<Computadora>();
        Computadora computadoraTest = new Computadora("NA", "NA", "NA");
        listaComputadorasVacia.add(computadoraTest);

        Gestor gestorEmpleado = new Gestor();
        gestorEmpleado.crearEmpleado("David", "Florez", "8-0129-0414", "daflorez@apple.com", "77143", listaComputadorasVacia);

        Gestor gestorComputadora = new Gestor();
        gestorComputadora.crearComputadora("Apple","MacBookPro","56ZRCR8");

    }
}
