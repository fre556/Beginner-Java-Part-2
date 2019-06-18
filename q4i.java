/**
 * @(#)q4i.java
 *
 *
 * @author 
 * @version 1.00 2012/10/4
 */

import java.util.Scanner;
public class q4i {

    public static void main (String args[]) {
    	
    	String pass;
    
    	Scanner input = new Scanner(System.in);
    
    	System.out.print ("enter password: ");
    	pass=input.next();
    	
    	while (!pass.matches("password")) {
    		System.out.println ("incorrect passowrd");
    		
    		System.out.print ("enter password: ");
    		pass=input.next();
    	}//end while
    	
    	System.out.println ("welcome");
     
    }
    
    
}