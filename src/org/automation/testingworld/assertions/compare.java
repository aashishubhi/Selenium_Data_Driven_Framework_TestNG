package org.automation.testingworld.assertions;

import org.openqa.selenium.WebDriver;

public class compare {
	
	public boolean  validatePageURL(WebDriver driver, String expURL) {
		
		boolean flag = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL)) {
			flag = true;
		}
		return flag;
	}

	public boolean  validatePageTitle(WebDriver driver, String expTitle) {
		
		boolean flag = false;
		if(driver.getTitle().equalsIgnoreCase(expTitle)) {
			flag = true;
		}
		return flag;
	}
}
