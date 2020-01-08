package am.sovats.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.sovats.pages.login.SovatsLoginPage;

public class SovatsMemberPage extends SovatsLoginPage {

	public SovatsMemberPage(WebDriver driver) {
		super(driver);
	}

	public final String MEMBERDROPDOWN_XPATH = "//span[@class='S-user-name-header']";
	
	@FindBy(xpath = MEMBERDROPDOWN_XPATH)
	WebElement memberdrdown;
	
	public SovatsMemberPage clickOnMemberDropDown() {
		waitForElementClickable(MEMBERDROPDOWN_XPATH);
		memberdrdown.click();;
		return new SovatsMemberPage(driver);
		
	}
	
	public boolean isMmemberDropDownPresent() {
		  return memberdrdown.isDisplayed();
	  }
}
