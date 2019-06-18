/**
 * @(#)returnnumber.java
 *
 *
 * @author 
 * @version 1.00 2012/11/5
 */

import java.util.Scanner;
public class returnnumber {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner (System.in);
    		
    	int num1;
    	int num2;
    	int result;
    	
    	System.out.print ("Enter number 1: ");
    	num1=input.nextInt(); 
    		
    	System.out.print ("Enter number 2: ");
    	num2=input.nextInt(); 
    		
    
    		
    	returnnumber(num1,num2);
    	
    	result=returnnumber(num1,num2);
    		
    	System.out.print ("The result is" + result);
    	
    		
    }//end main
    
    
    public static int returnnumber(int x,int y) {
    	
    	
    	return x*y;
    	
    }
    
}//end class