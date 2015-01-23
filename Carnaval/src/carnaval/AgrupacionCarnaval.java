package carnaval;

public class AgrupacionCarnaval {
    String nombre = "";
    int categoria = 0;
    String autorLetra = "";
    String autorMusica = "";
    int numComponentes = 0;
    int puntuacion = 0;
    
    final int CHIRIGOTA = 1;
    final int COMPARSA = 2;
    final int CORO = 3;
    final int CUARTETO = 4;
    
    AgrupacionCarnaval(String nombre, int categoria, 
            String autorLetra, String autorMusica, 
            int componentes) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.autorLetra = autorLetra;
        this.autorMusica = autorMusica;
        this.numComponentes = componentes;
    }

    AgrupacionCarnaval(String nombre, int categoria, 
            String autorLetraYMusica, int componentes) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.autorLetra = autorLetraYMusica;
        this.autorMusica = autorLetraYMusica;
        this.numComponentes = componentes;
    }
    
    boolean isCorrecto() {
        if(nombre.isEmpty())
            return false;
        if(categoria<CHIRIGOTA || categoria>CUARTETO)
            return false;
        switch(categoria) {
            case CHIRIGOTA:
                if(numComponentes<7 || numComponentes>12)
                    return false;
                break;
            case COMPARSA:
                if(numComponentes<10 || numComponentes>15)
                    return false;
                break;
            case CORO:
                if(numComponentes<16 || numComponentes>45)
                    return false;
                break;
            case CUARTETO:
                if(numComponentes<3 || numComponentes>5)
                    return false;
                break;
        }
        return true;
    }
    
    boolean puntuar(int puntuacion) {
        if(puntuacion>=0 && puntuacion<=100) {
            this.puntuacion+=puntuacion;
            return true;
        } else {
            return false;
        }
    }
    
    boolean puntuar(int presentacion, int pasodobles, int cuples, int popurri) {
        if(presentacion<0 || presentacion>10)
            return false;
        if(pasodobles<0 || pasodobles>40)
            return false;
        if(cuples<0 || cuples>30)
            return false;
        if(popurri<0 || popurri>20)
            return false;
        this.puntuacion+=presentacion+pasodobles+cuples+popurri;
        return true;
    }
    
    int getPuntuacion() {
        return this.puntuacion;
    }
    
    String toCadena() {
        String retorno = "";
        retorno += "Nombre: " + this.nombre + "\n";
        retorno += "Categoría: ";
        switch(categoria) {
            case CHIRIGOTA:
                retorno += "CHIRIGOTA";
                break;
            case COMPARSA:
                retorno += "COMPARSA";
                break;
            case CORO:
                retorno += "CORO";
                break;
            case CUARTETO:
                retorno += "CUARTETO";
                break;
        }
        retorno += "\nPuntuación: " + this.puntuacion + "\n";
        return retorno;
    }
}
