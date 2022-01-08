package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.MyCartPage;
import pages.ShippingPage;

public class Test_005_ShippingPage extends BaseDriver{
	
	Timeout time = new Timeout();
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	ShippingPage shippingPage = new ShippingPage();
	
	@Test
	public void shippingPage() throws IOException {
		
		shippingPage.goToSippingPage();
		shippingPage.fillUpForm();
		
	}
}
