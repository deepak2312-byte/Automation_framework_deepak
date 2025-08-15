package ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage_POM {

	public cartPage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='buynow_fl']")
	private WebElement buynowBtn;
	
	@FindBy(xpath="//button[text()='Remove from cart']")
	private WebElement removefromcartBtn;

	public WebElement getRemovefromcartBtn() {
		return removefromcartBtn;
	}

	public WebElement getBuynowBtn() {
		return buynowBtn;
	}
	
	
}
