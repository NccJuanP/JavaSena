import java.time.*;
public class Main {
    public static void main(String[] args) {
        Persona juan = new Persona("Juan", 21, LocalDate.of(2002, 12, 10));
        System.out.println(juan.calcularEdad());
        juan.realizarTarea();
    }
}