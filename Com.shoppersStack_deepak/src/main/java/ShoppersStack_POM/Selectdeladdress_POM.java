package ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectdeladdress_POM {
	public Selectdeladdress_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[text()='9876556789']")
	private WebElement selAddress;
	
	@FindBy(xpath= "//button[text()='Proceed']")
	private WebElement proceedBtn;

	public WebElement getProceedBtn() {
		return proceedBtn;
	}

	public WebElement getSelAddress() {
		return selAddress;
	}
	
	

}
