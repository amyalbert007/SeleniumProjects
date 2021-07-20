package com.cg.project.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.factory.DriverFactory;
import com.cg.project.pagebean.ConferenceRegPageBean;
//import junit.framework.Assert;
import com.cg.project.pagebean.PaymentDetails;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDef {
	private ConferenceRegPageBean pageBean;
	private PaymentDetails pageBean1;
	private WebDriver driver;
	
	@Before
	public void setupScenarioEnv() {
		driver = DriverFactory.getDriver();
		pageBean = PageFactory.initElements(driver, ConferenceRegPageBean.class);
		pageBean1 = PageFactory.initElements(driver, PaymentDetails.class);
	}
	
//	@Given("User is open Conference booking page")
//	public void user_is_open_Conference_booking_page() {
//		driver.get("file:///E:/New%20web%20page/New%20folder/ConferenceBooking/ConferenceRegistartion.html");
//	    
//	}
//	@Then("User is on Registration page")
//	public void user_is_on_registration_page() {
//		String title = driver.getTitle();
//		 System.out.println(title);
//		 Assert.assertEquals("Conference Registartion", title);
//	}
//	public String getUsername() {
//		return login.getText();
//	}
//
//	public void setUsername(String username) {
//		this.login.sendKeys(username);
//	}
//	@When("User enters all details")
//	public void user_enters_all_details() {
//		pageBean.setFirstName("Amit");
//		pageBean.setLastName("Kumar");
//		pageBean.setEmail("amit@gmail.com");
//		pageBean.setContactNo("7717788503");
//		pageBean.setPeopleAttending("3");
//		pageBean.setAddress1("Deoghar,Jharkhand");
//		pageBean.setAddress2("India");
//		pageBean.setCity("Bangalore");
//		pageBean.setstate("Karnatka");
//		WebElement radio=driver.findElement(By.name("memberStatus"));
//		radio.click();
//		pageBean.signIn();
//	}
	
	
	
	
	
//	@Then("User goes on payment page")
//	public void user_goes_on_payment_page() {
//		//driver = new ChromeDriver();
//		driver.get("file:///E:/New%20web%20page/New%20folder/ConferenceBooking/PaymentDetails.html");
//		pageBean.setFirstName("Amit");
//		pageBean.setLastName("Kumar");
////		pageBean1.setCardNo("78984568123");
//	}
//	
//	@Then("User is on payment page")
//	public void user_is_on_payment_page() {
//		String title = driver.getTitle();
//		 System.out.println(title);
//		 Assert.assertEquals("Payment Details", title);
//	}
//	@Then("User enters all payment details")
//	public void user_enters_all_payment_details() {
//		pageBean1.setdebit("78984568123");
//		pageBean1.setCvv("524");
//		pageBean1.setMonth("january");
//		pageBean1.setYear("2025");
//		//pageBean1.Register();
//	    
//	}
	@Given("User  should on Registration page")
	public void user_should_on_Registration_page() {
		driver.get("file:///E:/New%20web%20page/New%20folder/ConferenceBooking/ConferenceRegistartion.html");
	    
	}
	@Then("User is on Registration page")
	public void user_is_on_registration_page() {
		String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("Conference Registartion", title);
	}
//	@When("U")
	

//	@When("User enters all details1")
//	public void user_enters_all_details1() {
//		pageBean.setFirstName("Amit");
//		pageBean.setLastName("Kumar");
//		pageBean.setEmail("amit@gmail.com");
//		pageBean.setContactNo("7717788503");
//		pageBean.setPeopleAttending("3");
//		pageBean.setAddress1("Deoghar,Jharkhand");
//		pageBean.setAddress2("India");
//		pageBean.setCity("Bangalore");
//		pageBean.setstate("Karnatka");
//		WebElement radio=driver.findElement(By.name("memberStatus"));
//		radio.click();
//		pageBean.signIn();
//	}

	@When("User select Next without filling FirstName")
	public void user_select_without_filling() {
		pageBean.Click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	    
	}
	@When("User select Next without filling LastName in Registration")
	public void user_select_Next_without_filling_LastName_in_Registration() {
		pageBean.setFirstName("AmitK");
		pageBean.Click();
		Alert alert01 = driver.switchTo().alert();
		System.out.println(alert01.getText());
		alert01.accept();
	}
//	@When("User select Next without filling LastName.")
//	public void user_select_Next_without_filling_LastName_in_Registration() {
//		pageBean.setFirstName("AmitK");
//		pageBean.Click();
//		Alert alert01 = driver.switchTo().alert();
//		System.out.println(alert01.getText());
//		alert01.accept();
//	}
	
	@When("User select Next without filling LastName")
	public void user_select_Next_without_filling_LastName() {
		pageBean.setFirstName("Amit");
		pageBean.Click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
	}
	
	@When("User select Next without filling Email")
	public void user_select_Next_without_filling_Email() {
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
		pageBean.Click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
	    
	}
	
	@When("User select Next on filling invalid email")
	public void user_select_Next_on_filling_invalid_email() {
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
		pageBean.setEmail("amitgmail.com");
		pageBean.Click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.accept();
		
	    
	}
	@When("User select Next without filling contact")
	public void user_select_Next_without_filling_contact() {
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
		pageBean.setEmail("amit@gmail.com");
		pageBean.Click();
		Alert alert4 = driver.switchTo().alert();
		System.out.println(alert4.getText());
		alert4.accept();
	    
	}

	@When("User select Next on filling invalid contact")
	public void user_select_Next_on_filling_invalid_contact() {
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
		pageBean.setEmail("amit@gmail.com");
		pageBean.setContactNo("771778850");
		pageBean.Click();
		Alert alert5 = driver.switchTo().alert();
		System.out.println(alert5.getText());
		alert5.accept();
	    
	}

	@When("User select Next without selecting Number of people attending")
	public void user_select_Next_without_selecting_Number_of_people_attending() {
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
		pageBean.setEmail("amit@gmail.com");
		pageBean.setContactNo("7717788503");
		pageBean.Click();
		Alert alert6 = driver.switchTo().alert();
		System.out.println(alert6.getText());
		alert6.accept();
	    
	}

	@When("User select Next without filling Building Name & Room No")
	public void user_select_Next_without_filling_Building_Name_Room_No() {
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
		pageBean.setEmail("amit@gmail.com");
		pageBean.setContactNo("7717788503");
		pageBean.setPeopleAttending("3");
		pageBean.Click();
		Alert alert7 = driver.switchTo().alert();
		System.out.println(alert7.getText());
		alert7.accept();
	    
	}

	@When("User select Next without filling Area Name")
	public void user_select_Next_without_filling_Area_Name() {
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
		pageBean.setEmail("amit@gmail.com");
		pageBean.setContactNo("7717788503");
		pageBean.setPeopleAttending("3");
		pageBean.setAddress1("Shyam Complex,400");
		pageBean.Click();
		Alert alert8 = driver.switchTo().alert();
		System.out.println(alert8.getText());
		alert8.accept();
	   
	}

	@When("User select Next without selecting City")
	public void user_select_Next_without_selecting_City() {
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
		pageBean.setEmail("amit@gmail.com");
		pageBean.setContactNo("7717788503");
		pageBean.setPeopleAttending("3");
		pageBean.setAddress1("Shyam Complex,400");
		pageBean.setAddress2("Kalyani");
		pageBean.Click();
		Alert alert9 = driver.switchTo().alert();
		System.out.println(alert9.getText());
		alert9.accept();
	    
	}

	@When("User select Next without selecting State")
	public void user_select_Next_without_selecting_State() {
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
		pageBean.setEmail("amit@gmail.com");
		pageBean.setContactNo("7717788503");
		pageBean.setPeopleAttending("3");
		pageBean.setAddress1("Shyam Complex,400");
		pageBean.setAddress2("Kalyani");
		pageBean.setCity("Bangalore");
		pageBean.Click();
		Alert alert10 = driver.switchTo().alert();
		System.out.println(alert10.getText());
		alert10.accept();
	    
	}

	@When("User select Next without selecting Membership Status")
	public void user_select_Next_without_selecting_Membership_Status() {
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
		pageBean.setEmail("amit@gmail.com");
		pageBean.setContactNo("7717788503");
		pageBean.setPeopleAttending("3");
		pageBean.setAddress1("Shyam Complex,400");
		pageBean.setAddress2("Kalyani");
		pageBean.setCity("Bangalore");
		pageBean.setstate("Karnatka");
		pageBean.Click();
		Alert alert11 = driver.switchTo().alert();
		System.out.println(alert11.getText());
		alert11.accept();
	    
	}


	@Then("{string} message will display")
	public void message_will_display(String string) {
		pageBean.Click();
		Alert alert = driver.switchTo().alert();
		//String str = "Please fill the First Name";
		//String str1 = "Please fill the First";
		Assert.assertEquals(alert.getText(),string);
		//Assert.assertEquals(alert.getText(),str1);
		
		Alert alert01 = driver.switchTo().alert();
		Assert.assertEquals(alert01.getText(),string);
		
		Alert alert1 = driver.switchTo().alert();
		Assert.assertEquals(alert1.getText(),string);
		
		Alert alert2 = driver.switchTo().alert();
		Assert.assertEquals(alert2.getText(),string);
		
		Alert alert3 = driver.switchTo().alert();
		Assert.assertEquals(alert3.getText(),string);
		
		Alert alert4 = driver.switchTo().alert();
		Assert.assertEquals(alert4.getText(),string);
		
		Alert alert5 = driver.switchTo().alert();
		Assert.assertEquals(alert5.getText(),string);
		
		Alert alert6 = driver.switchTo().alert();
		Assert.assertEquals(alert6.getText(),string);
		
		Alert alert7 = driver.switchTo().alert();
		Assert.assertEquals(alert7.getText(),string);
		
		Alert alert8 = driver.switchTo().alert();
		Assert.assertEquals(alert8.getText(),string);
		
		Alert alert9 = driver.switchTo().alert();
		Assert.assertEquals(alert9.getText(),string);
		
		Alert alert10 = driver.switchTo().alert();
		Assert.assertEquals(alert10.getText(),string);
		
		Alert alert11 = driver.switchTo().alert();
		Assert.assertEquals(alert11.getText(),string);
	}
	
	
	@When("User enters all details")
	public void user_enters_all_details() {
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
		pageBean.setEmail("amit@gmail.com");
		pageBean.setContactNo("7717788503");
		pageBean.setPeopleAttending("3");
		pageBean.setAddress1("Deoghar,Jharkhand");
		pageBean.setAddress2("India");
		pageBean.setCity("Bangalore");
		pageBean.setstate("Karnatka");
		WebElement radio=driver.findElement(By.name("memberStatus"));
		radio.click();
		pageBean.signIn();
	}
	@Then("User goes on payment page")
	public void user_goes_on_payment_page() {
		//driver = new ChromeDriver();
		driver.get("file:///E:/New%20web%20page/New%20folder/ConferenceBooking/PaymentDetails.html");
		pageBean.setFirstName("Amit");
		pageBean.setLastName("Kumar");
//		pageBean1.setCardNo("78984568123");
	}
	
	@Then("User is on payment page")
	public void user_is_on_payment_page() {
		String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("Payment Details", title);
	}
	@Then("User enters all payment details")
	public void user_enters_all_payment_details() {
		pageBean1.setdebit("78984568123");
		pageBean1.setCvv("524");
		pageBean1.setMonth("january");
		pageBean1.setYear("2025");
		pageBean1.Click();
		Alert alert12 = driver.switchTo().alert();
		System.out.println(alert12.getText());
		alert12.accept();
		//pageBean1.Register();
	    
	}
	@Then("message {string} is displayed")
	public void message_is_displayed(String string) {
		pageBean1.Click();
		Alert alert12 = driver.switchTo().alert();
		//String str = "Please fill the First Name";
		//String str1 = "Please fill the First";
		Assert.assertEquals(alert12.getText(),string);
		//Assert.assertEquals(alert.getText(),str1);}
	}
	
	@After
	public void tearDownScenarioEnv(Scenario scenario) {
//		if(scenario.isFailed()) {
//			TakesScreenshot screenshot = (TakesScreenshot)driver;
//			byte [] screenShotData = screenshot.getScreenshotAs(OutputType.BYTES);
//			scenario.embed(screenShotData, "image/png" ,"");
//		}
		driver.quit();
		driver=null;
		
	}
	

}
