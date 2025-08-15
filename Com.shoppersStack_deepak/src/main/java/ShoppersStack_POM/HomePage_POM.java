package ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_POM {

	public HomePage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")
	private WebElement settingbtn;
	
	@FindBy(xpath ="//li[text()='My Profile']")
	private WebElement myProfilebtn;
	
	@FindBy(xpath= "//li[text()='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//a[text()='Electronic']")
	private WebElement electronicsbtn;
	
	@FindBy(xpath="//li[@aria-label='slide item 3']")
	private WebElement slider3Btn;

	public WebElement getSlider3Btn() {
		return slider3Btn;
	}

	public WebElement getElectronicsbtn() {
		return electronicsbtn;
	}

	public WebElement getSettingbtn() {
		return settingbtn;
	}

	public WebElement getMyProfilebtn() {
		return myProfilebtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	
}
