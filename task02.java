package com.example.testngdemo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;

public class task02 {
	
	int a=1,b=2,c;

  @Test(priority = 1)
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c, 3);
	  System.out.println(c);
  }
  
  @Test(priority = 3)
  public void sub() {
	  c=a-b;
	  Assert.assertEquals(c, -1);
	  System.out.println(c);
  }
  
  @Test(priority = 4)
  public void mul() {
	  c=a*b;
	  Assert.assertEquals(c, 2);
	  System.out.println(c);
  }
  
  @Test(priority = 2)
  public void div() {
	  c=b/a;
	  Assert.assertEquals(c, 2);
	  System.out.println(c);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
