package FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica {

    private float l;
    float a;
    float p;

    @Override
    float calcularArea() {

        a = l * l;
        return a;

    }

    @Override
    float calcularPerimetro() {

        p = 4 * l;
        return p;

    }

    void setLado(float numero) {
    }

}
