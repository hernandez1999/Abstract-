
package FiguraGeometrica;

import java.util.Scanner;

public class Rectangulo extends FiguraGeometrica {
    
    Scanner miEscaner = new Scanner(System.in);

    @Override
    int calcularArea() {
        int b;
        System.out.println("Ingrese base: ");
        b= miEscaner.nextInt();
        
        int h;
        System.out.println("Ingrese base: ");
        h= miEscaner.nextInt();
        
        int a;
        a= b*h;
        
        System.out.println("El area es:  ");

        return a;
    }

    @Override
    String calcularPerimetro() {
        return "Perimetro del Rectangulo";
    }
}
