package com.testngprojecttest.TestNGTestProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class GoogleTest extends Base {
	
	
	@BeforeMethod
	public void browserLaunch(){
		
		initialization();
		
	}
	
	@Test
	public void verifyLogo() {
	
		boolean t = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();		
		
		AssertJUnit.assertEquals(t, false);
		
	}
	
	@Test
	public void verifySearchbox() {
				
		try {
		boolean b = driver.findElement(By.xpath("//textarea[@title='Search']")).isDisplayed();
		AssertJUnit.assertTrue(false);
		}
		catch(Exception e)
		{
			AssertJUnit.assertTrue(false);
		}
	}
	
	
	
		
	
}
