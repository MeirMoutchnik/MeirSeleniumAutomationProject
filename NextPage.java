package Automation;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextPage {

	@Test
	public void test(WebDriver chrDriver) {
		
//		Creating Web Driver for this page
		
		WebElement nextWebElement = null;
		
//		Creating Web Element for this page
		
		System.out.println("NextPage - test Start");
		
//		Testing this Page
		
		nextWebElement = chrDriver.findElement(By.name("nextPage"));
		nextWebElement.click();
/*		Finding the link to the Next Page on the Home page
		and clicking it, arriving at the Next Page */
		
		Assert.assertEquals("Error in Title", "Next Page", chrDriver.getTitle());
//		Testing the Title 
		
		nextWebElement = chrDriver.findElement(By.tagName("button"));
		nextWebElement.click();
//		Finding the button to change the Title and clicking on it
				
		Assert.assertEquals("Error in Title", "Finish", chrDriver.getTitle());
//		Confirming that the title has changed
		
		System.out.println("Only changed the title here:)");
		
		System.out.println();
//		Making a break before testing the next page - for the console text to be neat
		
		
	}

}
