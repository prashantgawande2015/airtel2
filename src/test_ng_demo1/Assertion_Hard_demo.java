package test_ng_demo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Hard_demo {
  @Test
  public void method1() {
	  
	  System.out.println("Test case1 started");
	  Assert.assertEquals(10, 20);
	  System.out.println("Test case1 ended");
	  
  }
  
  @Test
  public void method2() {
	  System.out.println("Test case2 started");
	  System.out.println("Test case2 ended");
  }
  
  
}
