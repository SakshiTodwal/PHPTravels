package com.loginPHPtravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePagePHPTravels {
	WebDriver driver;
	By cityName = By.xpath("//a[@class='select2-choice']");
	By citySelect = By.xpath("//ul[@class='select2-result-sub']/li/div");
	By checkIn = By.name("checkin");
	By checkOut = By.name("checkout");
	By noOfPassengers = By.xpath("//form[@role='search']/div[4]/div/input");
	By adult = By.xpath("//button[@id='adultPlusBtn']");
	By searchButton = By.xpath("//div[@id='HOTELS']/form/div[5]/button");		
	
	
	
	public HomePagePHPTravels(WebDriver driver) {
		this.driver = driver;
	}

	//select the cityname
	public void setCity(String strCity){
		driver.findElement(cityName).click();
		driver.findElement(cityName).sendKeys(strCity);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(citySelect).click();
	}
	
	// select checkIn date
	public void checkIn(String checkInDate){
		driver.findElement(checkIn).sendKeys(checkInDate);
	}
	
	// select checkOut date
	public void checkOut(String checkOutDate){
		driver.findElement(checkOut).sendKeys(checkOutDate);
	}
	
	// set no. of Passengers
	public void noOfPassengers(){
		driver.findElement(noOfPassengers).click();
		driver.findElement(adult).click();
	}
	
	public void search(){
		driver.findElement(searchButton).click();
	}
	
	public void searchHotels(String strCity, String checkInDate, String checkOutDate ){
		//fill cityname
		this.setCity(strCity);
		this.checkIn(checkInDate);
		this.checkOut(checkOutDate);
		this.noOfPassengers();
		this.search();
		
	}
	
}
