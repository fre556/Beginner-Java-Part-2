/**
 * @(#)scorearray.java
 *
 *
 * @author 
 * @version 1.00 2012/10/1
 */

import java.util.Scanner;
public class scorearray {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    
    //for user
    int grades[] = new int[5];
    int total=0, average;
    
    for (int i=0; i<grades.length;i++) {
    	System.out.print ("Enter grade " + (i+1) + ":");
    	grades[i]=input.nextInt();
    	
    	total = total+grades[i];
    }//end for loop
    
    average = total/grades.length; //or average total/5
    
    for (int i=0;i<grades.length;i++) {
    	if (grades[i]>average) {
    		System.out.println (grades[i]);
    	}
    }
    }//end main
    
    
}//end class