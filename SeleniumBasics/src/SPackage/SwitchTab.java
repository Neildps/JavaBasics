package SPackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchTab {

	 public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      
	      driver.manage().window().maximize();
	      driver.get("https://cqa.biolytica.io");
	      // wait of 5 seconds
	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	      
	      System.out.println("opened the URL");
	      
	      driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ndas@biolytica.com");
	      driver.findElement(By.xpath("//input[2][@name='password']")).sendKeys("Test@1234");
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      
	      System.out.println("logged in to clinician.");
	      
	      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/my-clients']")));
	      WebElement clients = driver.findElement(By.xpath("//a[@href='/my-clients']"));
	      new Actions(driver).keyDown(Keys.CONTROL).click(clients).perform();
	            
	      System.out.println("Opened in new tab");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      
	      
	      // hold all window handles in array list
	      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	      System.out.println("Page title of new tab: " + driver.getTitle());
	      //switch to parent window
	      driver.switchTo().window(newTb.get(0));
	      System.out.println("Page title of parent window: " + driver.getTitle());
	      
	      driver.get("https://cqa.biolytica.io");
	      
	      
	   }

}
