package com.RB.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.RB.base.RBBase;
import com.RB.pages.HomePage;
import com.RB.pages.SearchResultPage;

public class HomePageTest extends RBBase{

	HomePage homePage;
	SearchResultPage resultPage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='search-container']//h1[contains(text(), 'Online Bus Ticket Booking')]")));
		homePage= new HomePage();
	}
	
	
//	@Test(priority=2)
//	public void searchTest() {
//		resultPage =homePage.searchBus(prop.getProperty("source"), prop.getProperty("destination"));
//	}
	
	@Test(priority=1)
	public void signInTest() {
		homePage.signIn();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
