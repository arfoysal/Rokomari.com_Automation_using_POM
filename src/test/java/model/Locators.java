package model;

import org.openqa.selenium.By;
import io.github.cdimascio.dotenv.Dotenv;

public class Locators {
	Dotenv dotenv = Dotenv.load();
	// HomePage
	public String homePageUrl = "https://www.rokomari.com/book";
	public String homePageTitle = "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";
	//public By home_welcomeMassage = By.cssSelector(".header-left .welcome-msg");
	
	
	//login/SingUp page
	public String googleSignInPage_Title = "প্রবেশ করুন - Google অ্যাকাউন্টস";
	public String googleSignInPage_MassageText = "rokomari.com";
	public String signInEmailText = dotenv.get("email");
	public String signInPasswordText = dotenv.get("pass");
	public String loginUserNameText = dotenv.get("name");
	
	public By signInButton = By.xpath("//a[normalize-space()='Sign in']");
	public By singUpWithGoogleButton = By.xpath("//span[normalize-space()='Google']");
	public By googleSingInPage_Massage = By.cssSelector("button[type='button']");
	public By signInEmail = By.cssSelector("#identifierId");
	public By signInPassword = By.cssSelector("input[name='password']");
	public By signNext = By.xpath("//span[contains(text(),'পরবর্তী')]");
	public By loginUserName = By.cssSelector(".user-name");
	
	
    //Browsing for books 
	public String writingButtonText = "লেখক";
	public String writerNameText = "হুমায়ূন আহমেদ";
	public String productPageTitle = "Humayun Ahmed Books - হুমায়ূন আহমেদ এর বই | Rokomari.com";
	
	public By writerButton = By.cssSelector("#js--authors");
	public By writerName = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"); 
	
	// Filter Categories
	public String checkSomokalinText = "সমকালীন উপন্যাস";
	public String checkStoryCollectionText = "রচনা সংকলন ও সমগ্র";
	
	public By checkCategoriesList = By.xpath("//ul[@id='categoryIds'] //li");
	public By checkSomokalin = By.cssSelector("label[for='categoryIds_677']");
	public By checkStoryCollection = By.cssSelector("label[for='categoryIds_1321']");
	
	
	//Products Nest page 
	public String currentPagenumbeText = "2"; 
	public String bookName = "";
	public String addtocardFortThItemJs = "document.querySelectorAll(\".btn.cart-btn.js--add-to-cart\")[3]";
	
	public By nextPageButton= By.xpath("//a[normalize-space()='Next']");
	
	public By currentpageNumber = By.cssSelector(".current");
	//public By selectThirdtBook = By.xpath("//button[@class='btn cart-btn js--add-to-cart']");
	//public By bookTitle = By.xpath("(//h1)[1]");
	//public By addtoCart = By.xpath("//span[contains(text(),'Add to Cart')]");
	
	// My Card page
	
	public String my_CardPageTitle = "My Cart | Rokomari.com";
	
	public By clickCardButton = By.cssSelector(".js--cart-amount.amount");
	public By cardPageBookTitle = By.xpath("(//a)[27]");
	public By cardPageWriterName = By.xpath("(//p)[16]");
	public By clickGoToShippingPageBy = By.xpath("//span[normalize-space()='Go to Shipping Page']");
	
	//Shipping Address Page
	public String shippingPageTitle = "Shipping Address | Rokomari.com";
	public String customer_nameText = dotenv.get("customer_name");
	public String phoneNumberText = dotenv.get("number");
	public String cityName = "বান্দরবান";
	public String areaName = "রোয়াংছড়ি";
	public String zoneName = "নোয়াপতং ইউনিয়ন";
	public String addressText = "I just Write my address";
	
	public By customer_name = By.xpath("(//input[@id='name'])[1]");
	public By phoneNumber = By.xpath("//input[@id='phone']");
	public By selectCity  = By.cssSelector("#js--city");
	public By selectArea  = By.cssSelector("#js--area");
	public By selectZone  = By.cssSelector("#js--zone");
	public By address = By.xpath("//textarea[@id='address']");
	public By paymentCOD = By.xpath("//label[@for='cod']");
	public By confirm_Order = By.xpath("//span[normalize-space()='Confirm Order']");
	
	//Logout
	public By signout = By.xpath("//a[normalize-space()='Sign Out']");
	 
}
