package org.amazon.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testleaf.base.ProjectSpecifcMethodsPOM;

public class ProductList extends ProjectSpecifcMethodsPOM{

	public ProductList getPrice() {
		 String FirstMobPrice = driver.findElementByClassName("a-price-whole").getText();
		 System.out.println("Price of First Search result " +FirstMobPrice);
		 return this;
		 }
	
	public ProdSpecificPage selectProduct() {
		driver.findElementByXPath("//span[@class='a-size-medium a-color-base a-text-normal']").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>();
		windowList.addAll(allWindows);
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(windowList.get(1));
		return new ProdSpecificPage();
	}
	
}
