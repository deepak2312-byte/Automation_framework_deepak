package GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ShoppersStack_POM.AddressformPage_POM;
import ShoppersStack_POM.HomePage_POM;
import ShoppersStack_POM.LoginPage_POM;
import ShoppersStack_POM.MyProfile_POM;
import ShoppersStack_POM.Myaddresspage_POM;
import ShoppersStack_POM.Paymentpage_POM;
import ShoppersStack_POM.SearchResultpage_POM;
import ShoppersStack_POM.Selectdeladdress_POM;
import ShoppersStack_POM.WelcomePage_POM;
import ShoppersStack_POM.cartPage_POM;


public class BaseClass {
	public WebDriver driver;
	public static WebDriver sDriver;
	public FileUtility fileUtility = new FileUtility();
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	public WelcomePage_POM welcomePage;
	public LoginPage_POM loginPage;
	public HomePage_POM homePage;
	public MyProfile_POM profilePage;
	public Myaddresspage_POM addressPage;
	public AddressformPage_POM addressformPage;
	public WebDriverWait wait;
	public SearchResultpage_POM searchResult;
	public cartPage_POM cartPage;
	public Selectdeladdress_POM selectdelAddress;
	public Paymentpage_POM paymentAddress;
	public WebDriverUtility wdutility = new WebDriverUtility();

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@beforeSuite -------------- Connecting to Database");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@beforeTest -------------- ExtendReports Start");

		spark = new ExtentSparkReporter(FrameWorkConstants.reportsPath);
		report = new ExtentReports();
		report.attachReporter(spark);
		test = report.createTest("Address");
	}

	@BeforeClass
	public void beforeClass() throws IOException {
		System.out.println("@beforeClass -------------- Launching browser");
		String browserName = fileUtility.readDataFromPropertyfile("browserName");
		//String browserName=System.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Provide valid browser name");
			throw new RuntimeException();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(fileUtility.readDataFromPropertyfile("url"));
		//String url=System.getProperty("baseurl");
		//driver.get(url);

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException {
		System.out.println("@beforeMethod -------------- Login ");

		welcomePage = new WelcomePage_POM(driver);

		loginPage = new LoginPage_POM(driver);

		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(welcomePage.getLoginbtn()));
		Thread.sleep(3000);
		welcomePage.getLoginbtn().click();
		loginPage.getEmailtext().sendKeys(fileUtility.readDataFromPropertyfile("username"));
		loginPage.getPasswordtext().sendKeys(fileUtility.readDataFromPropertyfile("password"));
		loginPage.getLoginbtn().click();

		homePage = new HomePage_POM(driver);

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod -------------- Logout");
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("@afterClass -------------- Close browser");
		Thread.sleep(3000);
		homePage.getSettingbtn().click();
		homePage.getLogoutbtn().click();
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@afterTest -------------- Extent report end");
		report.flush();
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@afteSuite -------------- Disconnecting from Database");
	}
}
