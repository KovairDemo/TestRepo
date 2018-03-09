package Signup;

import java.util.Scanner;




		class GetInputData
		{
		  public static void main(String args[])
		  {
		     int num;
		     double fnum;
		     String str;
		 
		     Scanner in = new Scanner(System.in);
		 
		     //Get input String 1
		     System.out.println("Enter your name : ");
		     str = in.nextLine();
		     System.out.println("Input String is: "+str);
		 
		     //Get input Integer
		     System.out.println("Enter an integer1: ");
		     num = in.nextInt();
		     System.out.println("Input Integer is: "+num);
		 
		     //Get input float number
		     System.out.println("Enter a float number: ");
		     fnum = in.nextFloat();
		     System.out.println("Input Float number is: "+fnum); 
		  }
		}
	

