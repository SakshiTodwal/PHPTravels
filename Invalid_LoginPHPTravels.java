package com.loginPHPtravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_LoginPHPTravels {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://www.phptravels.net/login";
		String username = "fakeuser";
		String pass = "fakepassword";
		driver.get(baseurl);
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submitLogin = driver.findElement(By.xpath("//form[@id='loginfrm']/div[1]/div[5]/button"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		email.sendKeys(username);
		password.sendKeys(pass);
		submitLogin.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement invalidLogin = driver.findElement(By.xpath("//form[@id='loginfrm']/div[1]/div[2]/div"));
		if(invalidLogin.isDisplayed()){
			System.out.println("Incorrect Username and password");
		}
	}

}
