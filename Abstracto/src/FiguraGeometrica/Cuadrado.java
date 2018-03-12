
package FiguraGeometrica;

import java.util.Scanner;

public class Cuadrado extends FiguraGeometrica {

    Scanner miEscaner = new Scanner(System.in);

    @Override
    int calcularArea() {
        System.out.println(".: AREA CUADRADO :. ");
        try{
        int b;
        System.out.println("Ingrese lado: ");
        b= miEscaner.nextInt();     
        int a;
        a= b*b;
        
        System.out.println("El area es:  "+a);

        }catch(Exception e){
            System.out.println("Dato no valido");     
        }
        return 0;
    }

    @Override
    String calcularPerimetro() {
        return "Perimetro del Cuadrado";
    }
}
