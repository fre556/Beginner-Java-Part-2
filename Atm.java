/**
 * @(#)Atm.java
 *
 *
 * @author 
 * @version 1.00 2012/10/15
 */

import java.util.Scanner;
public class Atm {

    public static void main (String args[]) {
    	
    	//allow for data input
    	Scanner input = new Scanner (System.in);
    	
    	//declare variables
    	
		int pin[] = {123,234,345,456};
    	String strpin;
    	int userpin,choice=0,validation;
    	String strchoice;
    	int flag=0,sub=0;
    	int [] transactions = new int[10];
    	String name[] = {"jow","jerry","milly","billy"};
	    int balance[] = {200,300,400,500};
	    String strbal;
	    int od[] = {1,0,0,1};
		int choice2=0;
		String strchoice2;
		int newpin=0;
    	int flag2=0;
    	int i;
    	
    	//welcome message
    	System.out.println (" Welcome to Joes Bank");
    	
    	System.out.print ("\n");
    	System.out.print ("\n");
    	System.out.print ("\n");
    	
    	System.out.println ("1: Login");
    	System.out.println ("2: Exit");
    	

    	
    	//allowing the user to enter there choice for the menu
		System.out.print("Enter choice 1-2: ");
   		choice = input.nextInt();
    	
    	
    	
    	while (choice !=2) {
    	switch(choice) {
    	
    	
    		
    		case 1:
    		System.out.print ("Enter pin: ");
    		strpin = input.next();

			 i=0;

			//3 number error
    		while(!strpin.matches("\\d{3}")) {

    			System.out.println ("Error 3 numbers only");
				System.out.print ("\n");
    			System.out.print ("Enter pin: ");
    			strpin = input.next();
				}//end while

				//changing user pin to int
				userpin = Integer.parseInt(strpin);

				//if statement for pin entry
				i=0;
				while(i<name.length){

				if (userpin==pin[i]){//if statement for user pin
					flag=1;
					sub=i;

					//Welcome message
					System.out.print ("\n");
					System.out.println ("welcome " + name[sub]);
					System.out.print ("\n");
					System.out.println (" Main menu ");
					System.out.println ("\n");//spacing
					//printing the balance
					System.out.println ("1) View Balance");
					System.out.println  ("2) Withdrawl");
					System.out.println  ("3) Deposit");
					System.out.println ("4) Change Pin");
					System.out.println ("5) Exit");
					
				}//end if statement
				i++;
				}//end while
	
				//if statement for incorrect pin
				if (flag==0) {
				System.out.print ("\n");
				System.out.println ("incorrect pin closing program");
				System.exit(0);
				} 
				
				
				case 2: 
				if (choice==2){
					System.out.print ("goodbye");
					System.exit(0);
				}//end if statement
	    	}//end switch case
	    	}
    	
    	
    	
    	
    
    }
    
    
}