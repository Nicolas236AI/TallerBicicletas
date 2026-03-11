package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Taller;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        Taller taller = new Taller("Taller Central","Centro","12345");

        int opcion=0;

        while(opcion!=6){

            opcion=Integer.parseInt(JOptionPane.showInputDialog(

                    "=== MENU TALLER ===\n"+
                            "1 Crear Cliente\n"+
                            "2 Crear Mecanico\n"+
                            "3 Crear Bicicleta\n"+
                            "4 Crear Repuesto\n"+
                            "5 Ver Estado Taller\n"+
                            "6 Salir"
            ));

            switch(opcion){

                case 1:

                    String nombre=JOptionPane.showInputDialog("Nombre");
                    String tel=JOptionPane.showInputDialog("Telefono");
                    String correo=JOptionPane.showInputDialog("Correo");
                    String id=JOptionPane.showInputDialog("Cedula");

                    JOptionPane.showMessageDialog(null,
                            taller.crearCliente(nombre,tel,correo,id));
                    break;

                case 2:

                    String nomM=JOptionPane.showInputDialog("Nombre mecanico");
                    String idM=JOptionPane.showInputDialog("Cedula mecanico");
                    String nivel=JOptionPane.showInputDialog("Nivel");
                    String telM=JOptionPane.showInputDialog("Telefono");

                    JOptionPane.showMessageDialog(null,
                            taller.crearMecanico(nomM,idM,nivel,telM));
                    break;

                case 3:

                    String serial=JOptionPane.showInputDialog("Serial bici");
                    String marca=JOptionPane.showInputDialog("Marca");
                    String color=JOptionPane.showInputDialog("Color");
                    String tipo=JOptionPane.showInputDialog("Tipo");
                    String cedula=JOptionPane.showInputDialog("Cedula cliente");

                    JOptionPane.showMessageDialog(null,
                            taller.crearBicicleta(serial,marca,color,tipo,cedula));
                    break;

                case 4:

                    String nombreR=JOptionPane.showInputDialog("Nombre repuesto");
                    int cant=Integer.parseInt(JOptionPane.showInputDialog("Cantidad"));
                    double precio=Double.parseDouble(JOptionPane.showInputDialog("Precio"));
                    int idR=Integer.parseInt(JOptionPane.showInputDialog("ID"));

                    JOptionPane.showMessageDialog(null,
                            taller.crearRepuesto(nombreR,cant,precio,idR));
                    break;

                case 5:

                    JOptionPane.showMessageDialog(null,taller.toString());
                    break;
            }
        }
    }
}