package com.cg.project.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page(){
		System.setProperty("webdriver.chrome.driver","E:\\New web page\\New folder\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://github.com/login");
	  
	}
	@When("^title of login page is Free CRM \"([^\"]*)\"$")
	public void title_of_login_page_is_Free_CRM(String string) throws Throwable {
		WebElement searchBox = driver.findElement(By.name("login"));
		   searchBox.sendKeys(string);
	}

//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM(String string){
//		WebElement searchBox = driver.findElement(By.name("login"));
//		   searchBox.sendKeys(string);
//	    
//	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password){
		driver.findElement(By.name("login")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
	    //String username, String password
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn =
				 driver.findElement(By.name("commit"));
				 //driver.findElement(By.xpath("//input[@type='commit']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", loginBtn);
	    
	}
	@Then("^user is on home page \"([^\"]*)\"$")
	public void user_is_on_home_page(String arg1) throws Throwable {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(arg1);
	}

//	@Then("^user is on home page$")
//	public void user_is_on_home_page(){
//		WebElement searchBox = driver.findElement(By.name("login"));
//		   searchBox.sendKeys(string);
//		String text = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/main/div[1]/div/div/div/h3" .getText();
//		Assert.assertEquals("Learn Git and GitHub without any code!", text);
////		String titleElem = driver.findElement(By.xpath("//*[@class='text-normal']/h3")).getAttribute("innerHTML”);
/////html/body/div[4]/div/div/div/div/div/main/div[1]/div/div/div/h3   //div[contains(@class,'text-normal')]/h3"))
////				assertEquals("Learn Git and GitHub without any code!", titleElem);
	    
	//}

	@Then("^Close the browser$")
	public void close_the_browser(){
		driver.quit();
		driver=null;
	}
	

}
