package am.sovats.lng;

import org.testng.annotations.Test;

import am.sovats.home.SovatsHomePageTest;
import am.sovats.pages.home.SovatsHomePage;

public class SovatsLngPageTest extends SovatsHomePageTest {


//1.1Change language "en"
@Test
public void LngTestOne() {
	//1.1 Open sovats.am(done in beforeTest)
	//1.2 Click on language dropdown
	SovatsHomePage home = new SovatsHomePage(driver);
	home = home.clickOnDropdown();
	//1.3 Click on "en" button 
	home = home.clickOnDropdownEn();
}
//Change language "ru"
@Test
public void LngTestTwo() {
	//2.1 Open sovats.am(done in beforeTest)
	//2.2 Click on language dropdown
	SovatsHomePage home = new SovatsHomePage(driver);
	home = home.clickOnDropdown();
	//2.3 Click on "ru" button 
	home = home.clickOnDropdownRu();
}
//Change language "am"
@Test
public void LngTestThree() {
	//3.1 Open sovats.am(done in beforeTest)
	//3.2 Click on language dropdown
	SovatsHomePage home = new SovatsHomePage(driver);
	home = home.clickOnDropdown();
	//3.3 Click on "am" button 
	home = home.clickOnDropdownAm();
}
}
