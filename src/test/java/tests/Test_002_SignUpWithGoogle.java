package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.HomePage;
import pages.SignUpWithGooglePage;

public class Test_002_SignUpWithGoogle extends BaseDriver{
	
	Timeout time = new Timeout();
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	SignUpWithGooglePage signUpPage = new SignUpWithGooglePage();
	@Test
	public void signUpWithGoogle() throws IOException {
		
		signUpPage.goTosiginUpPage();
		time.waitForPageLoad();
		
		assertEquals(signUpPage.getTitle(), lc.googleSignInPage_Title);
		assertEquals(signUpPage.googlePageMsg(), lc.googleSignInPage_MassageText);
		
		signUpPage.singup();
		time.waitForPageLoad();
		assertEquals(signUpPage.user_name(), lc.loginUserNameText);
		signUpPage.userNameHighlight();
		time.timeOut(1000);;
		screenshot.screenshot("Login_Successful");
	}

}
