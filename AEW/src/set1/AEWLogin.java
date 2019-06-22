package set1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Locatable;

import com.sun.glass.ui.Pixels;
import com.sun.glass.ui.Robot;

public class AEWLogin {
	WebDriver driver;
	@Test
	public void logintoAEW() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WS\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.235.34.233/qa/workflowadmin.asp?PROCESS=LOGIN&NOSSO=true");
		driver.navigate();
		driver.manage().window().maximize();
		driver.findElement(By.id("txt_username")).sendKeys("aeeswar");
		driver.findElement(By.id("usernamevalidate")).click();
		driver.findElement(By.id("txt_password")).sendKeys("Password1");
		driver.findElement(By.className("tdloginclick")).click();
		Thread.sleep(10000);
		driver.switchTo().frame("GADGET_FRAME").switchTo().frame("toolbar");
		Actions ma = new Actions(driver);
		ma.moveToElement(driver.findElement(By.xpath("//table[@class='toolbartable']//tr[@id='menutable']//td[text()='Tasks']"))).build().perform();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("GADGET_FRAME").switchTo().frame("menu");
		driver.findElement(By.xpath("//table[@id='submenutable']//td[text()='All Entities']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("GADGET_FRAME").switchTo().frame("navframe");
		expandElement(driver.findElement(By.xpath("//*[@id='noderoot']//a[text()='Thomson Reuters']//ancestor::li[1]")));
		Thread.sleep(3000);
		expandElement(driver.findElement(By.xpath("//*[@id='noderoot']//a[text()='Aravindh_test']//ancestor::li[1]")));
	}
	public void expandElement(WebElement WE)
	{
		Actions mouseAction = new Actions(driver);
		int width = WE.getSize().getWidth();
		mouseAction.moveToElement(WE).moveByOffset((width/2)-2, 0).click().perform();
	}
}
