package week4day1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame2 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement ok = driver.findElement(By.id("Click"));
		ok.click();
		File file = driver.getScreenshotAs(OutputType.FILE);
		File img=new File("./sc/snap.png");
		FileUtils.copyFile(file, img);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());

	}

}
