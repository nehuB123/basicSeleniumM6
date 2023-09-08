package TestNg_Group;

import org.testng.annotations.Test;

public class Sample12
{
       @Test(groups="smoke")
     public void sample2()
     {
    	   System.out.println("hi sample1");
     }

       @Test
       public void sample3()
       {
      	   System.out.println("hi sample2");
       }
	
}

