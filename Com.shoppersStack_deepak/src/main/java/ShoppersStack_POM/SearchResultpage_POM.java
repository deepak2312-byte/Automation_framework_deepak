package ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultpage_POM {
	public SearchResultpage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='iphone 14 pro 128gb']/parent::div/following-sibling::div/button[text()='add to cart']")
	private WebElement iphoneATCbtn;
	
	@FindBy(xpath="//a[@id='cart']")
	private WebElement cartBtn;

	public WebElement getIphoneATCbtn() {
		return iphoneATCbtn;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	
	

	

}
