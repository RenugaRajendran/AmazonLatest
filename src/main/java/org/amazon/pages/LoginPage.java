package org.amazon.pages;

import org.testleaf.base.ProjectSpecifcMethodsPOM;

public class LoginPage extends ProjectSpecifcMethodsPOM{

	public LoginPage confirmPage() {
		String SignIn = driver.getTitle();
		if(SignIn.equals("Amazon Sign In")) {
		System.out.println("Landed in Sign in page");}
		else {
			System.out.println("Not Landed in Sign in page");
		}
		return this;
	}
	
	public LoginPage clickContinue() {
		driver.findElementById("continue").click();
		return this;
		}
	
	public LoginPage confirmErrMessage() {
		String ErrMsg = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		if(ErrMsg.equals("Enter your email or mobile phone number")) {
		System.out.println("Error message displayed as Expected");}
		else {
			System.out.println("Unexpected Error Message");}
			return this;
	}
}
