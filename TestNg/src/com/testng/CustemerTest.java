package com.testng;

import org.testng.annotations.Test;

import com.actitime.baseclass.BaseClass;

public class CustemerTest extends BaseClass {

	@Test
	public void createCustomerTest(){
		System.out.println("execute createCustomerTest ");
	}

	@Test
	public void modifyCustomerTest(){
		System.out.println("execute modifyCustomerTest");
	}
}
