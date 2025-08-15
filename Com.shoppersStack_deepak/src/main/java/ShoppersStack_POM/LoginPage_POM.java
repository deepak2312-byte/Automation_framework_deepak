package ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POM {

	public LoginPage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement emailtext;
	
	@FindBy(id="Password")
	private WebElement passwordtext;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginbtn;

	public WebElement getEmailtext() {
		return emailtext;
	}

	public WebElement getPasswordtext() {
		return passwordtext;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
}
