package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicesPage extends PageObject {

	@FindBy(id="home-page-user")
	WebElement userInvoices;
	
	public InvoicesPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isUserPresent() {
		return userInvoices.isDisplayed();
	}

	@FindBy(xpath="//*[@id=\"app\"]/div[18]/main/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/label")
	WebElement clientChoose;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[18]/main/div/div/div[1]/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div[1]/div/label")
	WebElement fromDate;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[18]/main/div/div/div[1]/div/div[2]/div/div/div[4]/div/div[1]/div/div[2]/div[1]/div/label")
	WebElement toDate;
	
	@FindBy(xpath="//*[@id=\"filter-period\"]/div/i")
	WebElement months;
	
	@FindBy(xpath="//*[@id=\"filter-reset\"]/div/i")
	WebElement resetDates;
	
	@FindBy(xpath="//*[@id=\"add-new-invoice\"]/div")
	WebElement addNewInvoice;
	
}
