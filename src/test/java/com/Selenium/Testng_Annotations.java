package com.Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Annotations {
  @Test
  public void testCase1() {
	  System.out.println("Inside Testcase 5");
  }
  @Test
  public void testCase2() {
	  System.out.println("Inside testcase 2");
  }
  @Test
  public void testCase3() {
	  System.out.println("Inside testcase 3");
  }
  @Test
  public void testCase4() {
	  System.out.println("Inside testcase 4");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside aftermethod");
	  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside Beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
  	  System.out.println("Inside beforesuite");
	  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside aftersuite");
  }

}
