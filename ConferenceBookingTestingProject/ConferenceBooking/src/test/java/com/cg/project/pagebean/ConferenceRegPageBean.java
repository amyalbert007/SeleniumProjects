package com.cg.project.pagebean;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class ConferenceRegPageBean {
	@FindBy(how = How.NAME, name="txtFN")
	private WebElement FirstName;
	
	@FindBy(how = How.NAME, name="txtLN")
	private WebElement LastName;
	
	@FindBy(how = How.NAME, name="Email")
	private WebElement Email;
	
	@FindBy(how = How.NAME, name="Phone")
	private WebElement ContactNo;
	
	
	@FindBy(how = How.ID_OR_NAME, name="size")
	private WebElement PeopleAttending;
	
	@FindBy(how = How.ID_OR_NAME, id="txtAddress1")
	private WebElement Address1;
	
	@FindBy(how = How.ID_OR_NAME, id="txtAddress2")
	private WebElement Address2;
	
	@FindBy(how = How.NAME, name="city")
	private WebElement City;
	
	@FindBy(how = How.NAME, name="state")
	private WebElement state;
	
	@FindBy(how= How.XPATH, xpath="/html/body/form/table/tbody/tr[14]/td/a")
	private WebElement submit;
	
	public void signIn() {
		submit.submit();;
	}
	public void Click() {
		submit.click();
	}
	
	public String getstate() {
		return state.getText();
	}
	public void setstate(String city) {
		this.state.sendKeys(city);
	}
	
	
	
	
	
	
	
	public String getCity() {
		return City.getText();
	}
	public void setCity(String city) {
		this.City.sendKeys(city);
	}
	
	public String getAddress2() {
		return Address2.getText();
	}
	public void setAddress2(String address) {
		this.Address2.sendKeys(address);
	}
	
	public String getAddress1() {
		return Address1.getText();
	}
	public void setAddress1(String address) {
		this.Address1.sendKeys(address);
	}
//	public String getUsername() {
//		return login.getText();
//	}
//
//	public void setUsername(String username) {
//		this.login.sendKeys(username);
//	}
	public String getPeopleAttending() {
		return PeopleAttending.getText();
	}
	public void setPeopleAttending(String PeopleAttending) {
		this.PeopleAttending.sendKeys(PeopleAttending);
	}

	public String getContactNo() {
		return ContactNo.getText();
	}

	public void setContactNo(String contactNo) {
		this.ContactNo.sendKeys(contactNo);
	}

	public String getEmail() {
		return Email.getText();
	}

	public void setEmail(String email) {
		this.Email.sendKeys(email);
	}

	public String getFirstName() {
		return FirstName.getText();
	}

	public void setFirstName(String firstName) {
		this.FirstName.sendKeys(firstName);
	}

//	public WebElement getLastName() {
//		return LastName;
//	}
//
//	public void setLastName(WebElement lastName) {
//		LastName = lastName;
//	}
	public String getLastName() {
		return LastName.getText();
	}

	public void setLastName(String lastName) {
		this.LastName.sendKeys(lastName);
	}
	
	
//	@FindBy(how = How.XPATH,xpath = "/html/body/form/table/tbody")
//	private WebElement errorMsg;
//
//	public String getErrorMsg() {
//		return errorMsg.getText();
//	}
	
	
	

	
	

}
