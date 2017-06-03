package com;


interface Hello{
	public void a();
}
interface Hai{
	public void b();
	
}

 class MultipleInheritance implements Hello,Hai
{


		public void a()
			{
				System.out.println("Hello");
				
			}
	
	
		public void b() 
			{
				System.out.println("Hai");
				
			}
		public static void main(String[] args)
		{
			System.out.println("Multiple inheritance using interfaces");
			
		    MultipleInheritance mi= new MultipleInheritance();
		    
			mi.a();
			mi.b();
		
		}
	
}
