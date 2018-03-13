package FiguraGeometrica;

import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        float entrada;

        Rectangulo miRectangulo = new Rectangulo();
        Triangulo miTriangulo = new Triangulo();
        Cuadrado miCuadrado = new Cuadrado();

        System.out.println("Ingrese la medida de la base");
        entrada = miEscaner.nextFloat();
        miRectangulo.setLado1(entrada);
        System.out.println("Ingrese la medida del lado mas corto del rectangulo");
        entrada = miEscaner.nextFloat();
        miRectangulo.setLado2(entrada);
        System.out.println("El perimetro del rectangulo es");
        System.out.println(miRectangulo.calcularPerimetro());
        System.out.println("El area del rectangulo es");
        System.out.println(miRectangulo.calcularArea());

        System.out.println("Ingrese la medida del lado");
        entrada = miEscaner.nextFloat();
        miCuadrado.setlado(entrada);
        System.out.println("El perimetro del cuadrado es");
        System.out.println(miCuadrado.calcularPerimetro());
        System.out.println("El area del cuadrado es");
        System.out.println(miCuadrado.calcularArea());

        System.out.println("Ingrese la base del triangulo");
        entrada = miEscaner.nextFloat();
        miTriangulo.setBase(entrada);
        System.out.println("Ingrese la altura del triangulo");
        entrada = miEscaner.nextFloat();
        miTriangulo.setAltura(entrada);
        System.out.println("El perimetro del triangulo es");
        System.out.println(miTriangulo.calcularPerimetro());
        System.out.println("El area del triangulo es");
        System.out.println(miTriangulo.calcularArea());

    }
}
