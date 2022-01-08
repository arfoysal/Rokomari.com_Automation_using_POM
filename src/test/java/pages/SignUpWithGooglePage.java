package pages;

import java.io.IOException;

import model.CommonMethods;
import model.Locators;
import model.Timeout;


public class SignUpWithGooglePage extends CommonMethods {
	Timeout time = new Timeout();
	Locators lc =  new Locators();
	
	public void goTosiginUpPage() {
		hover(lc.signInButton);
		clickOnButton(lc.singUpWithGoogleButton);
	}
	public String pageTitle() {
		return getTitle();
	}
	public String googlePageMsg() {
		return getText(lc.googleSingInPage_Massage);
	}
	public void singup() throws IOException {
		sendText(lc.signInEmail, lc.signInEmailText);
		clickOnButton(lc.signNext);
		time.timeOut(2000);
		sendText(lc.signInPassword, lc.signInPasswordText);
		time.timeOut(1000);
		clickOnButton(lc.signNext);
		time.timeOut(4000);
	}
	public String user_name() {
		return getText(lc.loginUserName);
	}
	public void userNameHighlight() {
		highlighter(lc.loginUserName);
	}
	
	
	
	
	
	
	

}
