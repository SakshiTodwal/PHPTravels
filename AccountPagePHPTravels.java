package com.loginPHPtravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPagePHPTravels {
	
	WebDriver driver;
	By titleText = By.xpath("//div[@id='body-section']/div/div[1]/div/div[1]/h3");
	By Home = By.xpath("//ul[@class='nav navbar-nav']/li[@class='active']/a");
	
	public AccountPagePHPTravels(WebDriver driver){

        this.driver = driver;
	}
    
	 //Get the title of Account Page

    public String getAccountTitle(){

     return    driver.findElement(titleText).getText();

    }
    
  //go to Home page
  	public void gotoHome(){
  		driver.navigate().refresh();
  		driver.findElement(Home).click();
  	}

  	
}

