/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofibonacci;

/**
 *
 * @author Carlos
 */
public class EjemploFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fibonacci f1 = new Fibonacci("fibonacci 1",10); 
        f1.mostrarSerie();
        
        Fibonacci f2 = new Fibonacci();
        f2.setNombre("fibonacci 2");
        f2.setTamaño(10);
        f2.mostrarSerie();
        
    }
}
