
package pkg25550423_examen_eva1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int  minutosNa;
        int minutosCi;
        int minutosCa;
        int Suma;
       Scanner captura = new Scanner(System.in);

        System.out.println("CAPTURE EN MINUTOS EL TIEMPO HECHO EN NATACION: ");
        
        minutosNa = captura.nextInt();
        
         System.out.println("CAPTURE EN MINUTOS EL TIEMPO HECHO EN CICLISMO: ");
        
        minutosCi = captura.nextInt();
        

         System.out.println("CAPTURE EN MINUTOS EL TIEMPO HECHO EN CARRERA: ");
        
        minutosCa = captura.nextInt();
        
        
        Suma = minutosNa+minutosCi+minutosCa;
        
        
        if(Suma<120 && minutosCa<=60 && minutosNa<=60 && minutosCi<=60){
            
          System.out.println("CLASIFICACION: EXCELENTE");
            
        }
        else if (Suma<150 || minutosCa<=70 || minutosNa<=70 || minutosCi<=70){
             System.out.println("CLASIFICACION: BUENA");
            
            
        }
        else{
             System.out.println("CLASIFICACION: REGULAR");
            
        }

        

 
        
    }
    
}
