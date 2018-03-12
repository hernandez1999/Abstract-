
package FiguraGeometrica;

import java.util.Scanner;

public class Triangulo extends FiguraGeometrica {
    Scanner miEscaner = new Scanner(System.in);

    @Override
    int calcularArea() {
        System.out.println(".: AREA TRIANGULO :. ");
        try{
        int b;
        System.out.println("Ingrese base: ");
        b= miEscaner.nextInt();
        
        int h;
        System.out.println("Ingrese altura ");
        h= miEscaner.nextInt();
        
        int a;
        a= (b*h)/2;
        
        System.out.println("El area es:  "+a);
        }catch(Exception e){
            System.out.println("Dato no valido ");
        }
        return 0;
    }

    @Override
    String calcularPerimetro() {
       return "Perimetro del Triangulo";  
    }
}
