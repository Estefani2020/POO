
package modulo_2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Recursos 
{
    //Atributos
   public String mensaje;
   public int nota;
   public int valor1;
   public int valor2;
   public int valor;
   
   
    //Instancia
    public Recursos()
    {
       mensaje = "Estoy aprendiendo, pero seré el mejor programador del mundo";
       nota = 85;
       valor1 = 10;
       valor2 = 2;
       valor=0;
    }
    
     //Metodo para imprimir el nombre del empleado.
     public void Mensaje ()
     {
         System.out.println("Metodo 1");
         System.out.println(mensaje + "\n");
     }
     
     //Metodo para imprimir el nombre del empleado.
     public void Nota ()
     {
         if(nota<70)
         {
             System.out.println("Metodo 2");
             System.out.println("Reprobado\n");
         }
         else
         {
             System.out.println("Metodo 2");
             System.out.println("Aprobado\n");
         }
         
     }
     
     public void Division()
     {
         if(valor1 != 0)
         {
             //Procedimiento
             int resultado=0;
             resultado =valor1/valor2;
             System.out.println("Metodo 3");
             System.out.println("Resultado: " + resultado +" \n");
         }
         else
         {
             System.out.println("Metodo 3");
             System.out.println("No es posible realizar la division");
         }
     }
     
     public void Lista()
     {
        System.out.println("Metodo 4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Numeros del 1 al: ");
        valor = sc.nextInt();
        
        int contador =0;
        do
        {  
            
           System.out.println ("Numero: " + (contador+1) );

                   contador ++; 
        }
        while(contador<valor);
            
     }
}
