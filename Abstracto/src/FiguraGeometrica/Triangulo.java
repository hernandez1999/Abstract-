package FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {

    private float b;
    private float h;
    float a;
    float p;

    @Override
    float calcularArea() {
        return (b * h) / 2;
    }

    @Override
    float calcularPerimetro() {
        return 3 * b;
    }

    public void setBase(float numero) {
        this.b = numero;
    }

    public void setAltura(float numero) {
        this.h = numero;
    }

}
