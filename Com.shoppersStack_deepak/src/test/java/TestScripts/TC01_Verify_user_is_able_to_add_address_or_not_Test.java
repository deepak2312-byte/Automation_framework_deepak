package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ShoppersStack_POM.AddressformPage_POM;
import ShoppersStack_POM.MyProfile_POM;
import ShoppersStack_POM.Myaddresspage_POM;

public class TC01_Verify_user_is_able_to_add_address_or_not_Test extends BaseClass {

	@Test
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(3000);
		homePage.getSettingbtn().click();
		homePage.getMyProfilebtn().click();

		profilePage = new MyProfile_POM(driver);
		profilePage.getMyaddressbtn().click();

		addressPage = new Myaddresspage_POM(driver);
		Thread.sleep(2000);
		addressPage.getAddadressBtn().click();

		addressformPage = new AddressformPage_POM(driver);
		addressformPage.getOfficeRadioBtn().click();
		addressformPage.getNameTextfield().sendKeys(fileUtility.readDataFromExcelfile("Sheet1", 1, 0));
		addressformPage.getHouseinfoBtn().sendKeys(fileUtility.readDataFromExcelfile("Sheet1", 1, 1));
		addressformPage.getStreetinfoBtn().sendKeys(fileUtility.readDataFromExcelfile("Sheet1", 1, 2));
		addressformPage.getLandmarkinfoBtn().sendKeys(fileUtility.readDataFromExcelfile("Sheet1", 1, 3));

		wdutility.selectByValue(addressformPage.getCountrydropdown(), fileUtility.readDataFromPropertyfile("country"));
		Thread.sleep(2000);
		wdutility.selectByValue(addressformPage.getStatedropdown(), fileUtility.readDataFromPropertyfile("state"));
		Thread.sleep(2000);
		wdutility.selectByValue(addressformPage.getCitydropdown(), fileUtility.readDataFromPropertyfile("city"));

		addressformPage.getPincodetextfield().sendKeys(fileUtility.readDataFromExcelfile("Sheet1", 1, 4));
		addressformPage.getPhnnumbertextfield().sendKeys(fileUtility.readDataFromExcelfile("Sheet1", 1, 5));
		addressformPage.getAddadressBtn().click();

		addressformPage.getPopupcloseBtn().click();

		Thread.sleep(2000);
		wdutility.webPageScreenshot(driver);

	}

}
