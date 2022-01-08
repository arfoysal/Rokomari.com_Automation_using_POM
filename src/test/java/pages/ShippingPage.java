package pages;

import model.CommonMethods;
import model.Locators;
import model.Timeout;


public class ShippingPage extends CommonMethods {
	Timeout time = new Timeout();
	Locators lc =  new Locators();
	
	public void goToSippingPage() {
		clickOnButton(lc.clickGoToShippingPageBy);
		time.waitForPageLoad();
	}
	
	public void fillUpForm() {
		sendText(lc.customer_name, lc.customer_nameText);
		sendText(lc.phoneNumber, lc.phoneNumberText);
		clickOnButton(lc.selectCity);
		selectitem(lc.selectCity, lc.cityName);
		time.timeOut();
		selectitem(lc.selectArea, lc.areaName);
		time.timeOut();
		selectitem(lc.selectZone, lc.zoneName);
		time.timeOut();
		sendText(lc.address, lc.addressText);
		time.timeOut();
		clickOnButton(lc.paymentCOD);
		time.timeOut();
		
	}
	public void scrolldown() {
		scorllToElement(lc.confirm_Order);
		time.timeOut();
		highlighter(lc.confirm_Order);
		time.timeOut(5000);
		
	}
	

}
