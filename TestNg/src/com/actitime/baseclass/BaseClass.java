package com.actitime.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	@BeforeClass
	public void configBC(){
		driver=new FirefoxDriver();
	}
    @BeforeMethod
    public void configBM(){
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.get("http://localhost:89/login.do");
    	driver.findElement(By.name("username")).sendKeys("admin");
    	driver.findElement(By.name("pwd")).sendKeys("manager");
    	driver.findElement(By.id("loginButton")).click();
    }
    
    @AfterMethod
    public void configAM() {
    	
    	driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }
    
    @AfterClass
    public void configAC(){
    	
    	driver.close();
    }
}
