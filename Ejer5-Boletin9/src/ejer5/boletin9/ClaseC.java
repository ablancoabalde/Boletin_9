
package ejer5.boletin9;
//c)  0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ………
public class ClaseC {

    public ClaseC() {
    }
    
    public void metodoC(){
        
        int num1=0,num2=1,num3;
        
        
        for(int i=0;i<=20;i++){
            if(i==0){
                System.out.println(num1);
                System.out.println(num2);
            
            }else{
                num3=num1+num2;
                num1=num2;
                num2=num3;
                
                System.out.println(num3);
            }
           
            
        }
        
        
    }
    
}
