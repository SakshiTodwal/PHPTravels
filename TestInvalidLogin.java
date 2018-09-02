package com.loginPHPtravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInvalidLogin {

	public static void main(String[] args) {
		WebDriver driver;
		LoginPHPTravels objLogin;
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		
		objLogin = new LoginPHPTravels(driver);
		objLogin.loginToPHPTravels("fake@user.com", "fakepassword");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		objLogin.invalidLogin();
		

	}

}
