/**
 * @(#)q4iii.java
 *
 *
 * @author 
 * @version 1.00 2012/10/4
 */

import java.util.Scanner;
public class q4iii {

    public static void main (String args[]) {
    	
    Scanner input = new Scanner (System.in);
    	
    int numbers[] = {0,1,2,3,4,5,6,7,8,9,10};
 		
    for (int i=0;i<numbers.length;i++) {
		numbers[i] = numbers[i] * numbers[i];
		System.out.println(numbers[i]);
}//end for
}//end main
}//end class