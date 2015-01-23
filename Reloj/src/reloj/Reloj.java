package reloj;

public class Reloj {
    int horas;
    int minutos;
    int segundos;

    Reloj() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    Reloj(int horas, int minutos, int segundos) {
        if(horas>23 || horas<0)
            this.horas = 0;
        else
            this.horas = horas;

        if(minutos>59 || minutos<0)
            this.minutos = 0;
        else
            this.minutos = minutos;

        if(segundos>59 || segundos<0)
            this.segundos = 0;
        else
            this.segundos = segundos;
    }

    void setHora(int horas, int minutos, int segundos) {
        if(horas<0 || horas>23)
            this.horas = 0;
        else
            this.horas = horas;

        if(minutos<0 || minutos>59)
            this.minutos = 0;
        else
            this.minutos = minutos;

        if(segundos<0 || segundos>59)
            this.segundos = 0;
        else
            this.segundos = segundos;
    }

    void setHora(int horas, int minutos) {
        if(horas<0 || horas>23)
            this.horas = 0;
        else
            this.horas = horas;

        if(minutos<0 || minutos>59)
            this.minutos = 0;
        else
            this.minutos = minutos;

        this.segundos = 0;
    }

    void setHora(int horas, int minutos, int segundos, boolean pm) {
        if(pm) {
            if(horas<0 || horas>12)
                this.horas = 0;
            else
                if(horas==12)
                    this.horas = horas;
                else
                    this.horas = horas+12;
        } else {
            if(horas<0 || horas>11)
                this.horas = 0;
            else
                this.horas = horas;
        }

        if(minutos<0 || minutos>59)
            this.minutos = 0;
        else
            this.minutos = minutos;

        if(segundos<0 || segundos>59)
            this.segundos = 0;
        else
            this.segundos = segundos;
    }

    String getHora(boolean formato12H) {
        if(formato12H) {
            if(horas>12)
                return ((horas-12) + ":" + minutos +":" + segundos + "pm");
            else
                if(horas==12)
                    return (horas + ":" + minutos +":" + segundos + "pm");
                else
                    return (horas + ":" + minutos +":" + segundos + "am");
        } else {
            return (horas + ":" + minutos +":" + segundos);
        }
    }

}
