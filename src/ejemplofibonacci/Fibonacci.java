/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofibonacci;

/**
 *
 * @author Carlos
 */
public class Fibonacci {
    
    public int tamaño;
    public String nombre;
 
    
    public Fibonacci(String nombre, int tamaño){
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    Fibonacci() {
        
    }

    
    public void mostrarSerie(){
        System.out.println(this.nombre+" de tamaño "+this.tamaño+":");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
    }
    
    
    int fibonacci(int n)
    {
        if (n>1){
           return fibonacci(n-1) + fibonacci(n-2); 
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1; 
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
        
}
