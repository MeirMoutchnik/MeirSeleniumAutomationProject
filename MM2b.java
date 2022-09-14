package Automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MM2b {

	@Test
	public void test(WebDriver chr2bDriver) {
		
		WebElement mm2bWebElement = null;
		
		System.out.println("MM2b - test Start");
		
		Assert.assertEquals("MM2b", chr2bDriver.getTitle());
		

		mm2bWebElement = chr2bDriver.findElement(By.xpath("//a[@href='Page 2ba.html']"));
		mm2bWebElement.click();
//		Finding and opening a link to the next page MM2ba  - by x-path
		
		List <WebElement> elements = null;
		elements = chr2bDriver.findElements(By.xpath("//a[@href='Page 1.html']"));
//		Finding multiple elements - links to home page
		int numOfElements = elements.size();
//		Creating integer that denotes number of those elements 
		System.out.println("There are" + " " + numOfElements + " " + "links to home page on this page");
//		Printing that number
		
		System.out.println();
		
	}

}
