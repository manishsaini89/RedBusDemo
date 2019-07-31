package com.RB.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.RB.base.RBBase;

public class HomePage extends RBBase{
	@FindBy(id="src")
	WebElement sourceCity;
	
	@FindBy(id="dest")
	WebElement destinationCity;
	
	@FindBy(xpath = "//label[contains (text(), 'Onward Date')]")
	WebElement calendar;
	
	@FindBy(xpath = "//div[@id='rb-calendar_onward_cal']//td[@class='current day']")
	WebElement currentDay;
		
	@FindBy(xpath = "//button[@id='search_btn']")
	WebElement searchButton;
	
	@FindBy(id= "sign-in-icon-down")
	WebElement profileIcon;
	
	@FindBy(id= "signInLink")
	WebElement signInLink;
	
	@FindBy(id= "googlePlusBtn1")
	WebElement signInWithGoogleBtn;
	
	@FindBy(id= "facebookBtn")
	WebElement signInWithFacebookBtn;
	
	
	@FindBy(xpath= "(//i[@class='icon-close'])")
	WebElement modalCloseIcon;

	@FindBy(xpath= "//iframe[@class='modalIframe']")
	WebElement signInFrame;
	
	@FindBy(id= "profileIdentifier")
	WebElement gmailUseOtherAccountBtn;
	
	@FindBy(id= "signOutLink")
	WebElement signOutBtn;
	
	@FindBy(id= "copyReferCode")
	WebElement copyBtn;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void signIn() {	
		profileIcon.click();
		signInLink.click();
		driver.switchTo().frame(signInFrame);
		signInWithFacebookBtn.click();
		driver.switchTo().defaultContent();
		//copyBtn.click();
		//driver.switchTo().frame(signInFrame);
		modalCloseIcon.click();
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		profileIcon.click();
		//driver.findElement(By.id("i-icon-profile")).click();
		
		//signOutBtn.click();
		
		//WebDriverWait wait= new WebDriverWait(driver, 15);
		
				
//		driver.switchTo().defaultContent();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		String subWindowHandler = null;
//		Set<String> handles = driver.getWindowHandles(); // get all window handles
//	    Iterator<String> iterator = handles.iterator();
//	    while (iterator.hasNext()){
//	        subWindowHandler = iterator.next();
//	        gmailUseOtherAccountBtn.click();
//	    }
		
		}
	
	public SearchResultPage searchBus(String src, String dest) {
		sourceCity.sendKeys(src);
		destinationCity.sendKeys(dest);
		calendar.click();
		currentDay.click();
		searchButton.click();
		return new SearchResultPage();
	}
}
