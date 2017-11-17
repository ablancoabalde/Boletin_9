
package ejer5.boletin9;
//b)  - 1 + 2 – 3 + 4 – 5 + 6 …..
public class ClaseB {

    public ClaseB() {
    }
    
    public void metodoB(){
        boolean simbolo=true;
        int num=0;
        for(int i=0;i<=20;i++){
            if(i%2!=0){
               if(simbolo==true){
                num-=i;        
                System.out.println(num);
                simbolo=false;
            }else{
                num+=i;
                System.out.println(num);
                simbolo=true;
               }
            }
        
            
            
        }
        
        
    }
}
