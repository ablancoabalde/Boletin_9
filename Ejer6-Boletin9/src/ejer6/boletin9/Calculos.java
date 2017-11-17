
package ejer6.boletin9;

public class Calculos {
    
      static int cuenta;
      static float cuenta2; 
    
    
    public Calculos(){
        
    }
    
    public void metodoCalcular(float soldo){
     
        
        if(soldo>=1000 && soldo<=1500){
            cuenta+=1;
        }else if(soldo<1000){
            cuenta2+=1;
            
        }else{
            System.out.println("Eres un privilegiado, estás por encima de la media");
        }
        
    }
    
    public String devolverValores(){
        return "Número de trabajadores comprendidos entre 1000 y 1500 " + cuenta + " y porcentaje de menos de 1000 "  + ((cuenta+cuenta2)/100) + " %";
    }
    
}
