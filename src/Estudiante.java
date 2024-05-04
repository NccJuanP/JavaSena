import java.time.LocalDate;
public class Estudiante  extends Persona{
    private String Grado;
    public Estudiante(String nombre, int edad, LocalDate nacimiento, String grado) {
        super(nombre, edad, nacimiento);
        Grado = grado;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String grado) {
        Grado = grado;
    }


}
