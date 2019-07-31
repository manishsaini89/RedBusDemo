package com.RB.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.RB.base.RBBase;
import com.RB.pages.HomePage;
import com.RB.pages.SearchResultPage;

public class SelectSeatTest extends RBBase{
	HomePage searchPage;
	SearchResultPage resultPage;
	public SelectSeatTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		searchPage= new HomePage();
		resultPage= new SearchResultPage();
		searchPage.searchBus(prop.getProperty("source"), prop.getProperty("destination"));
	}
	
	
	@Test(priority=1)
	public void selectBusSeatTest() {
		resultPage.selectBusSeat();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
