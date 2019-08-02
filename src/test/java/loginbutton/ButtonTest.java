package loginbutton;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTest {

	@Test
	public void verifyButton() {
		
		System.setProperty("webDrvier.chrome.driver",
				"C:\\Java_my\\cucumber-java-vibhay\\java-selenium-command\\java-selenium-components\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@name='login'])"));
		driver.close();
	driver.quit();
	}
		
}
