package com.testngtest.customer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampleTest1 {
	@BeforeClass
	public void ConfigBC() {
		System.out.println("=== launch th browser");
	}
	@BeforeMethod
	public void ConfigBM() {
		System.out.println("===login===");
	}
	@Test
	public void ConfigAM() {
		System.out.println("===logout===");
	}
	@AfterMethod
	public void ConfigAC() {
		System.out.println("===close the browser===");
		
	}

}
