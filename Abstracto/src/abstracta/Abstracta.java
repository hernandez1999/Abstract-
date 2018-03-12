
package abstracta;


public class Abstracta {

    public static void main(String[] args) {
        
        Perro miPerro = new Perro();
        
        System.out.println(miPerro.emitirSonido());
        
        Gato miGato = new Gato();
        
        System.out.println(miGato.emitirSonido());
    }
}
