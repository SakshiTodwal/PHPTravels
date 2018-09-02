package com.loginPHPtravels;

import java.util.concurrent.TimeUnit;
import java.util.function.ObjLongConsumer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSearchHotels {

	public static void main(String[] args) {
		WebDriver driver;
		HomePagePHPTravels objHomePage;
		LoginPHPTravels objLogin;
		AccountPagePHPTravels objAccountPage;
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		
		 objLogin = new LoginPHPTravels(driver);
		 objAccountPage = new AccountPagePHPTravels(driver);
		 objHomePage = new HomePagePHPTravels(driver);
		 objLogin.loginToPHPTravels("user@phptravels.com", "demouser");
		 objAccountPage.gotoHome();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 objHomePage.searchHotels("Montreal","12/09/2018","15/09/2018");
		 System.out.println(driver.getTitle());
		 if(driver.getTitle() == "Search Results"){
				System.out.println("Test passed");
			}
	}

}
