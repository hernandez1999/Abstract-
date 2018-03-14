package FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {

    private float base;
    private float largo;

    @Override
    float calcularArea() {
        return base * largo;
    }

    @Override
    float calcularPerimetro() {
        return 2 * base + 2 * largo;
    }

    void setBase(float numero) {
        this.base = numero;
    }

    void setLargo(float numero) {
        this.largo = numero;
    }
}
