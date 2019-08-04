package flightfinder;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyRadioButton {

	@Test
	public void selectRadiobutton() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_my\\cucumber-java-vibhay\\java-selenium-command\\java-selenium-components\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement element;
		element = driver.findElement(By.name("userName"));
		element.sendKeys("satya");
		element = driver.findElement(By.name("password"));
		element.sendKeys("satya");
		element = driver.findElement(By.name("login"));
		element.click();

		element = driver.findElement(By.xpath(".//img[@src='/images/masts/mast_flightfinder.gif']"));

		if (element.isDisplayed() == true) {
			element = driver.findElement(By.xpath(".//input[@value='oneway']"));
			element.click();
		} else {
			System.out.println("wait");
		}
		element = driver.findElement(By.xpath(".//select[@name='passCount']/option[@value='2']"));
		element.click();
		// select Port of travel
		element = driver.findElement(By.xpath(".//select[@name='fromPort']/option[@value='Frankfurt']"));
		element.click();
		// select month of travel
		element = driver.findElement(By.xpath(".//select[@name='fromMonth']/option[@value='10']"));
		element.click();
		// select date of travel
		element = driver.findElement(By.xpath(".//select[@name='fromDay']/option[@value='14']"));
		element.click();
		// select arriving Port of travel
		element = driver.findElement(By.xpath(".//select[@name='toPort']/option[@value='London']"));
		element.click();
		// select To month of travel
		element = driver.findElement(By.xpath(".//select[@name='toMonth']/option[@value='2']"));
		element.click();
		// Select Return date
		element = driver.findElement(By.xpath(".//select[@name='toDay']/option[@value='6']"));
		element.click();
		// Select Preferences:
		element = driver.findElement(By.xpath(".//input[@value='Business']"));
		element.click();

		element = driver.findElement(By.xpath(".//select[@name='airline']"));
		element.click();
		// Click on "Continue button"
		element = driver.findElement(By.xpath(".//input[@name='findFlights']"));
		element.click();

		// Select Depart flight
		element = driver.findElement(By.xpath(".//input[@value='Pangea Airlines$362$274$9:17']"));
		element.click();

		// Select return flight
		element = driver.findElement(By.xpath(".//input[@value='Blue Skies Airlines$631$273$14:30']"));
		element.click();

		element = driver.findElement(By.xpath(".//input[@name='reserveFlights']"));
		element.click();

		// Book A flight page
		// Passenger 1 details entered
		element = driver.findElement(By.name("passFirst0"));
		element.sendKeys("Smith");
		element = driver.findElement(By.name("passLast0"));
		element.sendKeys("John");
		element = driver.findElement(By.xpath(".//select[@name='pass.0.meal']/option[@value='KSML']"));
		element.click();
		// Passenger 2 details entered
		element = driver.findElement(By.name("passFirst1"));
		element.sendKeys("Smith");
		element = driver.findElement(By.name("passLast1"));
		element.sendKeys("John");
		element = driver.findElement(By.xpath(".//select[@name='pass.0.meal']/option[@value='MOML']"));
		element.click();

		// Credit Card
		// Credit card type selected
		element = driver.findElement(By.xpath(".//select[@name='creditCard']/option[@value='BA']"));
		element.click();

		// Credit card number entered
		element = driver.findElement(By.name("creditnumber"));
		element.sendKeys("4444333322221111");

		// Selected Expiry month
		element = driver.findElement(By.xpath(".//select[@name='cc_exp_dt_mn']/option[01]"));
		element.click();

		// selected Expiry year
		element = driver.findElement(By.xpath(".//select[@name='cc_exp_dt_yr']/option[@value='2010']"));
		element.click();

		// FirstName and LastName
		element = driver.findElement(By.name("cc_frst_name"));
		element.sendKeys("Simth");

		element = driver.findElement(By.name("cc_last_name"));
		element.sendKeys("John");

		// Billing Address

		element = driver.findElement(By.name("billAddress1"));
		element.clear();

		element = driver.findElement(By.name("billAddress1"));
		element.sendKeys("1325 Borregas Ave.");

		element = driver.findElement(By.xpath(".//input[@name='billState']"));
		element.clear();

		element = driver.findElement(By.xpath(".//input[@name='billState']"));
		element.sendKeys("CA");

		element = driver.findElement(By.name("billCity"));
		element.clear();

		element = driver.findElement(By.name("billCity"));
		element.sendKeys("Sunnyvale");

		element = driver.findElement(By.name("billZip"));
		element.clear();

		element = driver.findElement(By.name("billZip"));
		element.sendKeys("94089");

		element = driver.findElement(By.xpath(".//input[@name='buyFlights']"));
		element.click();
		
		// Secure Purchase button
		element = driver.findElement(By.name("buyFlights"));
		element.click();

		// element= driver.findElement(By.xpath(".//input[@name='buyFlights']"));
		// element.click();

		driver.close();
		driver.quit();
	}

}
