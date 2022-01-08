package pages;

import model.CommonMethods;
import model.Locators;
import model.Timeout;


public class MyCartPage extends CommonMethods {
	Timeout time = new Timeout();
	Locators lc =  new Locators();
	
	public void goTMycartPage() {
		clickOnButton(lc.clickCardButton);
		time.waitForPageLoad();
	}
	
	

}
