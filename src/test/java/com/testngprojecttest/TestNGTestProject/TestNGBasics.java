package com.testngprojecttest.TestNGTestProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite //1
	public void setup() {
		System.out.println("System property setup");
	}

	@BeforeTest //2
	public void launchBrowser() {
		
		System.out.println("Launch the browser");
		
	}
	
	@BeforeClass //3
	public void enterURL() {
		System.out.println("Enter the URL");
	}
	
	@BeforeMethod //4 
	public void login() {
		System.out.println("Login into the application");
	}
	
	
	@Test //5
	public void googleTitleTest() {
		System.out.println("google title test");
	}
	
	@Test
	public void searchText() {
		System.out.println("Search the text");
	}
	
	@AfterMethod //6
	public void logOut()
	{
		System.out.println("Logout from application");
	}
	
	@AfterClass //7
	public void deleteAllCookies() {
		System.out.println("Delete All Cookies");
	}
	
	@AfterTest //8
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	
	@AfterSuite //9
	public void generateReport() {
		System.out.println("Generate Test Reports");
	}
	
}
