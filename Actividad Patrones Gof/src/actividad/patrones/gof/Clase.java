package actividad.patrones.gof;

public class Clase {

    private static Clase log;
    private String value;

    private Clase() {
    }

    public static Clase getInstance() {
        if (log == null) {
            log = new Clase();
        }

        return log;

    }

    public void log(String msg) {
        System.out.println(msg);
    }

    public void setValue(String msg) {
        value = msg;
    }

    public String getValue() {
        return value;
    }
}
