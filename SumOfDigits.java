package com;

import java.util.Scanner;

public class SumOfDigits 
{
	public static void main(String[] args) {
        
        int sum = 0;
        Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
        int num=s.nextInt();
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }

}
