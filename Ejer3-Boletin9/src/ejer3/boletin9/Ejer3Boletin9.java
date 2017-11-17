
package ejer3.boletin9;
//3- Implementa un programa que calcule o área dun rectángulo cuxa base e altura pides por teclado . 
//Asegurate que estos valores sexan positivos , para eso valida os datos .

import java.util.Scanner;

public class Ejer3Boletin9 {

    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        Validar validar = new Validar();
        Repetir repetir = new Repetir();
        CalculoArea calc = new CalculoArea();
        
        float base=0,altura=0;
        System.out.println("Introduzaca base");    
        if(validar.metodoValidar(entrada.nextFloat())==true){
          base=entrada.nextFloat();  
        }else{
            System.out.println("Valor menor que 0, vuelva a introducir base");
            
            base=repetir.metodoRepetir(false,"base");
        }
        
        System.out.println("Introduzca altura");
        if(validar.metodoValidar(entrada.nextFloat())==true){
          altura=entrada.nextFloat(); 
        }else{
            System.out.println("Valor menor que 0, vuelva a introducir altura");

            altura=repetir.metodoRepetir(false,"altura");
        }
        
        calc.calcularArea(base, altura);
        
    }
    
}
