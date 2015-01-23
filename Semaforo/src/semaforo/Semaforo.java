package semaforo;

public class Semaforo {

    private byte color = ROJO;
    private boolean parpadeando;

    public static final byte ROJO = 2;
    public static final byte AMBAR = 1;
    public static final byte VERDE = 0;

    public byte getColor() {
        return color;
    }

    public boolean isParpadeando() {
        return parpadeando;
    }
    
    public void bajar() {
        if (color > VERDE) {
            color--;
            setParpadeando();
        }
    }

    public void subir() {
        if (color < ROJO) {
            color++;
            setParpadeando();
        }
    }

    private void setParpadeando() {
        if (color == AMBAR) {
            parpadeando = true;
        } else {
            parpadeando = false;
        }
    }

}
