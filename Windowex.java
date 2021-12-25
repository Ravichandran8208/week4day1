package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowex {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.id("home")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> handles2 =new ArrayList<String>(handles);
		driver.switchTo().window(handles2.get(1));
		driver.close();
		driver.switchTo().window(handles2.get(0));
		
		
		
		
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> handles3 = driver.getWindowHandles();
		List<String> handles4=new ArrayList<String>(handles3);
		
		driver.switchTo().window(handles4.get(2));
		System.out.println(handles4.size());
		driver.close();
		//driver.switchTo().window(handles4.get(0));
		
		
		driver.switchTo().window(handles4.get(1));
		System.out.println(handles4.size());
		driver.close();
		driver.switchTo().window(handles2.get(0));
		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
		Set<String> set = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(0));
		driver.close();
		driver.quit();
		
		

	

	}

	private static WindowType handles(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


