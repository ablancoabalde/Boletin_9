
package ejer5.boletin9;
//5- Implementa un programa no que se pida o número de elementos e, visualice a seguinte serie :
//a)  2 + 4 + 6 + 8 + 10 …..
//b)  - 1 + 2 – 3 + 4 – 5 + 6 …..
//c)  0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ………
public class Ejer5Boletin9 {

    public static void main(String[] args) {
        
        ClaseA ca = new ClaseA();
        ClaseB cb = new ClaseB();
        ClaseC cc = new ClaseC();
        System.out.println("Clase A");
        ca.metodCA();
        System.out.println("\n");
        System.out.println("Clase B");
        cb.metodoB();
        System.out.println("\n");
        System.out.println("Clase C");
        cc.metodoC();
        
        
    }
    
}
