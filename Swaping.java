package com;
import java.util.Scanner;
public class Swaping
{

	public static void main(String[] args) 
	{

		
		        Scanner s=new Scanner(System.in);
		        System.out.println("Enter num1:");
		        int num1=s.nextInt();
		        System.out.println("Enter num2:");
		        int num2=s.nextInt();
		        System.out.println("before swaping="+num1+" "+num2);
		        num1=num1+num2;
		        num2=num1-num2;
		        num1=num1-num2;
		        System.out.println("after swaping="+num1+" "+num2);
		

		}


	}


