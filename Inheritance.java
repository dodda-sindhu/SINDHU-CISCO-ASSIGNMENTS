package com;

class Add
{
	int i,j ;
	int addNum()
	{
		int sum=0;
		sum=i+j;
		return sum;
		
	}

}
class Sub extends Add
{
	int sub;

	int subNum()
	{
		sub=i-j;
		return sub;
		
	}

}
public class Inheritance {

	public static void main(String[] args) 
	{
		Sub s= new Sub();
		s.i=20;
		s.j=10;
		
		
		System.out.println(s.i);
		System.out.println(s.j);
		System.out.println(s.addNum());
		System.out.println(s.subNum());

	}

}
