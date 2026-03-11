package co.edu.uniquindio.poo.model;


public class Bicicleta {

    private String serialBici;
    private String marcaBici;
    private String colorBici;
    private String tipoBici;

    private Cliente dueno;

    public Bicicleta(String serialBici, String marcaBici, String colorBici, String tipoBici) {
        this.serialBici = serialBici;
        this.marcaBici = marcaBici;
        this.colorBici = colorBici;
        this.tipoBici = tipoBici;
    }

    public String getSerialBici() {
        return serialBici;
    }

    public String getMarcaBici() {
        return marcaBici;
    }

    public String getColorBici() {
        return colorBici;
    }

    public String getTipoBici() {
        return tipoBici;
    }

    public Cliente getDueno() {
        return dueno;
    }

    public void setDueno(Cliente dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "serial='" + serialBici + '\'' +
                ", marca='" + marcaBici + '\'' +
                ", color='" + colorBici + '\'' +
                ", tipo='" + tipoBici + '\'' +
                '}';
    }

    public boolean verificarSerial(String inicio){
        return serialBici.startsWith(inicio);
    }
}

