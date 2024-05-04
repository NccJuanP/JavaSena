public class Gerente extends Empleado{
    public Gerente(float salario, String nombre) {
        super(salario, nombre);
    }

    @Override
    public void CalcularSalario(float bono) {
        super.CalcularSalario(bono);
    }
}
