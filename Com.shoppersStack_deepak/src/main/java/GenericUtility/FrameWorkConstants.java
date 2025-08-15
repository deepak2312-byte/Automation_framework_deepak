package GenericUtility;

public interface FrameWorkConstants {
	
	JavaUtility javaUtility=new JavaUtility();
	
	static final String propertyFilePath="./src/test/resources/TestData/shoppersStackData.properties";
	
	static final String excelFilePath="./src/test/resources/Testdata/shoppersStackData.xlsx";
	
	static final String screenShotpath="./Screenshots/"+javaUtility.getLocalDateAndTime()+".png";
	
	static final String reportsPath="./Reports/"+javaUtility.getLocalDateAndTime()+".html";
	
	static final String chromeKey="webdriver.chrome.driver";
	
	static final String chromeValue="./src/main/resources/driver/chromedriver.";
	
}
