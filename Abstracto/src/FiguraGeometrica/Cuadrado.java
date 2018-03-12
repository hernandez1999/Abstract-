
package FiguraGeometrica;

import java.util.Scanner;

public class Cuadrado extends FiguraGeometrica {

    Scanner miEscaner = new Scanner(System.in);

    @Override
    int calcularArea() {
        int b;
        System.out.println("Ingrese lado: ");
        b= miEscaner.nextInt();
        
        int a;
        a= b*b;
        
        System.out.println("El area es:  ");

        return a;
    }

    @Override
    String calcularPerimetro() {
        return "Perimetro del Cuadrado";
    }
}
