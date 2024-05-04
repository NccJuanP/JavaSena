public class Circulo extends FiguraGeometrica implements Calculos{
    private float radio;
    private float circunferencia;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }

    @Override
    public void perimetro() {
        System.out.println("el perimetro es: " + 2*(getRadio() * 3.14159));
    }

    @Override
    public void area() {
        System.out.println("El area es: " + 3.1416*(getRadio()*getRadio()));
    }
}
