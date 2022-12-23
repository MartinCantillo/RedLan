/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topologias;

import Red.Red;

/**
 *
 * @author marti
 */
//
public class Anillo extends Red {

    String nombre;
    int bit;
    String mensaje = "";

    public Anillo() {
    }

    public Anillo(String nombre, int bit) {
        this.nombre = nombre;
        this.bit = bit;
    }

    public Anillo(String nombre, String soportet, String controlacesso, int velocidat) {
        super(soportet, controlacesso, velocidat);
        this.nombre = nombre;
    }

    public Anillo(String nombre, String info, int tañanop) {
        super(info, tañanop);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Anillo " + "\n"
                + "\t  Nombre=" + nombre + "\n"
                + "\t  Soporte de transmisión = " + soportet +"\n"
                + "\t  Control de acceso = " + controlacesso + "\n"
                + "\t  Velocidad de transmisión = " + velocidat;
    }

}
