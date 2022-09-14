package Automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MM1b {

	@Test
	public void test(WebDriver chr1bDriver) {
		
		WebElement mm1bWebElement = null;
		
		mm1bWebElement = chr1bDriver.findElement(By.linkText("Explore them!"));
		mm1bWebElement.click();
		
		System.out.println("MM1b - test Start");
		
		Assert.assertEquals("MM1b", chr1bDriver.getTitle());
		
		mm1bWebElement = chr1bDriver.findElement(By.xpath("//a[@href='Page 1bb.html']"));
		mm1bWebElement.click();
/*		Finding the link to the next MM1bb page on MM1b page - by x-path
		and clicking it, arriving at MM1bb page */
		
		List <WebElement> elements = null;
		elements = chr1bDriver.findElements(By.tagName("h3"));
//		Finding multiple elements by name "h3" - headings 3
		int numOfElements = elements.size();
//		Creating integer that denotes number of elements that were found
		System.out.println("There is" + " " + numOfElements + " " + "headings 'h3' on this page");
//		Printing that number
		System.out.println("Those headings are:");
		for(int i=0; i<elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}
//		A loop to get and print out all the texts of h3, starting from the 1st (that is, 0).
		
		System.out.println();
		

	}

}
