package actividad.patrones.gof;

public class ActividadPatronesGof {

    public static void main(String[] args) {
        Clase Curso = Clase.getInstance();
        Clase Curso_2 = Clase.getInstance();
        Curso.setValue("Fundamentos de diseño");
        System.out.println(Curso_2.getValue());
    }

}
    