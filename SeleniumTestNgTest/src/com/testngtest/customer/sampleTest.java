package com.testngtest.customer;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampleTest {
	@BeforeMethod
	public void CongigBM() {
		System.out.println();
	}
			@Test
			public void createCustomerTest() {
				System.out.println("execute modifyCustomerTest");
			}
			@AfterMethod
			public void ConfigAM() {
				System.out.println("logout");
			
			}
		
	}
	


