package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ShoppersStack_POM.MyProfile_POM;
import ShoppersStack_POM.Myaddresspage_POM;

public class TC02_Verify_user_is_able_to_delete_address_or_not_Test extends BaseClass{

	@Test
	public void deleteAddress() throws InterruptedException, IOException {
		Thread.sleep(2000);
		homePage.getSettingbtn().click();
		homePage.getMyProfilebtn().click();
		
		profilePage=new MyProfile_POM(driver);
		profilePage.getMyaddressbtn().click();
		
		addressPage=new Myaddresspage_POM(driver);
		addressPage.getDeleteBtn().click();
		Thread.sleep(2000);
		addressPage.getYesBtn().click();;
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		wdutility.webPageScreenshot(driver);
		
		
	}
}
