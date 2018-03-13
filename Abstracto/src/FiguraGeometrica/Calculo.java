package FiguraGeometrica;

import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        float numero;

        Rectangulo miRectangulo = new Rectangulo();
        Triangulo miTriangulo = new Triangulo();
        Cuadrado miCuadrado = new Cuadrado();
        
        System.out.println(".: AREA DEL RECTANGULO :.");
        System.out.println("Ingrese la base");
        try{
        numero = miEscaner.nextFloat();
        miRectangulo.setBase(numero);
        }catch(Exception e){
            System.out.println("Dato invalido");
        }
        
        System.out.println("Ingrese la altura");
        try{
        numero = miEscaner.nextFloat();
        miRectangulo.setLargo(numero);
        }catch(Exception e){
            System.out.println("Dato invalido");
        }
        
        System.out.println("El area del rectangulo es");
        System.out.println(miRectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es");
        System.out.println(miRectangulo.calcularPerimetro());

        
        System.out.println(".: AREA DEL CUADRADO :.");        
        System.out.println("Ingrese el lado");
        try{
        numero = miEscaner.nextFloat();
        miCuadrado.setLado(numero);
        }catch(Exception e){
            System.out.println("Dato invalido");
        }
        
        System.out.println("El area del cuadrado es");
        System.out.println(miCuadrado.calcularArea());
        System.out.println("El perimetro del cuadrado es");
        System.out.println(miCuadrado.calcularPerimetro());

        
        System.out.println(".: AREA DEL TRIANGULO :.");        
        System.out.println("Ingrese base");
        try{
        numero = miEscaner.nextFloat();
        miTriangulo.setBase(numero);
        }catch(Exception e){
            System.out.println("Dato invalido");        }
        System.out.println("Ingrese altura");
        try{
        numero = miEscaner.nextFloat();
        miTriangulo.setAltura(numero);
        }catch(Exception e){
            System.out.println("Dato invalido");
        }
        
        
        System.out.println("El perimetro del triangulo es");
        System.out.println(miTriangulo.calcularArea());
        System.out.println("El area del triangulo es");
        System.out.println(miTriangulo.calcularPerimetro());

    }
}
