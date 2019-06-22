package testPrograms;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class login {
	public WebDriver Cdriver,iedriver;
	@Test
	public void a() throws InterruptedException {
		//Cdriver = new ChromeDriver();
		System.setProperty("webdriver.ie.driver", "C:\\Selenium WS\\SeleniumJars\\IEDriverServer.exe");
		iedriver = new InternetExplorerDriver();
		//iedriver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		iedriver.get("https://demo.gofileroom.com");
		iedriver.manage().window().maximize();
		//System.out.println("Title: "+iedriver.getTitle());
		//System.out.println("Form title: "+iedriver.findElement(By.className("gfr-product-name")).getText());
		//System.out.println("Login id field default text: "+iedriver.findElement(By.id("txtLogin")).getAttribute("placeholder"));
		EnterUserName();
		gfrclose();
	}
	public void EnterUserName() throws InterruptedException
	{
		WebDriverWait newwait = new WebDriverWait(iedriver, 10);
		newwait.until(ExpectedConditions.elementToBeClickable(By.id("txtLogin")));
		iedriver.findElement(By.id("txtLogin")).clear();
		iedriver.findElement(By.id("txtLogin")).sendKeys("ravisankar.yellajosyula@thomsonreuters.com");
	}
	public void gfrclose()
	{
		iedriver.close();
	}

}
