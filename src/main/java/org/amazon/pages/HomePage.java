package org.amazon.pages;

import org.testleaf.base.ProjectSpecifcMethodsPOM;

public class HomePage extends ProjectSpecifcMethodsPOM {

	public HomePage enterProduct(String data) {
		 driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30");
		 return this;
	}
	
	public ProductList clickSearch() {
		driver.findElementByClassName("nav-input").click();
		return new ProductList();
	}		
		
	}

