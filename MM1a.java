package Automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MM1a {

	@Test
	public void test(WebDriver chr1aDriver) {
		
//		Creating Web Driver for page 1a - "chr1a etc"
		
		WebElement mm1aWebElement = null;
//		Creating Web Element for MM1a page - "mm1a etc"
		
		System.out.println("MM1a - test Start");
		
		mm1aWebElement = chr1aDriver.findElement(By.linkText("Check them out!"));
		mm1aWebElement.click();

		Assert.assertEquals("MM1a", chr1aDriver.getTitle());
		
/*		Finding the link to the next MM1a page on MM1 page - by link text
		and clicking it, arriving at MM1a page */
		
		
		List <WebElement> elements = null;
		elements = chr1aDriver.findElements(By.tagName("img"));
//		Finding multiple elements - embedded videos
		int numOfElements = elements.size();
//		Creating integer that denotes number of those elements 
		System.out.println("There are" + " " + numOfElements + " " + "pictures embedded on this page");
//		Printing that number
		
		
		elements = chr1aDriver.findElements(By.linkText("Have you had a chance to explore them?"));
//		Finding multiple elements - links opening the next pages of the site - by their link text
		numOfElements = elements.size();
//		Creating integer that denotes number of those links 
		System.out.println("There are" + " " + numOfElements + " " + "links to the next pages");
//		Printing that number
		elements.get(3).click();				
//		Opening the 4th one of those links
		
		System.out.println();
	}

}
