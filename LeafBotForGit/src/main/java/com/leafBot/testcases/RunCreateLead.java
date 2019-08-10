package com.leafBot.testcases;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class RunCreateLead extends ProjectSpecificMethods{
    @BeforeTest
	public void Name(){
				
		excelFileName ="TC001";
		testcaseName="CreateLead";
	    /*testcaseDec="Login and Logout";
	    author ="Sabari";
	    category="Positive flow";*/
	}
	@Test(dataProvider="fetchData")
	public void createLeadTestCase(String username, String password){
		
		new LoginPage().enterUsername(username).enterPassword(password)
		.clickLogin().clickLogout();
		
		
	}
	
	
	
	
}
