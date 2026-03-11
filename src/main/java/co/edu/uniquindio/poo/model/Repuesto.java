package co.edu.uniquindio.poo.model;

public class Repuesto {

    private String nombreRepuesto;
    private int cantidadDisponible;
    private double precioUnidad;
    private int codigoRepuesto;

    public Repuesto(String nombreRepuesto, int cantidadDisponible, double precioUnidad, int codigoRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
        this.cantidadDisponible = cantidadDisponible;
        this.precioUnidad = precioUnidad;
        this.codigoRepuesto = codigoRepuesto;
    }

    public double calcularCosto(){
        return cantidadDisponible * precioUnidad;
    }

    public int getCodigoRepuesto() {
        return codigoRepuesto;
    }

    @Override
    public String toString() {
        return "Repuesto{" +
                "nombre='" + nombreRepuesto + '\'' +
                ", cantidad=" + cantidadDisponible +
                ", precio=" + precioUnidad +
                ", codigo=" + codigoRepuesto +
                '}';
    }
}


