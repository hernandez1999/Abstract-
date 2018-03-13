package FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {

    private float b;
    private float h;
    float a;
    float p;

    @Override
    float calcularArea() {

        a = (b * h) / 2;
        return a;

    }

    @Override
    float calcularPerimetro() {

        p = 3 * b;
        return p;

    }

    public void setBase(float numero) {
        this.b = numero;
    }

    public void setAltura(float numero) {
        this.h = numero;
    }

}
