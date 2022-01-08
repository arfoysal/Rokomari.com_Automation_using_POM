package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.MyCartPage;

public class Test_004_MyCartPage extends BaseDriver{
	
	Timeout time = new Timeout();
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	MyCartPage myCartPage = new MyCartPage();
	@Test
	public void myCartPage() throws IOException {
		
		myCartPage.goTMycartPage();
		
	}
}
