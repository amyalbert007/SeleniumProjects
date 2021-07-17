package com.cg.project.stepdefs;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cg.project.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSearchStepDef {
	
private WebDriver driver;
	
	@Before
	public void setupScenarioEnv() {
		driver = DriverFactory.getDriver();
	}
	
	
	@Given("User should open Google Home Page")
	public void user_should_open_Google_Home_Page() {
	    driver.get("https://www.google.co.in");
	}

	@When("User entered {string} in search box")
	public void user_entered_in_search_box(String string) {
	   WebElement searchBox = driver.findElement(By.name("q"));
	   searchBox.sendKeys(string);
	}

	@When("click on submit button")
	public void click_on_submit_button() {
	   WebElement submitBtn = driver.findElement(By.name("btnK"));
	   submitBtn.submit();
	}

	@Then("Multiple Links should be displayed on {string} topic")
	public void multiple_Links_should_be_displayed_on_topic(String string) {
	   String expectedTitle = string+" - Google Search";
	   String actualTitle = driver.getTitle();
	   Assert.assertEquals(expectedTitle, actualTitle);
	}


	
	@Then("google should display map between {string} and also display the distance in KM")
	public void google_should_display_map_between_and_also_display_the_distance_in_KM(String string) {
	   
	}

	@Given("User should open Google translate page")
	public void user_should_open_Google_translate_page() {
	   
	}

	@When("User entered {string} into {string} language and select {string} language")
	public void user_entered_into_language_and_select_language(String string, String string2, String string3) {
	    
	}

	@Then("Google translator should display {string} into {string} language")
	public void google_translator_should_display_into_language(String string, String string2) {
	   
	}

	@After
	public void tearDownScenarioEnv() {
		driver.quit();
		driver=null;
	}


}
