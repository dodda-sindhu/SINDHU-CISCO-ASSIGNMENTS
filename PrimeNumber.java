package com;
import java.util.Scanner;

public class PrimeNumber
{
	
	public static void main(String[] args)
	{
	
		 int i=1,j=0; 
	     Scanner s=new Scanner(System.in); 
	     System.out.println("Enter a number:");
	     int num=s.nextInt();
	     	
	     while(i<= num) 
         { 
             if((num%i)==0) 
                j=j+1; 
                i++; 
         } 
          if(j==2) 
          System.out.println(num +" is a prime number"); 
          else 
          System.out.println(num +" is not a prime number"); 

		 
	}
	

}
