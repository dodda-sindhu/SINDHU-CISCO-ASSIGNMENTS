package com;


import java.util.Scanner;

public class Fibonacci
{
		public static void main(String args[])  
		{    
			  Scanner s=new Scanner(System.in);
		      System.out.println("Enter the value:");
		      int f=s.nextInt();
		      
		      int f1=0,f2=1,temp;
		      System.out.println(f1+"\n"+f2);
		      for(int i=1; i<=f; i++)
		      {
					temp=f1+f2;
					f1=f2;
					f2=temp;
					System.out.println(temp+"");
		      }
		    
		 
		  
		}  
}
