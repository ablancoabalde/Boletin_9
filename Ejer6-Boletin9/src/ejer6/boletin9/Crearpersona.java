
package ejer6.boletin9;

import java.util.Scanner;

public class Crearpersona {
    
    Scanner entrada= new Scanner (System.in);
    Persona per= new Persona();
    Calculos cal= new Calculos();

    float soldo;
    
    public Crearpersona(){
        
    }
    
    
    public void crearPersona(){
        
        System.out.println("Intoduzca soldo del trabajador");
        soldo=entrada.nextFloat();
        while(soldo>0){
            per.setSoldo(soldo);
            cal.metodoCalcular(soldo);
            System.out.println("Intoduzca soldo del trabajador");
            soldo=entrada.nextFloat();
        }
        
        
        
        
        
    }
    
    
}
