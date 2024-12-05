package org.automation.testingworld.testcases;

import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctionality extends DriverInstance {

	@Test(dataProvider="Data")
	 public void tc_001_validateLoginFunctionality(String uname, String pass) throws Exception {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickLoginin();
		 
	 }
	
	@DataProvider(name = "Data")
	public Object[][] testDataGenerator() {
		
		Object[][] data = {{"Uname1","pass1"}, {"Uname2","pass2"}, {"Uname3","pass3"}};
		return data;
	}
}
