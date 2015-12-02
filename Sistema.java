
package patronobservador;
public class Sistema {

    public static void main(String[] args) {
        
        TasaDelDolar tasaDelDolar = new TasaDelDolar();
        ObservadorDeConsola observadorDeConsola = new ObservadorDeConsola();
        ObservadorGrafico observadorGrafico = new ObservadorGrafico();
        
        tasaDelDolar.addObserver(observadorDeConsola);//Agrega un Nuevo Objeto Observador Metodo
        tasaDelDolar.addObserver(observadorGrafico);
        tasaDelDolar.setTasaDelDolar(34.10);
        tasaDelDolar.notifyObservers();//Procede a identificar todos los observadores
        
    }
    
}
