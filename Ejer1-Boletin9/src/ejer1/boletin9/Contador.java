
package ejer1.boletin9;

public class Contador {
    
    int positivos, negativos,ceros;
    
    public Contador(){
        
    }
    
    public void metodoContar(int num){
        
        if(num>0){
            positivos++;
            
        }else if(num<0){
            negativos++;
        }else{
            ceros++;
        }
        
        
    }
   
    public String metodoDevolver(){
        
        return "num positivos " + positivos + " num negativos " + negativos + " ceros " + ceros;
    }
}
