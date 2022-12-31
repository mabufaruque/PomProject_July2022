package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testing.Assert;

public class AddCustomerPage {
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"page-wrapper\\\"]/div[1]/div/div/div/div[1]/h5")WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"account\\\"]5")WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")WebElement PHONE_ELEMENT;
	
	public void verifyAddContactPage(String addContactHeaderText) {
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), "addContactHeaderText", "Wrong page!!");
		
	}
	
	public void insertFullName(String fullName) {
		FULL_NAME_ELEMENT.sendKeys(fullName);
		
	}
	
	public void selectCompany(String company) {
		Select sel = new Select(COMPANY_ELEMENT);
		sel.selectByVisibleText(company);
	}

}
