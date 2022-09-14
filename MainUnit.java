package Automation;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainUnit {
	
	public static WebDriver chDriver = null;
//	public static WebDriver ffDriver = null;//
	
	
	
	@BeforeClass
	
	public static void beforeTest () {
		System.out.println("Before test - Start");
		
//		running the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moutc\\Documents\\QA\\Jar\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver.driver", "C:\\Users\\moutc\\Documents\\QA\\Jar\\geckodriver.exe");
		
		chDriver = new ChromeDriver();
//		ffDriver = new FirefoxDriver ()://
		chDriver.manage().window().maximize();
//		Making the driver open the browser full screen. (Function that runs another function that runs another f.)
		
		
	}
	
	@Test
	public void test() {
		System.out.println("MainUnit Test - Start");
	
	
		chDriver.get("file:///C:/Users/moutc/Documents/QA/Jar/HTML_Project.html");
//		Opening the web page that we are testing through chromeDriver
		HomePage hp = new HomePage();
//		Creating object of type "HomePage"
		hp.test(chDriver);
//		Creating function to test HomePage with ChromeDriver
		
		
		chDriver.get("file:///C:/Users/moutc/Documents/QA/Jar/HTML_Project.html");
//		Making sure we're back on the web page that we tested through chromeDriver
		NextPage np = new NextPage();
//		Creating object of type "NextPage" for testing the next page of the site
		np.test(chDriver);
//		Creating function to test NextPage with ChromeDriver
		
			
		chDriver.get("file:///C:/Users/moutc/Desktop/QA/Page 1.html");
//	    Opening the 1st web page of my site
		MM1 mm1 = new MM1();
//		Creating object of type "MM1" for testing the 1st page of my site
		mm1.test(chDriver);
//		Creating function to test MM1 page with ChromeDriver
		
		
		chDriver.get("file:///C:/Users/moutc/Desktop/QA/Page 1.html");
//	    Making sure we're on the 1st web page of my site
		MM1a mm1a = new MM1a();
//		Creating object of type "MM1a" for testing the next page of my site
		mm1a.test(chDriver);
//		Creating function to test MM1a page with ChromeDriver
		
		
		chDriver.get("file:///C:/Users/moutc/Desktop/QA/Page 1aa.html");
//	    Opening the next page of my site
		MM1aa mm1aa = new MM1aa();
//		Creating object of type "MM1aa" for testing the next page of my site
		mm1aa.test(chDriver);
//		Creating function to test MM1aa page with ChromeDriver
		
		
		chDriver.get("file:///C:/Users/moutc/Desktop/QA/Page 1.html");
		MM1b mm1b = new MM1b();
		mm1b.test(chDriver);
		
		
		chDriver.get("file:///C:/Users/moutc/Desktop/QA/Page 1c.html");
		MM1c mm1c = new MM1c();
		mm1c.test(chDriver);
		
		
		chDriver.get("file:///C:/Users/moutc/Desktop/QA/Page 2a.html");
		MM2a mm2a = new MM2a();
		mm2a.test(chDriver);
		
		
		chDriver.get("file:///C:/Users/moutc/Desktop/QA/Page 2b.html");
		MM2b mm2b = new MM2b();
		mm2b.test(chDriver);
		
		
		chDriver.get("file:///C:/Users/moutc/Desktop/QA/Page 2c.html");
		MM2c mm2c = new MM2c();
		mm2c.test(chDriver);
		
		
		chDriver.get("file:///C:/Users/moutc/Desktop/QA/Page 2d.html");
		MM2d mm2d = new MM2d();
		mm2d.test(chDriver);
	
				
		chDriver.get("file:///C:/Users/moutc/Desktop/QA/Tables Play.html");
		TablesPlay tp = new TablesPlay();
		tp.test(chDriver);
		
		
		chDriver.get("file:///C:/Users/moutc/Desktop/QA/Page 3.html");
		MM3 mm3 = new MM3();
		mm3.test(chDriver);
	
		
	}

	@AfterClass
	public static void afterTest() {
//		chDriver.quit()
//		chDriver.close();
//		chDriver.navigate().back();
//		chDriver.navigate().forward();
		chDriver.navigate().to("file:///C:/Users/moutc/Desktop/QA/Tables Play.html");
//		Navigating to a particular page that I want to remain open at the end 
		
//		chDriver.navigate().refresh();
		
	}
	
}
