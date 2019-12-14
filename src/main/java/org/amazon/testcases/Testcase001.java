package org.amazon.testcases;

import org.amazon.pages.HomePage;
import org.testleaf.base.ProjectSpecifcMethodsPOM;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase001 extends ProjectSpecifcMethodsPOM {

	@BeforeTest
	public void setData() {
		excelFileName="TestCase001";
	}
	
	@Test(dataProvider="ExcelData")
	public void CreateTC(String ProductName) {
		
		new HomePage()
		.enterProduct(ProductName)
		.clickSearch()
		.getPrice()
		.selectProduct()
		.getDeliveryDate()
		.clickAddtoCart()
		.confirmMessage()
		.clickProceed()
		.confirmPage()
		.clickContinue()
		.confirmErrMessage();
			
	}
}
