package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();;
		 org.openqa.selenium.Alert alert=  driver.switchTo().alert();
		 alert.sendKeys("Ravi");
		 alert.accept();
		 String string = driver.findElement(By.xpath("//p[text()='Hello Ravi! How are you today?']")).getText();
		System.out.println(string);
		boolean contains = driver.getPageSource().contains(string);
		System.out.println(contains);
		driver.close();
		
		
		
		
		 
		

	}

}
