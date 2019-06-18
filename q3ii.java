/**
 * @(#)q3ii.java/
 *
 *
 * @author 
 * @version 1.00 2012/10/4
 */


public class q3ii {

    public static void main (String args[]) {
    	
  	    int dice,i;
    	int numbers[] = new int[7];
    	
    	for (i=1;i<=100;i++) {
		 dice = 1 + (int)Math.random()*6);
		numbers[dice]++;
    }
    	
		System.out.println ("umber\t\tTimes Appeared\n")
		
		for (i=1;i<numbers.length;i++) {
		System.out.println ( i + "\t\t"
			
			