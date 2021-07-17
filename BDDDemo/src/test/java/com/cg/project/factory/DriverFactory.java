package com.cg.project.factory;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverFactory {
  public static WebDriver getDriver() {
		
		//1st Step
		System.setProperty("webdriver.chrome.driver", "E:\\New web page\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		// 2nd Step
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		return driver;
	}

}
