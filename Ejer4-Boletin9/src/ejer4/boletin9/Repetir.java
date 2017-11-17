
package ejer4.boletin9;

import java.util.Scanner;

public class Repetir {
    Scanner entrada = new Scanner (System.in);
    TablaMultiplicar tm = new TablaMultiplicar(); 
    
    public Repetir(){
        
    }    
    
    public void devuelveNum(){
        
        System.out.println("Introduzca número");
        int num=entrada.nextInt();
        while(num>0){     
            
            tm.multiplicar(num);
            System.out.println("Introduzca número");
            num=entrada.nextInt();
        
        }
        System.out.println("Adios");
       
        
        
    }

 
    
}
