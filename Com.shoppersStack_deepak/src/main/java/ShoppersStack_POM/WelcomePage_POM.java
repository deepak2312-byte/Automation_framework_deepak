package ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage_POM {
	public WelcomePage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginBtn")
	private WebElement loginbtn;

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
