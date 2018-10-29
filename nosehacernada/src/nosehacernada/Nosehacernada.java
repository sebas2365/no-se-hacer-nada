/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nosehacernada;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Nosehacernada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        String ciudad;
        int cont=0;
        char letra;
       
            System.out.println("introduce letra");
            letra=sc.nextLine().charAt(0);
        
            do{
                 System.out.println("Introduce Ciudad");
                  ciudad=sc.nextLine();
                
                if(ciudad.charAt(0)==letra){
                cont++;}
            }while(ciudad=="fin")
         
        System.out.println("resultado\n"+cont);
    }
    
}
