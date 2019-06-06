package com.testngtest.customer;

import org.testng.annotations.Test;

public class simpleTest3 {

	@Test
	public void createCustomerTest()
	{
		System.out.println("execute createCustomerTest");
		int[] arr=new int[2];
		arr[3]=12;
	}
	@Test(dependsOnMethods="createCustomerTest")
	public void deleteCustomerTest() {
		System.out.println("execute delete CustomerTest");
		
	}
		
	
		
	}
	

