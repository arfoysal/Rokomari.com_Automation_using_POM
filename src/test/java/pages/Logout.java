package pages;

import model.CommonMethods;
import model.Locators;
import model.Timeout;

public class Logout extends CommonMethods{
	Locators lc =  new Locators();
	Timeout time = new Timeout();
	
	public void clickLogout() {
		clickOnButton(lc.loginUserName);
		time.timeOut(1000);
		clickOnButton(lc.signout);
		time.timeOut(5000);
	}
	
	
}
