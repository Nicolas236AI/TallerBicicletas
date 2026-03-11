package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Orden {
    private String descripcionProblema;
    private LocalDate ingreso;
    private String estado;
    private List<Tarea> listaTareas;
    private List<Repuesto> listaRepuestos;
    private EstadoOrden estadoOrden;
    private Cliente clienteOrden;



    public Orden() {
    }

    public Orden(String descripcionProblema, LocalDate ingreso, String estado) {
        this.descripcionProblema = descripcionProblema;
        this.ingreso = ingreso;
        this.estado = estado;
        this.listaTareas = new ArrayList<>();
        this.listaRepuestos = new ArrayList<>();
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public List<Repuesto> getListaRepuestos() {
        return listaRepuestos;
    }

    public void setListaRepuestos(List<Repuesto> listaRepuestos) {
        this.listaRepuestos = listaRepuestos;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "descripcionProblema='" + descripcionProblema + '\'' +
                ", ingreso=" + ingreso +
                ", estado='" + estado + '\'' +
                ", listaTareas=" + listaTareas +
                ", listaRepuestos=" + listaRepuestos +
                '}';
    }
}
