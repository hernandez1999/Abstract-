
package FiguraGeometrica;


public class Calculo {

    public static void main(String[] args) {
        
        Cuadrado miCuadrado = new Cuadrado();
        
        System.out.println(miCuadrado.calcularArea());
                
        Rectangulo miRectangulo = new Rectangulo();
        
        System.out.println(miRectangulo.calcularArea());
        
        Triangulo miTriangulo = new Triangulo();
        
        System.out.println(miTriangulo.calcularArea());

    }
}



