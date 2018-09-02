package com.loginPHPtravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPHPTravels {
	WebDriver driver;
	By email = By.name("username");
	By password = By.name("password");
	By submitLogin = By.xpath("//form[@id='loginfrm']/div[1]/div[5]/button");
	
	public LoginPHPTravels(WebDriver driver){
		this.driver = driver;
	}
	
	//set user name in textbox 
	public void setUserName(String strUserName){
		driver.findElement(email).sendKeys(strUserName);
	}
	
	 //Set password in password textbox

    public void setPassword(String strPassword){

         driver.findElement(password).sendKeys(strPassword);
    }
    
    //Click on login button

    public void clickLogin(){

         driver.findElement(submitLogin).click();
    }       
    
    public void invalidLogin(){
    	By invalidLogin = By.xpath("//div[@class='alert alert-danger']");
    	if(driver.findElement(invalidLogin).isDisplayed()){
		  System.out.println("Incorrect username & password");
	  }
    }
    
    public void loginToPHPTravels(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();  
       

        }
    
    }
	