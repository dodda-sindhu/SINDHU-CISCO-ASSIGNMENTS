package com;

// overloading
 class OverLoadedMenthods
{
	void method1()
	{
		System.out.println("method with no arguments"+"\n");
	}
	void method2(int i)
	{
		System.out.println("method with one argument"+"\n"+i);
	}
	void method3(int i, int j)
	{
		System.out.println("method with two arguments"+"\n"+i+"\n"+j+"\n");
	}
}
 // overriding
class Overriding1
{
	void method()
	{
		System.out.println("OverridingMethod");
	}
}
class Overriding2 extends Overriding1
{
	void method()
	{
		System.out.println("print method in Overriding2");
	}
}

//main method for overloading and overriding
class OverloadingAndOverriding 
{
	
	public static void main(String[] args)
	{
		// method overloading

		System.out.println("**Method OverLoading**"+"\n");
		OverLoadedMenthods olm= new OverLoadedMenthods();
		olm.method1();
		olm.method2(10);
		olm.method3(10,20);
		
		// method overriding
		
		System.out.println("**Method Overriding**"+"\n");
		Overriding2 or = new Overriding2();
		or.method();
		
	}
}