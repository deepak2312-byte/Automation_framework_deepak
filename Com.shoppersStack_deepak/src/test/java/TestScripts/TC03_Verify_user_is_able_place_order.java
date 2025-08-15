package TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ShoppersStack_POM.Paymentpage_POM;
import ShoppersStack_POM.SearchResultpage_POM;
import ShoppersStack_POM.Selectdeladdress_POM;
import ShoppersStack_POM.cartPage_POM;

public class TC03_Verify_user_is_able_place_order extends BaseClass {
	@Test
	public void placeOrder() throws InterruptedException, IOException {
		homePage.getElectronicsbtn().click();

		searchResult = new SearchResultpage_POM(driver);
		
		WebElement a=searchResult.getIphoneATCbtn();
		
		Actions a1 = new Actions(driver);
		
		Thread.sleep(3000);
		a1.moveToElement(a).click().perform();

		Thread.sleep(2000);
		searchResult.getCartBtn().click();

		cartPage = new cartPage_POM(driver);
		cartPage.getBuynowBtn().click();

		Thread.sleep(2000);
		selectdelAddress = new Selectdeladdress_POM(driver);
		selectdelAddress.getSelAddress().click();
		Thread.sleep(2000);
		selectdelAddress.getProceedBtn().click();

		paymentAddress = new Paymentpage_POM(driver);
		Thread.sleep(2000);
		paymentAddress.getCodradioBtn().click();
		Thread.sleep(2000);
		paymentAddress.getProceed1Btn().click();
		
		Thread.sleep(3000);
		wdutility.webPageScreenshot(driver);
	}

}
