package week4day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
	
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		alert.sendKeys("TestLeaf");
		System.out.println(alert.getText());
		alert.accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
	System.out.println(alert.getText());
		alert.accept();
				

	}

}
