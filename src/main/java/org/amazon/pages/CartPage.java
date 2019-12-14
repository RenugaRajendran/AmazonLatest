package org.amazon.pages;

import org.testleaf.base.ProjectSpecifcMethodsPOM;

public class CartPage extends ProjectSpecifcMethodsPOM {

	public CartPage confirmMessage() {
		String ConfirmationMsg = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText();
		if(ConfirmationMsg.equals("Added to Cart")){
			System.out.println("Confirmation message successful");
			}else {
				System.out.println("Failed");
			}
		return this;
		}
	
	public LoginPage clickProceed() {
		driver.findElementById("hlb-ptc-btn-native").click();
		return new LoginPage();
	}
}
