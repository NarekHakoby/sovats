package am.sovats.registration;

import java.util.concurrent.ThreadLocalRandom;

import org.testng.Assert;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import am.sovats.home.SovatsHomePageTest;
import am.sovats.pages.home.SovatsHomePage;
import am.sovats.pages.login.SovatsLoginPage;
import am.sovats.pages.registration.SovatsRegistrationPage;

public class SovatsRegistrationPageTest extends SovatsHomePageTest {
	//Test Case Id : 1.0
	// Positive test case with correct parameters
	@Test
	public void RegistrationTestOne() {
		//1.1 Open sovats.am(done in beforeTest)
		//1.2 Click on "Login" button
				SovatsHomePage home = new SovatsHomePage(driver);
				SovatsLoginPage login = home.clickOnLoginBtn();
				//1.3 Click on "Sign up" button 
				SovatsRegistrationPage registration = login.clickOnSingupbutton();
				//1.4 Type correct parameters 
				int rand = ThreadLocalRandom.current().nextInt(001, 1000);
				registration=registration.typeEmail("mail"+rand+"@mail.ru");
				registration=registration.typeFirstName("N");
				registration=registration.typeLastName("N");
				registration=registration.typePhoneNumber("099123"+rand);
				registration=registration.typePassword("1234567W"); 
				registration=registration.typeConfirmPassword("1234567W");
				//1.5 Click on "Sing up" button
				registration = registration.clickOnRegSingupbutton();
				Assert.assertTrue(registration.isNumberCodePageDisplayed());
				
				

	}
	//Test Case Id : 1.0
		// Positive test case with correct parameters
		@Test
		public void registrTestTwo() {
			//1.1 Open sovats.am(done in beforeTest)
			//1.2 Click on "Login" button
		}
	
	}


