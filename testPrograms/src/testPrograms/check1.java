package testPrograms;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;

public class check1 {
WebDriver driver;
	@Test
	public void gmailaccount() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WS\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.getTitle();
		driver.getCurrentUrl();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

}
