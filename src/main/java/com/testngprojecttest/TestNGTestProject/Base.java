package com.testngprojecttest.TestNGTestProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import java.io.*;

public class Base {
	
	public static WebDriver driver;
	
	public void initialization() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
	}
	
	public void takefailedscreenshot(String testMethodName) {
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcfile, new File("D:/Rupak Pal Data/Rupak's Data/Java/Java Class/TestNGTestProject/Screenshots/"+testMethodName+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
