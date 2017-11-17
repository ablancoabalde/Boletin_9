
package ejer3.boletin9;

import java.util.Scanner;

public class Repetir {
    
    Validar validar = new Validar();
    Scanner entrada= new Scanner (System.in);
    public Repetir(){
        
    }
    
    public float metodoRepetir(boolean val, String nom){
         
        
        float num = 0;
        while(val==false){
        if(nom=="base"){
        System.out.println("Introduzca base"); 
        num=entrada.nextFloat();
        if(validar.metodoValidar(num)==true){
          break; 

        }else{
            System.out.println("Valor menor que 0, vuelva a introducir base");
         }
        }else{
                   System.out.println("Introduzca altura"); 
        num=entrada.nextFloat();
        if(validar.metodoValidar(num)==true){
          break; 

        }else{
            System.out.println("Valor menor que 0, vuelva a introducir altura");
         }
        }
      
        }
        return num;
    }
    
}
