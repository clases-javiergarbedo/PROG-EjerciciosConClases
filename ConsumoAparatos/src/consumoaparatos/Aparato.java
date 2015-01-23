package consumoaparatos;

import javax.swing.JTextField;

public class Aparato {

    private int consumo;
    private String nombre;
    private boolean encendido;
    private static int consumoTotal = 0;

    public Aparato(String nombre, int consumo) {
        this.nombre = nombre;
        this.consumo = consumo;
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        if(isEncendido()!=encendido) {
            this.encendido = encendido;
            if(encendido) {
                consumoTotal += consumo;
            } else {
                consumoTotal -= consumo;
            }
        }        
    }

    public static int getConsumoTotal() {
        return consumoTotal;
    }
        
    public static void mostrarConsumoTotal(JTextField jTextField) {
        jTextField.setText(String.valueOf(Aparato.getConsumoTotal()));        
    }
    
    
}
