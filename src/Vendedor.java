public class Vendedor extends Empleado{
    public Vendedor(float salario, String nombre) {
        super(salario, nombre);
    }

    @Override
    public void CalcularSalario(float comision) {
        super.CalcularSalario(comision);
    }
}
