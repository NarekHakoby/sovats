package am.sovats.pages.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.sovats.pages.base.SovatsBasePageObject;
//import am.sovats.pages.home.SovatsHomePage;

public class SovatsRegistrationPage extends SovatsBasePageObject {
	public SovatsRegistrationPage(WebDriver driver) {
		super(driver);
	}

	public final String EMAIL_XPATH = "//form[@class='S-modal-login-inputs']//input[@name='email']";
	public final String FIRSTNAME_XPATH = "//form[@class='S-modal-login-inputs']//input[@name='firstName']";
	public final String LASTNAME_XPATH = "//form[@class='S-modal-login-inputs']//input[@name='lastName']";
	public final String PHONE_XPATH = "//form[@class=\"S-modal-login-inputs\"]//input[@name=\"phone\"]";
	public final String PASSWORD_XPATH = "//form[@class='S-modal-login-inputs']//input[@name='password']";
	public final String CONFIRMPASSWORD_XPATH = "//input[@name='confirmPassword']";
	public final String REGSINGUP_XPATH = "//button[@class='S-modal-login-submit']";
	public final String NUMBER_COD_PAGE_XPATH = "//form[@class='S-modal-login-inputs']";

	// Type correct parameters
	@FindBy(xpath = EMAIL_XPATH)
	WebElement emailField;

	public SovatsRegistrationPage typeEmail(String email) {
		waitForElementPresent(EMAIL_XPATH);
		emailField.sendKeys(email);
		return new SovatsRegistrationPage(driver);
	}

	@FindBy(xpath = FIRSTNAME_XPATH)
	WebElement firstName;

	public SovatsRegistrationPage typeFirstName(String firstname) {
		waitForElementPresent(FIRSTNAME_XPATH);
		firstName.sendKeys(firstname);
		return new SovatsRegistrationPage(driver);
	}

	@FindBy(xpath = LASTNAME_XPATH)
	WebElement lastName;

	public SovatsRegistrationPage typeLastName(String lastname) {
		waitForElementPresent(LASTNAME_XPATH);
		lastName.sendKeys(lastname);
		return new SovatsRegistrationPage(driver);
	}

	@FindBy(xpath = PHONE_XPATH)
	WebElement phoneNumber;

	public SovatsRegistrationPage typePhoneNumber(String number) {
		waitForElementPresent(PHONE_XPATH);
		phoneNumber.sendKeys(number);
		return new SovatsRegistrationPage(driver);
	}

	@FindBy(xpath = PASSWORD_XPATH)
	WebElement passwordfield;

	public SovatsRegistrationPage typePassword(String password) {
		waitForElementPresent(PASSWORD_XPATH);
		passwordfield.sendKeys(password);
		return new SovatsRegistrationPage(driver);
	}

	@FindBy(xpath = CONFIRMPASSWORD_XPATH)
	WebElement confirmPassword;

	public SovatsRegistrationPage typeConfirmPassword(String confirmpassword) {
		waitForElementPresent(CONFIRMPASSWORD_XPATH);
		confirmPassword.sendKeys(confirmpassword);
		return new SovatsRegistrationPage(driver);
	}

	// Click on "Sing up" button
	@FindBy(xpath = REGSINGUP_XPATH)
	WebElement regSingUpButton;

	public SovatsRegistrationPage clickOnRegSingupbutton() {
		waitForElementClickable(REGSINGUP_XPATH);
		regSingUpButton.click();
		return new SovatsRegistrationPage(driver);
	}

	@FindBy(xpath = NUMBER_COD_PAGE_XPATH)
	WebElement numberCodPage;

	public SovatsRegistrationPage numberCodPage() {
		waitForElementPresent(NUMBER_COD_PAGE_XPATH);
		return new SovatsRegistrationPage(driver);
	}

	public boolean isNumberCodePageDisplayed() {
		return numberCodPage.isDisplayed();
	}
}