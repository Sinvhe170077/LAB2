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



public class Part2_2 {
    
    public static String inp() throws Exception
    {
        try {
            Pattern p= Pattern.compile("^(SE[0-9]{4})$");
        Scanner sc=new Scanner(System.in);
        
        String name=sc.nextLine();
         
        if(!p.matcher(name).find()) 
            throw new Exception();
            return name; 
        } catch (Exception e) 
        {
              System.out.println("Invalid");  
        }
      return "";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    boolean cont = true;
        
  while(cont){
         System.out.println("Enter the String");
       
        try {
             String name=inp();
            
             
            
             System.out.println(name);       
              
           
           cont = false;
        } catch (Exception e) { 
            
  
            System.err.println("Invalid");
            cont=true;
        }
           
     
    }
    }
}
       
