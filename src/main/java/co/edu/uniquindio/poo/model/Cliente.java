package co.edu.uniquindio.poo.model;


import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombreCliente;
    private String telefonoCliente;
    private String correoCliente;
    private String idCliente;

    private List<Bicicleta> bicicletasCliente;

    public Cliente(String nombreCliente, String telefonoCliente, String correoCliente, String idCliente) {
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
        this.idCliente = idCliente;
        bicicletasCliente = new ArrayList<>();
    }
    public void agregarBicicleta(Bicicleta bici){
        bicicletasCliente.add(bici);
        bici.setDueno(this);
    }


    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public List<Bicicleta> getBicicletasCliente() {
        return bicicletasCliente;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombreCliente + '\'' +
                ", telefono='" + telefonoCliente + '\'' +
                ", correo='" + correoCliente + '\'' +
                ", id='" + idCliente + '\'' +
                '}';
    }

    public boolean verificarNombre(String nombre){
        return nombreCliente.equals(nombre);
    }
}

