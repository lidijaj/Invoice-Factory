package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InvoicesPage;
import pages.LogInPage;

public class LogInTest extends InitTest {
	
	@Test (priority=0)
	public void correctUsernameIncorrectPasswordLessThan6char() {
		
		LogInPage logIn = new LogInPage(driver);
				
		driver.get("http://app.invoice-factory.source-code.rs");
		Assert.assertTrue(logIn.isAt());
		
		logIn.fillInputs("lidijajovanovic88@gmail.com", "qwe");
		logIn.klikNaLogin();
		
		Assert.assertTrue(logIn.isButtonPresent());
	}
	
	@Test (priority=1)
	public void correctUsernameIncorrectPassword6char() {
	
		LogInPage logIn = new LogInPage(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		Assert.assertTrue(logIn.isAt());
		
		logIn.fillInputs("lidijajovanovic88@gmail.com", "qwe124");
		logIn.klikNaLogin();
		
		Assert.assertTrue(logIn.isButtonPresent());
	}
	
	@Test (priority=2)
	public void incorrectUsernameCorrectPassword() {
	
		LogInPage logIn = new LogInPage(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		Assert.assertTrue(logIn.isAt());
		
		logIn.fillInputs("lidijajovanovic88@mail.com", "qwe123");
		logIn.klikNaLogin();
		
		Assert.assertTrue(logIn.isButtonPresent());
	}
	
	@Test (priority=3)
	public void incorrectUsernameIncorrectPasswordLessThan6char() {
	
		LogInPage logIn = new LogInPage(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		Assert.assertTrue(logIn.isAt());
		
		logIn.fillInputs("lidijajovanovic88@mail.com", "qwe");
		logIn.klikNaLogin();
		
		Assert.assertTrue(logIn.isButtonPresent());
	}
	
	@Test (priority=4)
	public void incorrectUsernameIncorrectPassword6char() {
	
		LogInPage logIn = new LogInPage(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		Assert.assertTrue(logIn.isAt());
		
		logIn.fillInputs("lidijajovanovic88@mail.com", "qwe124");
		logIn.klikNaLogin();
		
		Assert.assertTrue(logIn.isButtonPresent());
	}
	
	@Test (priority=5)
	public void blankUsernameCorrectPassword() {
	
		LogInPage logIn = new LogInPage(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		Assert.assertTrue(logIn.isAt());
		
		logIn.fillInputs("", "qwe123");
		logIn.klikNaLogin();
		
		Assert.assertTrue(logIn.isButtonPresent());
	}
	
	@Test (priority=6)
	public void blankUsernameIncorrectPassword() {
	
		LogInPage logIn = new LogInPage(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		Assert.assertTrue(logIn.isAt());
		
		logIn.fillInputs("", "qwe124");
		logIn.klikNaLogin();
		
		Assert.assertTrue(logIn.isButtonPresent());
	}
	
	@Test (priority=7)
	public void correctUsernameBlankPassword() {
	
		LogInPage logIn = new LogInPage(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		Assert.assertTrue(logIn.isAt());
		
		logIn.fillInputs("lidijajovanovic88@gmail.com", "");
		logIn.klikNaLogin();
		
		Assert.assertTrue(logIn.isButtonPresent());
	}
	
	@Test (priority=8)
	public void incorrectUsernameBlankPassword() {
	
		LogInPage logIn = new LogInPage(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		Assert.assertTrue(logIn.isAt());
		
		logIn.fillInputs("lidijajovanovic88@mail.com", "");
		logIn.klikNaLogin();
		
		Assert.assertTrue(logIn.isButtonPresent());
	}
	
	@Test (priority=9)
	public void blankUsernameBlankPassword() {
	
		LogInPage logIn = new LogInPage(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		Assert.assertTrue(logIn.isAt());
		
		logIn.fillInputs("", "");
		logIn.klikNaLogin();
		
		Assert.assertTrue(logIn.isButtonPresent());
	}
		
	@Test (priority=10)
	public void correctUsernameCorrectPassword() {
	
		LogInPage logIn = new LogInPage(driver);
		InvoicesPage home = new InvoicesPage(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		Assert.assertTrue(logIn.isAt());
		
		logIn.fillInputs("lidijajovanovic88@gmail.com", "qwe123");
		logIn.klikNaLogin();
		
		Assert.assertTrue(home.isUserPresent());
	}
			
}
