package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import driverPackage.PageDriver;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.HomePage;
import pages.ProductsPage;
import pages.SignUpWithGooglePage;

public class Test_003_SelectProduct extends BaseDriver{
	
	Timeout time = new Timeout();
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	ProductsPage productsPage = new ProductsPage();
	@Test
	public void selectProduct() throws IOException {
		
		productsPage.selectWriter();
		assertEquals(productsPage.getTitle(), lc.productPageTitle);
		productsPage.filterByCategories();
		productsPage.scrollAndGotoNextPage();
		productsPage.selectBook();	
	}

}
