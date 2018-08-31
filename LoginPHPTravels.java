package com.loginPHPtravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPHPTravels {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseurl = "https://www.phptravels.net/login";
		String username = "user@phptravels.com";
		String pass = "demouser";
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submitLogin = driver.findElement(By.xpath("//form[@id='loginfrm']/div[1]/div[5]/button"));
		email.sendKeys(username);
		password.sendKeys(pass);
		submitLogin.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		if(driver.getTitle() =="My Account"){
				System.out.println("Logged in");
			}
		else{
			System.out.println("Element not found");
		}
	}
}
	