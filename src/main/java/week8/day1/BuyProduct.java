package week8.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30");
		 driver.findElementByClassName("nav-input").click();
		 String FirstMobPrice = driver.findElementByClassName("a-price-whole").getText();
		 System.out.println("Price of First Search result " +FirstMobPrice);
		 driver.findElementByXPath("//span[@class='a-size-medium a-color-base a-text-normal']").click();
		  //Control transfer to child window
			Set<String> allWindows = driver.getWindowHandles();
			List<String> windowList = new ArrayList<String>();
			windowList.addAll(allWindows);
			String parentWindow = driver.getWindowHandle();
			driver.switchTo().window(windowList.get(1));
			//String childTitle = driver.switchTo().window(windowList.get(1)).getTitle();
			String DeliveryDate = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText();
			System.out.println("Delivery Date" + DeliveryDate);
			driver.findElementById("add-to-cart-button").click();
			String ConfirmationMsg = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText();
			if(ConfirmationMsg.equals("Added to Cart")){
				System.out.println("Confirmation message successful");
				}else {
					System.out.println("Failed");
				}
			driver.findElementById("hlb-ptc-btn-native").click();
			String SignIn = driver.getTitle();
			if(SignIn.equals("Amazon Sign In")) {
			System.out.println("Landed in Sign in page");}
			else {
				System.out.println("Not Landed in Sign in page");
			}
			driver.findElementById("continue").click();
			String ErrMsg = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
			if(ErrMsg.equals("Enter your email or mobile phone number")) {
			System.out.println("Error message displayed as Expected");}
			else {
				System.out.println("Unexpected Error Message");}
			}
			
				}		


