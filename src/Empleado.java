public class Empleado {
    private float salario;
    private String nombre;

    public Empleado(float salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void CalcularSalario(float extra){
        System.out.println("su salario es: " + getSalario()+ extra);
    }
}
