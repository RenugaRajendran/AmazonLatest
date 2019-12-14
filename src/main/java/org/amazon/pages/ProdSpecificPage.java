package org.amazon.pages;

import org.testleaf.base.ProjectSpecifcMethodsPOM;

public class ProdSpecificPage extends ProjectSpecifcMethodsPOM {

	public ProdSpecificPage getDeliveryDate() {
		String DeliveryDate = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText();
		System.out.println("Delivery Date" + DeliveryDate);
		return this;
	}
	
	public CartPage clickAddtoCart() {
		driver.findElementById("add-to-cart-button").click();
		return new CartPage();
		}
	
}
