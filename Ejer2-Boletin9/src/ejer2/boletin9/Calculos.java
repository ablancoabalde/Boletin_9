
package ejer2.boletin9;

public class Calculos {
    
    float suma=0;
    double producto=1;
    
    public Calculos(){
        
    }
    
    public String metodoCalcular(){
        
        for(int i=10;i<=90;i++){
            suma+=i;
            producto*=i;
        }
        
        return "Suma= " + suma + " producto " + producto;
    
    
}
}