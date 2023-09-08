package test_Ng;

import org.testng.annotations.Test;

public class Priority_Invocation {
//1.Testing main method
	@Test (priority=-1,invocationCount=0)
	public void demo1()
	{
		System.out.println("Hi Demo1");
	}
	
//2.Testing main method
		@Test (invocationCount=2,enabled=false)
		public void demo2()
		{
			System.out.println("Hi Demo2");
		}
		
//3.Testing main method
				@Test (priority=-5, invocationCount=2)
				public void demo3()
				{
					System.out.println("Hi Demo3");
				}
		
}
