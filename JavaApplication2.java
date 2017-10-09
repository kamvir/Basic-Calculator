/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author Viraj
 */
public class JavaApplication2 {
public static int a, b, c;
public static char decision='y' ;
    /**
     * @param args the command line arguments
     */
    public static void calculator(char s){
        s = decision;
        Scanner sc = new Scanner(System.in);
        if(s=='y' || s=='Y'){
       
         int  x = JavaApplication2.a;
   
    
         int y = JavaApplication2.b, z ;
         System.out.println(" Press\n 1.Add.\n 2.Subtract.\n 3.Mutiply.\n 4.Divide.\n");
        z=sc.nextInt();
            switch(z)
            {
                case 1: System.out.println("Addition = "+(x+y));
                           break;
                case 2: System.out.println("Subtraction = "+(x-y)); 
                           break;
                case 3: System.out.println("Multiplication = "+(x*y));
                           break;
                case 4: float e = 0; 
                         e = (float)x/y ;
                         System.out.println("Division = "+e);
                         break;
                default: System.out.println("Enter Valid Number(1 to 4)");
                
            
            }}}
    
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter First Number = ");
        a= sc.nextInt();
        System.out.println("Enter Second Number = ");
        b= sc.nextInt();
        calculator(decision);
        System.out.println("Want to calculate again(y/n)?");
        decision=sc.next().charAt(0);
        
            if(decision == 'y'|| decision=='Y'){
                 calculator(decision);
                  while(decision == 'y'|| decision=='Y'){
                 System.out.println("Want to calculate again(y/n)?");
                decision=sc.next().charAt(0);
                calculator(decision);
        }}
        if(decision == 'n' || decision=='N'){
            System.out.println("Thanks for interacting!!");
        }
        else{
            System.out.println("Invalid entry.\nExiting application.\nThanks for interaction.\nRun it again.");
              
            
        }

            
            
        }
       
         
              
        
        
    }
    

