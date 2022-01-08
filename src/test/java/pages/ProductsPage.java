package pages;

import model.CommonMethods;
import model.Locators;
import model.Timeout;


public class ProductsPage extends CommonMethods {
	Timeout time = new Timeout();
	Locators lc =  new Locators();
	
	public void selectWriter() {
		hover(lc.writerButton);
		clickOnButton(lc.writerName);
		time.timeOut();
	}
	public String pageTitle() {
		return getTitle();
	}
	public void  filterByCategories() {
		listitem(lc.checkCategoriesList, lc.checkSomokalinText);
		time.timeOut();
		listitem(lc.checkCategoriesList, lc.checkStoryCollectionText);
		time.timeOut();
	}
	public void scrollAndGotoNextPage() {
		scorllToElement(lc.nextPageButton);
		time.timeOut(4000);
		clickOnButton(lc.nextPageButton);
		time.waitForPageLoad();
	}
	public void selectBook() {
		clickOnAButtonJs(lc.addtocardFortThItemJs);
		time.timeOut(1000);
	}	
	

}
