package co.edu.uniquindio.poo.model;


import java.util.ArrayList;
import java.util.List;

public class Taller {

    private String nombreTaller;
    private String direccionTaller;
    private String nitTaller;
    private List<Cliente> listaClientes;
    private List<Mecanico> listaMecanicos;
    private List<Bicicleta> listaBicicletas;
    private List<Repuesto> listaRepuestos;

    public Taller(String nombreTaller, String direccionTaller, String nitTaller) {
        this.nombreTaller = nombreTaller;
        this.direccionTaller = direccionTaller;
        this.nitTaller = nitTaller;

        listaClientes = new ArrayList<>();
        listaMecanicos = new ArrayList<>();
        listaBicicletas = new ArrayList<>();
        listaRepuestos = new ArrayList<>();
    }

    public String crearCliente(String nombre,String tel,String correo,String id){

        for(Cliente c:listaClientes){
            if(c.getIdCliente().equals(id)){
                return "Cliente ya existe";
            }
        }

        Cliente nuevo = new Cliente(nombre,tel,correo,id);
        listaClientes.add(nuevo);

        return "Cliente creado";
    }

    public Cliente buscarCliente(String id){
        for(Cliente c:listaClientes){
            if(c.getIdCliente().equals(id)){
                return c;
            }
        }
        return null;
    }

    public String crearMecanico(String nombre,String id,String nivel,String tel){

        Mecanico nuevo = new Mecanico(nombre,id,nivel,tel);
        listaMecanicos.add(nuevo);

        return "Mecanico registrado";
    }


    public String crearBicicleta(String serial,String marca,String color,String tipo,String idCliente){

        Cliente cliente = buscarCliente(idCliente);

        if(cliente==null){
            return "Cliente no existe";
        }

        Bicicleta bici = new Bicicleta(serial,marca,color,tipo);

        cliente.agregarBicicleta(bici);
        listaBicicletas.add(bici);

        return "Bicicleta registrada";
    }


    public String crearRepuesto(String nombre,int cant,double precio,int id){

        Repuesto r = new Repuesto(nombre,cant,precio,id);
        listaRepuestos.add(r);

        return "Repuesto agregado";
    }

    public List<Mecanico> getListaMecanicos() {
        return listaMecanicos;
    }

    public List<Bicicleta> getListaBicicletas() {
        return listaBicicletas;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Repuesto> getListaRepuestos() {
        return listaRepuestos;
    }

    @Override
    public String toString() {
        return "Taller{" +
                "clientes=" + listaClientes +
                ", mecanicos=" + listaMecanicos +
                ", bicicletas=" + listaBicicletas +
                ", repuestos=" + listaRepuestos +
                '}';
    }
}
