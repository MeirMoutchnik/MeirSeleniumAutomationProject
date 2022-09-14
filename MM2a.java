package Automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MM2a {

	@Test
	public void test(WebDriver chr2aDriver) {
		
		WebElement mm2aWebElement = null;
		
		System.out.println("MM2a - test Start");
		
		Assert.assertEquals("MM2a", chr2aDriver.getTitle());
		
		mm2aWebElement = chr2aDriver.findElement(By.xpath("//a[@href='Page 2ag.html']"));
		mm2aWebElement.click();
//		Finding and opening a link to the next page MM2ag  - by x-path		
		
		List <WebElement> elements = null;
		elements = chr2aDriver.findElements(By.linkText("title"));
//		Finding multiple elements by the text of the links - back to the top of the page
		int numOfElements = elements.size();
//		Creating integer that denotes number of elements that were found
		System.out.println("There are" + " " + numOfElements + " " + "links to the top of this page");
//		Printing that number
	
		System.out.println();
	
		
	
		
		
		
	}

}
