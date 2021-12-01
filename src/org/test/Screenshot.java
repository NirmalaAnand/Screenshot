package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static WebDriver driver;
	public static void takeScreenshot(String name) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\TakeScreenshot\\screenshot"+name+".jpg");
		FileUtils.copyFile(source, f);
		
		

	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\TakeScreenshot\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		takeScreenshot("Greensmain Page");
		
		driver.findElement(By.xpath("//a[text()='Certifications']")).click();
		takeScreenshot("Certifications");
		
		
		
		
		
	}

}
