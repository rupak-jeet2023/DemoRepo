package com.testngprojecttest.TestNGTestProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(timeOut=700)
	public void infiniteloop() {
		
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	}

}
