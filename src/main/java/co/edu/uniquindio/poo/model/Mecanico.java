package co.edu.uniquindio.poo.model;

public class Mecanico {

    private String nombreMecanico;
    private String idMecanico;
    private String nivelMecanico;
    private String telefonoMecanico;

    public Mecanico(String nombreMecanico, String idMecanico, String nivelMecanico, String telefonoMecanico) {
        this.nombreMecanico = nombreMecanico;
        this.idMecanico = idMecanico;
        this.nivelMecanico = nivelMecanico;
        this.telefonoMecanico = telefonoMecanico;
    }

    public String getNombreMecanico() {
        return nombreMecanico;
    }

    public String getIdMecanico() {
        return idMecanico;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombreMecanico + '\'' +
                ", id='" + idMecanico + '\'' +
                ", nivel='" + nivelMecanico + '\'' +
                '}';
    }
}

