
package patronobservador;

import java.util.Observable;
import java.util.Observer;


public class ObservadorDeConsola implements Observer{
    
   
    @Override
    public void update(Observable observable, Object value) { //Referencia al objeto, value contiene el valor que se actualizo
        System.out.println("La nueva tasa del dolar es " + 
                ((TasaDelDolar)observable).getTasaDelDolar());
       
    }
    
}
