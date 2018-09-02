package com.loginPHPtravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPHPTravels {

	public static void main(String[] args){
			WebDriver driver;
			LoginPHPTravels objLogin;
			AccountPagePHPTravels objAccountPage;
			HomePagePHPTravels objHomePage;
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();

		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		    driver.get("https://www.phptravels.net/login");
			

	        objLogin = new LoginPHPTravels(driver);
	        objAccountPage = new AccountPagePHPTravels(driver);
	        objHomePage = new HomePagePHPTravels(driver);
			
			//login to application

			objLogin.loginToPHPTravels("user@phptravels.com", "demouser");
			
	    	//Verify user page title

			String accountPageTitle = objAccountPage.getAccountTitle();
	   
				if(accountPageTitle.contains("Hi")){
					System.out.println("Logged in");
				}
				else{
					System.out.println("Something went wrong");
				}
			// invalid login
				objLogin.loginToPHPTravels("fake@user.com", "fakepassword");
	  
			
			
			// data for Hotels
	       objHomePage.searchHotels("Montreal","12/09/2018","15/09/2018");
			}
		}
