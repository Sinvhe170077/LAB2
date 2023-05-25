/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

/**
 *
 * @author Nguyen Van Si
 */
import java.util.*;
public class Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        boolean cont =false;
        do {
            try {
                
                int n=sc.nextInt();
                if(n<0) 
                    throw new Exception();
                   System.out.println("The number is " + n);
                   cont = false;
                   
                           
                           
                    
                
            } catch (Exception e) {
                System.out.println("The number is Invalid : ");
              cont =true;
            }
        }while(cont);
    }
    
}
