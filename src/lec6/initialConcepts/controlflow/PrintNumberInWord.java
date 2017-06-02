package lec6.initialConcepts.controlflow;

import java.util.Scanner;

/*
 * Trying nested-if and switch-case statements.
 * 
 * PrintNumberInWord (nested-if, switch-case): Write a program called PrintNumberInWord which prints 
 * "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively. 
 * Use (a) a "nested-if" statement; (b) a "switch-case" statement.
 */
public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 1;  // Set the value of "number" here!
      
      System.out.println("Please enter the desired number");
      
      Scanner sc = new Scanner(System.in);
      number = sc.nextInt();
 
      // Using nested-if
      /*if (number == 1) {
         System.out.println( "ONE" );
      } else if ( number == 2) {
    	  System.out.println( "TWO" );
      } 
      else if ( number == 3) {
    	  System.out.println( "THREE" );
      }
      else{
    	  System.out.println("OTHER");
      }
      
      System.out.println("Now I am out of nested if-else flow");*/
      
      // Using switch-case
      
      System.out.println("I am testing switch case now");
      
      // number is called selecter here
      // valid selector in java
      // all primitive types like int, float, byte, short, long
      // char is valid data type
      // String is valid data type  {1.6 invalid},v1.7 onwards
      switch(number) {    // 2
         case 1: {
        	 System.out.println( "ONE" ); // Don't forget "break"
        	 System.out.println("more");
        	 if(true)
        	 {
        		 System.out.println("inside if");
        	 }
        	break; 
         }
         case 2: System.out.println( "TWO" ); break;
         case 3: System.out.println( "THREE" ); break;
        // ......
         default: System.out.println( "OTHER" ); 
      }
   }
}
