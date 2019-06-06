package com.testngtest.customer;


import org.testng.annotations.Test;

public class simpleTest1 {
	@Test(priority=1)
	private void createCustomerTest()
	{
		System.out.println("execute customerTest");
	}
		@Test(priority=2)
		
		private void modifyCustomerTest()
		{
			System.out.println("execute  modifyCustomerTest");
		}
			@Test(priority=3)
			private void deleteCustomerTest()
			{
				System.out.println("execute deleteCustomerTest");
			}

			
		}
		
		  
	


