package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends PageObject{

	@FindBy(id="login-form-email")
	WebElement email;
	
	@FindBy(id="login-pass")
	WebElement pass;
	
	@FindBy(className="v-btn__content")
	WebElement loginBtn;
	
	@FindBy(className="v-icon v-icon--link material-icons")
	WebElement passVisibilityButton;
	
	public LogInPage(WebDriver driver) {
		super(driver);
	}

	public void fillInputs(String email, String pass) {
		this.email.clear();
		this.email.clear();
		this.email.sendKeys(email);
		
		this.pass.clear();
		this.pass.clear();
		this.pass.sendKeys(pass);
	}
	
	//nisam iskoristila
	public void klikNaVisibilityButton() {
		passVisibilityButton.click();
	}
	
	public void klikNaLogin() {
		loginBtn.click();
	}
	
	public boolean isAt() {
		return email.isDisplayed();
	}
	
	public boolean isButtonPresent() {
		return loginBtn.isDisplayed();
	}
}
