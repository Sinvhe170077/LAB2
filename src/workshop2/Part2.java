/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Nguyen Van Si
 */
public class Part2 {
    public static void main(String[] args) {
        boolean cont = false;
        Pattern p = Pattern.compile("^(SE[0-9]{4})$");
        do {
            Scanner sc =new Scanner(System.in);
           String name = sc.nextLine();
            try {
                
            
            
            if(!p.matcher(name).find())
                throw new Exception();
                System.out.println("The String is : " + name );
                cont = false;
            } catch (Exception e) {
                System.out.println("INVALID");
                cont =true;
            }
        }while(cont);
        
    }
    
}
