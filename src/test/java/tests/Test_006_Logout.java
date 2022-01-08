package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.Logout;
import pages.MyCartPage;
import pages.ShippingPage;

public class Test_006_Logout extends BaseDriver{
	
	Timeout time = new Timeout();
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	Logout logout = new Logout();
	@Test
	public void logoutTest() throws IOException {
		 logout.clickLogout();
		
	}
}
