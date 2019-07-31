package com.RB.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RB.base.RBBase;

public class SearchResultPage extends RBBase{

	@FindBy(xpath = "//span[@class='g-button fr']")
	WebElement addReturnTicketButton;
	
	@FindBy(xpath = "//div[@id='rb-calmiddle']//li[@class='weekend']//span[contains(text(),'8')]")
	WebElement returnDate;
	
	//ul[@class='bus-items']//div[@class='clearfix bus-item']//div[@class='clearfix m-top-16']//div[@class='button view-seats fr'][contains(text(),'View Seats')]
	
	@FindBy(css = "div.search div.srp-data.clearfix div.sort-results.w-80.fl div.result-sec ul.bus-items div:nth-child(1) li.row-sec.clearfix div.clearfix.bus-item div.clearfix.m-top-16:nth-child(2) > div.button.view-seats.fr:nth-child(1)")
	WebElement viewSeatsButton;
	
	@FindBy(xpath = "//canvas[@class='pointer']")
	WebElement selectedSeat;
	
	@FindBy(xpath = "//button[@class='button continue inactive']")
	WebElement proceedButton;
	
	@FindBy(xpath="//div[@class='sort-results w-80 fl']")
	WebElement itemContainer;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectBusSeat() {
		//if (itemContainer.isDisplayed())
		//{
		viewSeatsButton.click();
		selectedSeat.click();
		proceedButton.click();
		//return new SearchResultPage();
		//}
	}
}
