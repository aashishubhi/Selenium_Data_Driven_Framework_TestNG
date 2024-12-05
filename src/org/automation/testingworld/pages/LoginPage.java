package org.automation.testingworld.pages;


import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	WebDriver driver;                //global driver object
	
	//creating constructor
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;          //to pass local value of driver to global driver
	}
	
	public void enterUsername(String uname) throws Exception {
		driver.findElement(By.id(Utility.fetchLocatorValue("login_username_id"))).sendKeys(uname);
	}
	public void enterPassword(String pass) throws Exception {
		driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
	}
	public void clickLoginin() throws Exception {
		driver.findElement(By.id(Utility.fetchLocatorValue("login_login_xpath"))).click();
	}
}
