
package ejer1.boletin9;
//1.Calcula a cantidade de números negativos, positivos e, ceros  que hai nun grupo de 10 numeros . 

import java.util.Scanner;

public class Ejer1Boletin9 {

    public static void main(String[] args) {
        
        int num;
        Scanner entrada = new Scanner (System.in);
        Contador func = new Contador();
        for(int i=0;i<10;i++ ){
            System.out.println("Introduzaca número");
            num=  entrada.nextInt();
            func.metodoContar(num);
        }
        System.out.println(func.metodoDevolver());
        
    }
    
}
