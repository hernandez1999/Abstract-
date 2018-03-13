package FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {

    private float base;
    private float altura;
    float area;
    float perimetro;

    @Override
    float calcularArea() {

        area = (base * altura) / 2;
        return area;

    }

    @Override
    float calcularPerimetro() {

        perimetro = 3 * base;
        return perimetro;

    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
