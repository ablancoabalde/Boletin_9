
package ejer3.boletin9;

public class Validar {
    
    public Validar(){
        
    }
    
    public boolean metodoValidar(float num){
        
        boolean verificar=true;

        if(num<0){
        
              verificar=false;
        
        }
        
        return verificar;
    }
    
}
