package cr.ac.ucenfotec.bl.entidades;

public class Computadora {

    private String marca;
    private String modelo;
    private String numeroSerie;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Computadora() {
    }

    public Computadora(String marca, String modelo, String numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }
}
