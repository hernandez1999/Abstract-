package FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {

    private float base;
    private float largo;
    float a;
    float p;

    @Override
    float calcularArea() {

        a = base * largo;
        return a;

    }

    @Override
    float calcularPerimetro() {

        p = 2 * base + 2 * largo;
        return p;
    }

    void setBase(float numero) {
        this.base = numero;
    }

    void setLargo(float numero) {
        this.largo = numero;
    }
}
