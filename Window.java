package week4day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get(" https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> wh=driver.getWindowHandles();
		List <String> h= new ArrayList<String>(wh);
		driver.switchTo().window(h.get(1));
		driver.close();
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		

		
	}

}
