package am.sovats.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.sovats.pages.home.SovatsHomePage;
import am.sovats.pages.member.SovatsMemberPage;
import am.sovats.pages.registration.SovatsRegistrationPage;

public class SovatsLoginPage extends SovatsHomePage {
	public SovatsLoginPage(WebDriver driver) {
		super(driver);
	}
	public final String SINGUP_XPATH = "//div[@class='S-modal-login-title']//span";
	public final String LOGINFIELD_XPATH = "//input[@name='email']";
	public final String PASSWORDFIELD_XPATH = "//input[@name='password']";
	public final String LOGINBTN_XPATH = "//button[@class='S-modal-login-submit']";

	
	
	// Click on "Sing up" button
		@FindBy(xpath =SINGUP_XPATH)
		WebElement singupbutton;

		public SovatsRegistrationPage clickOnSingupbutton() {
			waitForElementClickable(SINGUP_XPATH);
			singupbutton.click();
			return new SovatsRegistrationPage(driver);
		}
		// Click on login field
				@FindBy(xpath =LOGINFIELD_XPATH)
				WebElement loginfield;

				public SovatsLoginPage clickOnLoginField(String login) {
					waitForElementClickable(LOGINFIELD_XPATH);
					loginfield.sendKeys(login);
					return new SovatsLoginPage(driver);
				}
				// Click on password field
				@FindBy(xpath =PASSWORDFIELD_XPATH)
				WebElement passwordfield;

				public SovatsLoginPage clickOnPasswordField(String password) {
					waitForElementClickable(PASSWORDFIELD_XPATH);
					passwordfield.sendKeys(password);
					return new SovatsLoginPage(driver);
				}
				// Click on "Log in" button
				@FindBy(xpath =LOGINBTN_XPATH)
				WebElement loginbutton;

				public SovatsMemberPage clickOnLoginbutton() {
					waitForElementClickable(LOGINBTN_XPATH);
					loginbutton.click();
					return new SovatsMemberPage (driver);
				}
}
