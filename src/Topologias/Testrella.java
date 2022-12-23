package Topologias;

import Red.Red;

/**
 *
 * @author marti
 */
//La mayoría de las redes de área local que tienen un conmutador (switch) o un concentrador (hub) siguen esta topología.
//El punto o nodo central en estas sería el switch o el hub, por el que pasan todos los paquetes de usuarios.
public class Testrella extends Red {

    String nombre;
    String nodoCentral; // swicht / hub
    String tiponodocentral;  // si es pasivo , activo , inteligente
    String mensaje;
    private int bit;

    public Testrella(String mensaje, int bit) {
        this.mensaje = mensaje;
        this.bit = bit;
    }

    public Testrella() {
    }

    public Testrella(String nombre, String nodoCentral, String tiponodocentral) {
        this.nombre = nombre;
        this.nodoCentral = nodoCentral;
        this.tiponodocentral = tiponodocentral;
    }

    public Testrella(String nombre, String nodoCentral, String tiponodocentral, String soportet, String controlacesso, int velocidat) {
        super(soportet, controlacesso, velocidat);
        this.nombre = nombre;
        this.nodoCentral = nodoCentral;
        this.tiponodocentral = tiponodocentral;
    }

    public Testrella(String nombre, String nodoCentral, String tiponodocentral, String info, int tañanop) {
        super(info, tañanop);
        this.nombre = nombre;
        this.nodoCentral = nodoCentral;
        this.tiponodocentral = tiponodocentral;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }
    

    public String getNodoCentral() {
        return nodoCentral;
    }

    public void setNodoCentral(String nodoCentral) {
        this.nodoCentral = nodoCentral;
    }

    public String getTiponodocentral() {
        return tiponodocentral;
    }

    public void setTiponodocentral(String tiponodocentral) {
        this.tiponodocentral = tiponodocentral;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estrella " + "\n"
                + "\t  Nombre = " + nombre + "\n"
                + "\t  Nodo central = " + nodoCentral + "\n"
                + "\t  Tipo de nodo = " + tiponodocentral + "\n"
                + "\t  Soporte de transmisión = " + soportet +"\n"
                + "\t  Control de acceso = " + controlacesso + "\n"
                + "\t  Velocidad de transmisión = " + velocidat;
    }

}
