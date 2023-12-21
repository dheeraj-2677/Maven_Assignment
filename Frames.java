public class Frames {
	public static void main(String[] args) {
		// TODO auto generated method stubs
		
		
		WebdriverManager Chromedriver;
		
		WebdriverManager.edgedriver().setup();
		
		WebdriverManager.firefoxdriver().setup();
		
		EdgeDriver edgeDriver = new EdgeDriver();
		
		edgeDriver.manage().windows().maximize();
		
		edgeDriver.get("http://www.google.com");
		
		webDriver driver = new  ChromeDriver();
		
		driver.manage().windows().maximize();
		
		driver.ge("http://www.google.com/");
		
		FirefoxDriver firefoxdriver = new Firefoxdriver();
		
        driver.manage().windows().maximize();
		
		firefoxDriver.get("http://www.google.com/");
		
		driver.quit();
	}
}