
package FiguraGeometrica;


public class Rectangulo extends FiguraGeometrica {

    private float lado1;
    private float lado2;
    float area;
    float perimetro;

    @Override
    float calcularArea() {

        area = lado1*lado2;
        return area;

    }

    @Override
    float calcularPerimetro() {

        perimetro = 2 * lado1 + 2 * lado2;
        return perimetro;
    }

    void setLado1(float entrada) {
        this.lado1=entrada;
    }

    void setLado2(float entrada) {
        this.lado2=entrada;
    }
}
