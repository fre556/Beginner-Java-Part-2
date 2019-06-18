/**
 * @(#)seteinel.java
 *
 *
 * @author 
 * @version 1.00 2012/10/1
 */

import java.util.Scanner;
public class seteinel {

    public static void main (String args[]) {
    	//needed to take in age
    	Scanner input = new Scanner(System.in);
    	
    	int i,age,total=0,average,counter=o;
    	
    	System.out.print ("grades would you like to enter or -1 to quit");
    	age=input.nextInt();
			    		
    		//loop to take in the grades
    		while (age !=-1){
    			
    			//add the grade to the total
    			total = total + age;
    			
    			//increment counter
    			counter++;
    			
    			//prompt user 
    			System.out.print ("grades would you like to enter or -1 to quit");
    			age=input.nextInt();
    			
    		}//end while
    		
    		//if counter =0
    		if (counter==0) {
    			System.out.println("No grades entered");
    		}
    		else {
    			System.out.println ("Average age is " + total/counter);
    		}//end if else
    	
    
    
    }
    
    
}