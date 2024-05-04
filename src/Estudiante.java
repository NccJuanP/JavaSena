import java.time.LocalDate;
public class Estudiante  extends Persona implements Trabajador{
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

    @Override
    public void realizarTarea() {
        System.out.println("Realizando tarea escolar");
    }
}
