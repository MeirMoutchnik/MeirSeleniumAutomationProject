package Automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MM1c {

	@Test
	public void test(WebDriver chr1cDriver) {
		
		WebElement mm1cWebElement = null;
		
		System.out.println("MM1c - test Start");
		
		Assert.assertEquals("MM1c", chr1cDriver.getTitle());
		

		List <WebElement> elements = null;
		elements = chr1cDriver.findElements(By.linkText("Have you had a chance to explore them?"));
//		Finding multiple elements - links opening the next pages of the site - by their link text
		int numOfElements = elements.size();
//		Creating integer that denotes number of those links 
		System.out.println("There are" + " " + numOfElements + " " + "links to the next pages on this page");
//		Printing that number
		elements.get(1).click();				
//		Clicking on the 2nd one of those links testing that it opens		
		
		System.out.println();
	}

}
