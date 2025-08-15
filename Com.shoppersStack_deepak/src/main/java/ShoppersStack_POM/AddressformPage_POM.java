package ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressformPage_POM {
	
	public AddressformPage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="Office")
	private WebElement officeRadioBtn;
	
	@FindBy(id="Name")
	private WebElement nameTextfield;
	
	@FindBy(id="House/Office Info")
	private WebElement houseinfoBtn;
	
	@FindBy(id="Street Info")
	private WebElement streetinfoBtn;
	
	@FindBy(id="Landmark")
	private WebElement landmarkinfoBtn;
	
	@FindBy(id="Country")
	private WebElement countrydropdown;
	
	@FindBy(id="State")
	private WebElement statedropdown;
	
	@FindBy(id="City")
	private WebElement citydropdown;
	
	@FindBy(id="Pincode")
	private WebElement pincodetextfield;
	
	@FindBy(id="Phone Number")
	private WebElement phnnumbertextfield;
	
	@FindBy(id="addAddress")
	private WebElement addadressBtn;
	
	@FindBy(xpath ="//button[@aria-label='close']")
	private WebElement popupcloseBtn;

	public WebElement getOfficeRadioBtn() {
		return officeRadioBtn;
	}

	public WebElement getNameTextfield() {
		return nameTextfield;
	}

	public WebElement getHouseinfoBtn() {
		return houseinfoBtn;
	}

	public WebElement getStreetinfoBtn() {
		return streetinfoBtn;
	}

	public WebElement getLandmarkinfoBtn() {
		return landmarkinfoBtn;
	}

	public WebElement getCountrydropdown() {
		return countrydropdown;
	}

	public WebElement getStatedropdown() {
		return statedropdown;
	}

	public WebElement getCitydropdown() {
		return citydropdown;
	}

	public WebElement getPincodetextfield() {
		return pincodetextfield;
	}

	public WebElement getPhnnumbertextfield() {
		return phnnumbertextfield;
	}

	public WebElement getAddadressBtn() {
		return addadressBtn;
	}

	public WebElement getPopupcloseBtn() {
		return popupcloseBtn;
	}
	
	

}
