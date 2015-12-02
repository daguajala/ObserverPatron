
package patronobservador;

import java.util.Observable;


public class TasaDelDolar extends Observable{
    public double tasaDelDolar;

    public double getTasaDelDolar() {
        return tasaDelDolar;
    }

    public void setTasaDelDolar(double tasaDelDolar) {
        this.tasaDelDolar = tasaDelDolar;
        setChanged();//Solamente puede ser accesado desde clases que sean Hijas de la clase que contiene este metodo
    }
    
    
}
