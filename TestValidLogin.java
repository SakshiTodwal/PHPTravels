package com.loginPHPtravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestValidLogin {

	public static void main(String[] args){
			WebDriver driver;
			LoginPHPTravels objLogin;
			AccountPagePHPTravels objAccountPage;
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.phptravels.net/login");
			driver.manage().window().maximize();
			

	        objLogin = new LoginPHPTravels(driver);
	        objAccountPage = new AccountPagePHPTravels(driver);
			
			//login to application

			objLogin.loginToPHPTravels("user@phptravels.com", "demouser");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    	//Verify user page title

			String accountPageTitle = objAccountPage.getAccountTitle();
	   
				if(accountPageTitle.contains("Hi")){
					System.out.println("Logged in");
				}
				else{
					System.out.println("Something went wrong");
				}
	  
	}
}
