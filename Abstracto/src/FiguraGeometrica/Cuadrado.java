package FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica {

    private float l;

    @Override
    float calcularArea() {
        return l * l;
    }

    @Override
    float calcularPerimetro() {
        return 4 * l;
    }

    void setL(float numero) {
        this.l = numero;
    }
}
