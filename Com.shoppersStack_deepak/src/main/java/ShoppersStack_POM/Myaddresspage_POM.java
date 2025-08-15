package ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaddresspage_POM {

	public Myaddresspage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//button[text()='Add Address']")
	private WebElement addadressBtn;
	
	@FindBy(xpath ="(//button[contains(@class,'MuiButton-sizeSmall')])[2]")
	private WebElement deleteBtn;
	
	@FindBy(xpath= "//button[text()='Yes']")
	private WebElement yesBtn;

	public WebElement getAddadressBtn() {
		return addadressBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getYesBtn() {
		return yesBtn;
	}

	
	
}
