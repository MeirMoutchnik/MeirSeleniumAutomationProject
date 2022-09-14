package Automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablesPlay {

	@Test
	public void test(WebDriver chrtpDriver) {
			
			WebElement tpWebElement = null;
			
			System.out.println("Tables Play - test Start");
			
			Assert.assertEquals("TP", chrtpDriver.getTitle());
			
			
			List <WebElement> elements = null;
			elements = chrtpDriver.findElements(By.tagName("table"));
//			Finding multiple elements - tables
			int numOfElements = elements.size();
//			Creating integer that denotes number of those elements 
			System.out.println("There are" + " " + numOfElements + " " + "tables on this page");
//			Printing that number	
			
			elements = chrtpDriver.findElements(By.tagName("tr"));
			numOfElements = elements.size();
			System.out.print("Altogether these tables contain" + " " + numOfElements + " " + "rows" + " ");
			elements = chrtpDriver.findElements(By.tagName("td"));
			numOfElements = elements.size();
			System.out.println("and" + " " + numOfElements + " " + "data cells");
//			Finding and printing number	of roes and columns - IN ONE ROW (without 'ln')
			System.out.println("Wow, that's a lot! Or is it?:)");
			
			
			elements = chrtpDriver.findElements(By.tagName("table"));
			numOfElements = elements.size();
			System.out.println("These are the name and contents of the 4th table:");
			System.out.println();
			System.out.println(elements.get(3).getText());
			System.out.println();
	//		Printing out the contents of the 4th table, with breaks before and after
			
			
			
			
		
		
	}

}
