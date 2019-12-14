package org.testleaf.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.utils.LearnExcelPOM;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecifcMethodsPOM {

	public static ChromeDriver driver; // should be declared as public
	public String excelFileName; // declare file name variable
	
	@BeforeMethod
	public void login() { //pass the static variable same order and not case sensitive
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://amazon.in");  // pass the arguments case sensitive
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }
	
	@AfterMethod
	public void logout() {
		driver.close();
	}
	
	@DataProvider(name="ExcelData") // for Dynamic values
	public String[][] sendData() throws IOException{
	LearnExcelPOM excel = new LearnExcelPOM();
	return excel.readExcel(excelFileName);
	}
}

