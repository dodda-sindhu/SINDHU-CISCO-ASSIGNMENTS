package com;


import java.util.Scanner;
public class Reverse
{
	public static void main(String[] args)
	{
		
		int reverse=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		while (num!=0)
		{
			 reverse = reverse* 10;
	          reverse = reverse +num%10;
	          num= num/10;
		}
		 System.out.println("Reverse of a number: "+reverse);
	}

}
