package ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile_POM {
	public MyProfile_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='My Addresses']")
	private WebElement myaddressbtn;

	public WebElement getMyaddressbtn() {
		return myaddressbtn;
	}
	

}
