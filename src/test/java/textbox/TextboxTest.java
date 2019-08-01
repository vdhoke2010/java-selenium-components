package textbox;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextboxTest {

	@Test
	public void verifyTextBox() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_my\\cucumber-java-vibhay\\java-selenium-command\\java-selenium-components\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
//		System.out.println("hellow to selenium");
		By byName = By.name("userName");
		
		WebElement element = driver.findElement(byName);
		
		element.sendKeys("satya");
		
	}
}
