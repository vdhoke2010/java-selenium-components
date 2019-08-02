package flightfinder;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyRadioButton {

	@Test
	public void selectRadiobutton() {

		System.setProperty("WebDeriver.Chrome.driver",
				"/java-selenium-components/src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
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
			} 
		else {
		System.out.println("wait");
	
			}

	}

}
