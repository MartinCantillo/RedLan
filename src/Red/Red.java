package Red;

public class Red {

    public String soportet;
    public String controlacesso;
    public int velocidat;
    public String info;
    public int tañanop;

    public Red() {
    }

    public Red(String soportet, String controlacesso, int velocidat) {
        this.soportet = soportet;
        this.controlacesso = controlacesso;
        this.velocidat = velocidat;
    }

    public Red(String info, int tañanop) {
        this.info = info;
        this.tañanop = tañanop;
    }

    public String getSoportet() {
        return soportet;
    }

    public void setSoportet(String soportet) {
        this.soportet = soportet;
    }

    public String getControlacesso() {
        return controlacesso;
    }

    public void setControlacesso(String controlacesso) {
        this.controlacesso = controlacesso;
    }

    public int getVelocidat() {
        return velocidat;
    }

    public void setVelocidat(int velocidat) {
        this.velocidat = velocidat;
    }

    @Override
    public String toString() {
        return "Red " +  "\n"
                + "soporte transmisión = " + soportet + "\n"
                + "Controlacesso=" + controlacesso + "\n"
                + "Velocidad de transmisión = " + velocidat + "\n"
                + "ta\u00f1anop=" + tañanop;
    }

}
