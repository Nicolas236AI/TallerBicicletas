package co.edu.uniquindio.poo.model;

public class Tarea {
    private String descripcionTarea;
    private double costoTarea;
    private Orden ownedByOrden;

    public Tarea() {
    }

    public Tarea(String descripcionTarea, double costoTarea,Orden ownedByOrden) {
        this.descripcionTarea = descripcionTarea;
        this.costoTarea = costoTarea;
        this.ownedByOrden=ownedByOrden;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public double getCostoTarea() {
        return costoTarea;
    }

    public void setCostoTarea(double costoTarea) {
        this.costoTarea = costoTarea;
    }

    public Orden getOwnedByOrden() {
        return ownedByOrden;
    }

    public void setOwnedByOrden(Orden ownedByOrden) {
        this.ownedByOrden = ownedByOrden;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcionTarea='" + descripcionTarea + '\'' +
                ", costoTarea=" + costoTarea +
                ", ownedByOrden=" + ownedByOrden +
                '}';
    }
}
