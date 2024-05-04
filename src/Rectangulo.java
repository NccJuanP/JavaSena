public class Rectangulo extends FiguraGeometrica implements Calculos{
    private float alto;
    private float largo;

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getLargo() {
        return largo;
    }

    public Rectangulo(String nombre, String color, float alto, float largo) {
        super(nombre, color);
        this.alto = alto;
        this.largo = largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    @Override
    public void perimetro() {
        System.out.println("el perimetro es: " + 2*(getAlto() + getLargo()));
    }

    @Override
    public void area() {
        System.out.println("el area del rectangulo es: " + (getAlto() * getLargo()));
    }
}
