package com.cg.project.pagebean;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class PaymentDetails {
	
	@FindBy(how = How.NAME, name="debit")
	private WebElement debit;
	
	@FindBy(how = How.NAME, name="cvv")
	private WebElement cvv;
	
	@FindBy(how = How.NAME, name="month")
	private WebElement month;
	
	@FindBy(how = How.NAME, name="year")
	private WebElement year;
	
	@FindBy(how= How.XPATH, xpath="/html/body/form/table/tbody/tr[7]/td/input")
	private WebElement register;
	
	
	public void Register() {
		register.submit();
	}
	public void Click() {
		register.click();
	}
//	public String getstate() {
//		return state.getText();
//	}
//	public void setstate(String city) {
//		this.state.sendKeys(city);
//	}

	public String getdebit() {
		return debit.getText();
	}

	public void setdebit(String cardNo) {
		this.debit.sendKeys(cardNo);
	}

	public String getCvv() {
		return cvv.getText();
		
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}

	public String getMonth() {
		return month.getText();
	}

	public void setMonth(String month) {
		this.month.sendKeys(month);
	}

	public String getYear() {
		return year.getText();
	}

	public void setYear(String year) {
		this.year.sendKeys(year);
	}
	
	

}
