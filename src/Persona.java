import java.time.LocalDate;
public class Persona {
    private String Nombre;
    private int Edad;
    private LocalDate Nacimiento;

    public Persona(String nombre, int edad, LocalDate nacimiento) {
        Nombre = nombre;
        Edad = edad;
        Nacimiento = nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null){
            Nombre = nombre;
        }else{
            System.out.println("Debe digitar un nombre");
        }
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        if(edad <= 0) {
            Edad = edad;
        }
        else{
            System.out.println("La edad ingresada es invalida");
        }
    }

    public LocalDate getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        if (nacimiento.getYear() < LocalDate.now().getYear()){
            Nacimiento = nacimiento;
        }else{
            System.out.println("Digite una fecha valida");
        }
    }

    public String calcularEdad(){
        int anio = LocalDate.now().getYear() - getEdad();
        setNacimiento(LocalDate.of(anio, getNacimiento().getMonth(), getNacimiento().getDayOfMonth()));
        if(getNacimiento().getMonthValue() > LocalDate.now().getMonthValue()){
            anio = anio - 1;
        }
        setNacimiento(LocalDate.of(anio,getNacimiento().getMonth(), getNacimiento().getDayOfMonth()));
        return "Su fecha de nacimiento es aproximadamente " + getNacimiento();
    }
}
