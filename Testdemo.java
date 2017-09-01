package testDemo;
//Package is a grouping of related types providing access protection and name 
//space management

import java.util.Scanner;
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions

public class Testdemo {
	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
	//Type casting is a class name
			
		public static void main(String[] args) {
	//Java Program processing starts from the main() method which is a mandatory part of every program 		
	//static used to prepare a field,method or inner classes as a class field.
	//void is used to define the return type of the method
	//String[] args is actually an array of java.lang.String type and it's name is args here
	//String is predefined class name 
	//args is name of the array
			
		 //System.out.println(Integer.parseInt(args[0]));
	//we are checking whether we gave zero or not 
		//int n1=Integer.parseInt(args[0]);
		int n1 = 0;
      if(n1==0){
 //using if loop checking that if it is equal to zero it shows that we have entered zero
    	  System.out.println("you have entered zero");
      String char1=null;
      //taking ASCII value ha null it prints as null
      System.out.println("ASCII value of n is"+(char1));
 //prints the ASCII value
      }
	else if(n1<0)
//if we pass negative arguments it will show negative value
	{
		System.out.println("you have entered negative values");
	}else
	{
		//positive arguments
		System.out.println("you have entered positive values");
	}
   Scanner in=new Scanner(System.in);
   //we are using scanner to initialize the input values 
   System.out.print("Enter the marks of Physics");
   //it print the values
   int num1=in.nextInt();
   
   System.out.print("Enter the marks of Chemistry");
   int num2=in.nextInt();
   
   System.out.print("Enter the marks of Maths");
   int num3=in.nextInt();
    
   int physics=num1,chemistry=num2,maths=num3,average;
   //after intializing the marks it calculate the average value
   
   average=(physics+chemistry+maths)/3;
    if(average>=70)
    {
    	//if the value is equal to input then it show the grade
    	System.out.println("Grade A");
    }
    if((average>=61) && (average<70))
    {
    	System.out.println("Grade B");
    }
    if(average<61)
    {
    	System.out.println("Grade C");
    }
		}    
    
}
