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
//A la topología bus se le  pueden conectar una gran cantidad de computadores al bus,
//si un computador falla, la comunicación sigue, 
////no sucede lo mismo si el bus es el que falla. 
//El tipo de cableado que se usa puede ser coaxial, par trenzado o fibra óptica.
//Un terminador es un dispositivo que absorbe las señales transmitidas en un cable de red. 
//Cada extremo del cable en una red tipo bus debe tener un terminador
//el cual impide que las señales reboten a través de dicho cable y causen interferencia.
//Existen también "tapones". Es decir un pequeño conector que se puede colocar al final físico
//de los extremos del bus y que hacen el efecto de "terminador"
public class Tbus extends Red {

    private String nomnbre;
    String tipocable;
    String tipodispo;
    private int bit;
    private String mensaje;

    public Tbus() {
    }

    public Tbus(int bit, String mensaje) {
        this.bit = bit;
        this.mensaje = mensaje;
    }

    public Tbus(String nomnbre, String tipocable, String tipodispo) {
        this.nomnbre = nomnbre;
        this.tipocable = tipocable;
        this.tipodispo = tipodispo;
    }

    public Tbus(String nomnbre, String tipocable, String tipodispo, String soportet, String controlacesso, int velocidat) {
        super(soportet, controlacesso, velocidat);
        this.nomnbre = nomnbre;
        this.tipocable = tipocable;
        this.tipodispo = tipodispo;
    }

    public Tbus(String nomnbre, String tipocable, String tipodispo, String info, int tañanop) {
        super(info, tañanop);
        this.nomnbre = nomnbre;
        this.tipocable = tipocable;
        this.tipodispo = tipodispo;
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

    public String getTipocable() {
        return tipocable;
    }

    public void setTipocable(String tipocable) {
        this.tipocable = tipocable;
    }

    public String getTipodispo() {
        return tipodispo;
    }

    public void setTipodispo(String tipodispo) {
        this.tipodispo = tipodispo;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    @Override
    public String toString() {
        return "Bus " + "\n"
                + "\t  Nombre = " + nomnbre + "\n"
                + "\t  Tipo de cable = " + tipocable + "\n"
                + "\t  Tipo de dispositivo = "+ tipodispo + "\n"
                + "\t  Soporte de transmisión = " + soportet +"\n"
                + "\t  Control de acceso = " + controlacesso + "\n"
                + "\t  Velocidad de transmisión = " + velocidat;
    }

}
