/**
 * 
 */
/**
 * 
 */
module DataDrivenSeleniumFramework {
	requires org.seleniumhq.selenium.api;
	requires org.seleniumhq.selenium.chrome_driver;
	requires org.seleniumhq.selenium.firefox_driver;
	requires org.seleniumhq.selenium.ie_driver;
	requires org.testng;
	exports org.automation.testingworld.testcases to org.testng;
	exports org.automation.testingworld.base to org.testng;
}