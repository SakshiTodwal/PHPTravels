package com.loginPHPtravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPHPTravels {
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://www.phptravels.net/login";
		String username = "user@phptravels.com";
		String pass = "demouser";
		driver.get(baseurl);
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submitLogin = driver.findElement(By.xpath("//form[@id='loginfrm']/div[1]/div[5]/button"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		email.sendKeys(username);
		password.sendKeys(pass);
		submitLogin.click();
		driver.navigate().refresh();
		WebElement Home = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[@class='active']/a"));
		String text = Home.getText();
		System.out.println(text); 
		Home.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement cityName = driver.findElement(By.xpath("//a[@class='select2-choice']"));
		cityName.click();
		cityName.sendKeys("Montreal");
		WebElement citySelect = driver.findElement(By.xpath("//ul[@class='select2-result-sub']/li/div"));
		citySelect.click();
		WebElement checkin = driver.findElement(By.name("checkin"));
		checkin.click();
		WebElement checkInDate = driver.findElement(By.xpath("html/body/div[8]/div[1]/table/tbody/tr[6]/td[5]"));
		checkInDate.click();
		WebElement checkOut = driver.findElement(By.name("checkout"));
		checkOut.click();
		WebElement checkOutDate = driver.findElement(By.xpath("html/body/div[9]/div[1]/table/tbody/tr[2]/td[7]"));
		checkOutDate.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement noOfPassengers = driver.findElement(By.xpath("//form[@role='search']/div[4]/div/input"));
		noOfPassengers.click();
		WebElement adult = driver.findElement(By.xpath("//button[@id='adultPlusBtn']"));
		adult.click();
		WebElement searchHotels = driver.findElement(By.xpath("//div[@id='HOTELS']/form/div[5]/button"));
		searchHotels.click();
	}

}
