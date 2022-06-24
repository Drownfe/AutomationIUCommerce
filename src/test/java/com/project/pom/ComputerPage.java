package com.project.pom;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class ComputerPage extends Base{
	
	By computersLinkLocator = By.linkText("Computers");
	By desktopPageLocator = By.xpath("//img[@src ='https://demo.nopcommerce.com/images/thumbs/0000002_desktops_450.jpg']");
	By addToCartButton1Locator = By.xpath("//button[@class='button-2 product-box-add-to-cart-button']");
	By titleLocator = By.xpath("//h1[contains(text(), 'Build your own computer')]");
	By processorShopInfo = By.xpath("//*[@id=\"product_attribute_1\"]/option[3]");
	By ramLocator = By.xpath("//option[@value = 3]");
	By hddLocator = By.id("product_attribute_3_6");
	By osLocator = By.id("product_attribute_4_8");
	By softwareDeselectLocator = By.id("product_attribute_5_10");
	By softwareLocator = By.id("product_attribute_5_11");
	By cartPriceLocator = By.id("price-value-1");
	By addToCartButton2Locator = By.id("add-to-cart-button-1");
	By confirmationAlertLocator = By.id("bar-notification");
	By shoppingCartLocator = By.className("cart-label");
	By continueLocator = By.xpath("//button[@name='continueshopping']");
	By vanquishAddLocator = By.xpath("//img[@src='https://demo.nopcommerce.com/images/thumbs/0000022_digital-storm-vanquish-3-custom-performance-pc_415.jpeg']");
	By addToCartButton3Locator = By.id("add-to-cart-button-2");
	By vanquishProductTextLocator = By.xpath("//table[@class='cart']/tbody/tr[2]/td[3]/a");
	By vanquishPriceLocator = By.xpath("//table[@class='cart']/tbody/tr[2]/td[4]");
	By vanquishTotalPriceLocator = By.xpath("//table[@class='cart']/tbody/tr[2]/td[6]");
	

	public void computerSearch() throws InterruptedException {
		click(computersLinkLocator);
		click(desktopPageLocator);
		click(addToCartButton1Locator);
		Thread.sleep(2000);
		if (isDisplayed(titleLocator)) {
			click(ramLocator);
			click(hddLocator);
			click(softwareDeselectLocator);
			click(softwareLocator);
			click(addToCartButton2Locator);
			if(isEnabled(confirmationAlertLocator)) {
				Thread.sleep(5000);
				click(shoppingCartLocator);	
				/*assertEquals("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", getText(processorShopInfo));
				assertEquals("2 GB", getText(ramLocator));
				assertEquals("320 GB", getText(hddLocator));
				assertEquals("Vista Home [+$50.00]", getText(osLocator));
				assertEquals("Acrobat Reader [+$10.00]", getText(softwareLocator));
				assertEquals("$1,275.00",getText(cartPriceLocator));*/
				click(continueLocator);
				click(vanquishAddLocator);
				click(addToCartButton3Locator);
				if(isEnabled(confirmationAlertLocator)) {
					Thread.sleep(4000);
					click(shoppingCartLocator);
					if (isDisplayed(vanquishProductTextLocator) && 
							isDisplayed(vanquishPriceLocator) && 
							isDisplayed(vanquishTotalPriceLocator)) {
						System.out.println("VANQUISH INFORMATION FOUND AND DISPLAYED ON PAGE");
					}else {
						System.out.println("VANQUISH INFORMATION NOT FOUND");
					}
				}else {
					System.out.println("CONFIRMATION NOTIFICATION NOT FOUND");
				}
			}else {
				System.out.println("CONFIRMATION NOTIFICATION NOT FOUND");
			}
		}else {
			System.out.println("MAIN TITLE NOT FOUND");
		}
	}
	
	public ComputerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
}
