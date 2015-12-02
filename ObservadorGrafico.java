
package patronobservador;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class ObservadorGrafico implements Observer{

    @Override
    public void update(Observable observable, Object value) {
        JOptionPane.showMessageDialog(null, "Tasa del dolar" , "La nueva tasa del dolar es " +
                ((TasaDelDolar)observable).getTasaDelDolar(), JOptionPane.INFORMATION_MESSAGE);
    }
    
}
