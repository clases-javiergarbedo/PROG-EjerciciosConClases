package carnaval;

public class Principal {

    public static void main(String[] args) {
        AgrupacionCarnaval chirigota1 = new AgrupacionCarnaval("Los Banqueros", 1, "Selu", 10);
        if(chirigota1.isCorrecto()) {
            System.out.println("La inscripcion es correcta");
        } else {
            System.out.println("La inscripcion no es correcta");
        }
        chirigota1.puntuar(85);
        chirigota1.puntuar(5,30,20,15);
        chirigota1.puntuar(5,35,25,15);
        chirigota1.puntuar(7,32,22,16);
        System.out.println(chirigota1.toCadena());
    }
}
