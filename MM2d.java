package Automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MM2d {

	@Test
	public void test(WebDriver chr2dDriver) {
		
		WebElement mm2dWebElement = null;
		
		System.out.println("MM2d - test Start");
		
		Assert.assertEquals("MM2d", chr2dDriver.getTitle());
		
		
		
		List <WebElement> elements = null;
		elements = chr2dDriver.findElements(By.linkText("Have you had a chance to explore them?"));
//		Finding multiple elements - links opening the next pages of the site - by their link text
		int numOfElements = elements.size();
//		Creating integer that denotes number of those links 
		System.out.println("There are" + " " + numOfElements + " " + "links to the next pages");
//		Printing that number
		for(int i=0; i<elements.size(); i++) {
			elements.get(i).click();
			}
//		Clicking on those links opening pages using a loop - testing that they all open
		System.out.println("Now I have opened them all to test that it works!");
		System.out.println();
	}

	}
