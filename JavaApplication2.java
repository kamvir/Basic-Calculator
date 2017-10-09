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
public static int a, b, c; //Three variables taken, two for getting numbers and one for giving the output of the operation.
public static char decision='y' ; //Initialized decision to be as y(or yes).
    /**
     * @param args the command line arguments
     */
    // Method for calculating two according to user prefernces and String argument is used inside.
    public static void calculator(char s)
    {    
        s = decision; //String takes the initialized decision and then takes user's preferred decision.
        Scanner sc = new Scanner(System.in);
        if(s=='y' || s=='Y'){
       
         int  x = JavaApplication2.a; // First number passed here.
         int y = JavaApplication2.b; // Second number passed here
         int z;
         System.out.println(" Press\n 1.Add.\n 2.Subtract.\n 3.Mutiply.\n 4.Divide.\n"); //user enter's any one option.
         z=sc.nextInt();
            switch(z) // Task is performed according to the number entered by the user.
            {
                case 1: System.out.println("Addition = "+(x+y));
                           break;
                case 2: System.out.println("Subtraction = "+(x-y)); 
                           break;
                case 3: System.out.println("Multiplication = "+(x*y));
                           break;
                case 4: double e = 0.0d; // Introduced for printing proper division value.
                         e = (double)x/y ; //Type cast to get right division answer.
                         System.out.println("Division = "+e);
                         break;
                default: System.out.println("Enter Valid Number(1 to 4)"); /* This shows up if user enter any different value 
                *rather than preferred value.
                */
                
            
            }}}
    
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        // Firstly after compilation and running it will ask user to enter two numbers.
        System.out.println("Enter First Number = ");
        a= sc.nextInt();
        System.out.println("Enter Second Number = ");
        b= sc.nextInt();
        calculator(decision);
        System.out.println("Want to calculate again(y/n)?");
        decision=sc.next().charAt(0);
            
            // According to user preference the loop works accordingly.
            if(decision == 'y'|| decision=='Y'){
                 calculator(decision); //Calls the method @Calculator and executes the following code again.
                /* After Calculator method executed it will jump here and again 
                * will ask the question of continuation of calculation.
                * This will continue asking the question again and until other option is chosen is by the user.
                */
                while(decision == 'y'|| decision=='Y'){
                 System.out.println("Want to calculate again(y/n)?");
                decision=sc.next().charAt(0);
                calculator(decision);
        }}
        /* If user chooses other option then the application exits with a thanking message.
    
        */
        if(decision == 'n' || decision=='N'){
            System.out.println("Thanks for interacting!!");
        }
        /* If any other option is chosen rather than the given option, it will immediately exit the application by 
        * stating the given option is invalid and sugget you to run again.
        */
        else{
            System.out.println("Invalid entry.\nExiting application.\nThanks for interaction.\nRun it again.");
              
            
        }

            
            
        }
       
         
              
        
        
    }
    

