package com.testng;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(priority=1)
	private void creatCustomer()
	{
		System.out.println("execute customerTest");
	}
		
	@Test(priority=2)
	private void modifyCustomer()
	{
		System.out.println("execute modify customerTest");
	}
	
	@Test(priority=3)
	private void deleteCustomer()
	{
		System.out.println("execute delete customerTest");
	}
	}


