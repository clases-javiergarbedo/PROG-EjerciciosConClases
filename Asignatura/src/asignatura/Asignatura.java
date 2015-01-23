package asignatura;

public class Asignatura {
    String nombre;
    int codigo;
    int curso;

    Asignatura(String nombre, String código, String curso)
    {
        this.nombre = nombre;
        this.codigo = Integer.valueOf(código);
        this.curso = Integer.valueOf(curso);
    }

    String getNombre()
    {
        return nombre;
    }

    int getCódigo()
    {
        return codigo;
    }

    int getCurso()
    {
        return curso;
    }
}
