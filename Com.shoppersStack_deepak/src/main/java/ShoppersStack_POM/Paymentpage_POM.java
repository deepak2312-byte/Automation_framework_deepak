package ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage_POM {
	public Paymentpage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Cash On Delivery (COD)']")
	private WebElement codradioBtn;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceed1Btn;

	public WebElement getProceed1Btn() {
		return proceed1Btn;
	}

	public WebElement getCodradioBtn() {
		return codradioBtn;
	}
	
	

}
