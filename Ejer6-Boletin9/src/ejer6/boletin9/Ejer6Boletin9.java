
package ejer6.boletin9;
//6- Codifica un programa que  Lea o soldo de cada un dos traballadores dunha empresa e 
//obteña o número deles que ganan entre 1000 e 1750 €, ámbolos dous incluidos e,
//a porcentaje de traballadores que ganan menos de 1000 €.
//Tendo en conta que non se coñece con antelación o 
//numero de traballadores da empresa e non se admiten os soldos negativos.
//( utiliza como condidión de fin un soldo 0 ). 

public class Ejer6Boletin9 {

    public static void main(String[] args) {
        
        Crearpersona p = new Crearpersona();
        Calculos cal= new Calculos();
        
        p.crearPersona();
        System.out.println(cal.devolverValores());   
        
        
    }

}
